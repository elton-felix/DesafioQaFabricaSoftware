import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class PageObjectDesafio {
    private  WebDriver driver;

    public PageObjectDesafio(WebDriver driver){
        this.driver = driver;
    }
    public void writeUserName(String name){ //escrevendo campo name
        driver.findElement(By.name("username")).sendKeys(name);
    }
    public void writePassword(String password){//escrevendo campo password
        driver.findElement(By.name("password")).sendKeys(password);
    }
    public void writeComments(String writing){//escrevendo campo comments
        driver.findElement(By.name("comments")).sendKeys(writing);//limpando o campo comments
    }
    public void cleaningUpComments(){//limpando campo comments
        driver.findElement(By.name("comments")).clear();
    }
    public void interactingCheckBox3(){//interagindo com checkBox 3
        driver.findElement(By.xpath("//*[@id=\"HTMLFormElements\"]/table/tbody/tr[5]/td/input[3]")).click();
    }
    public void interactingCheckBox1(){// interagindo com checkBox 1
        driver.findElement(By.xpath("//*[@id=\"HTMLFormElements\"]/table/tbody/tr[5]/td/input[1]")).click();
    }
    public void interactingRadio1(){// interagindo com radio 1
        driver.findElement(By.xpath("//*[@id=\"HTMLFormElements\"]/table/tbody/tr[6]/td/input[1]")).click();
    }
    public void interactingSelectValues4(){// interagindo com select values 4
        driver.findElement(By.xpath("//*[@id=\"HTMLFormElements\"]/table/tbody/tr[7]/td/select/option[4]")).click();
    }
    public void interactingSelectValues2(){// interagindo com Select Values 2
        driver.findElement(By.xpath("//*[@id=\"HTMLFormElements\"]/table/tbody/tr[7]/td/select/option[2]")).click();
    }
    public void interactingDropdown3(){// interagindo com dropdown 3
        driver.findElement(By.xpath("//*[@id=\"HTMLFormElements\"]/table/tbody/tr[8]/td/select/option[3]")).click();
    }
    public void submit(){//dando submit na pagina
        driver.findElement(By.xpath("//*[@id=\"HTMLFormElements\"]/table/tbody/tr[9]/td/input[2]")).click();
    }

    public String getUserName(){//retornando texto do campo name
        return driver.findElement(By.id("_valueusername")).getText();
    }
    public String getPassword(){// retornando texto do campo password
       return  driver.findElement(By.id("_valuepassword")).getText();
    }
    public String getComments(){//retornando text do campo comments
       return driver.findElement(By.id("_valuecomments")).getText();
    }
    public String getUserNameNoValue(){//retornando texto do campo name(não inserido pelo usuario)
        return driver.findElement(By.xpath("/html/body/div/div[3]/p[1]/strong")).getText();
    }
    public String getPasswordNoValue(){// retornando texto do campo password (não inserido pelo usuario)
        return  driver.findElement(By.xpath("/html/body/div/div[3]/p[2]/strong")).getText();
    }
    public String getCommentsNoValue(){//retornando texto do campo comments(não inserido pelo usuario)
        return driver.findElement(By.xpath("/html/body/div/div[3]/p[3]/strong")).getText();
    }
    public String getCheckBox(){//retornando texto do campo checkBox
       return driver.findElement(By.id("_valuecheckboxes0")).getText();
    }
    public String getRadioItems(){//retornando texto do campo radioIntems
        return driver.findElement(By.id("_valueradioval")).getText();
    }
    public String getSelectValues(){//retornando texto do campo selectValues
        return driver.findElement(By.id("_valuemultipleselect0")).getText();
    }
    public String getDropdowns(){//retornando texto do campo dropdowns
        return driver.findElement(By.id("_valuedropdown")).getText();
    }

}
