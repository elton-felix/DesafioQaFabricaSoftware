import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Desafio {

    private WebDriver driver;
    private PageObjectDesafio page;

    @Before//executar primeiro
    public void bootUp(){//abrindo o driver do google chrome
        WebDriverManager.chromedriver().setup();
        this.driver = new ChromeDriver();
        driver.get("https://testpages.herokuapp.com/styled/basic-html-form-test.html");
        this.page = new PageObjectDesafio(driver);
    }

    @After
    public void finish(){
        driver.quit();//fechando drive , após cada teste
    }


    @Test//o programa reconhece que aq é um text
    public void mainStream(){

        page.writeUserName("EltonFelix");//acessando o campo name e digitando "Eltonfelix"
        page.writePassword("860892");//acessando o campo password e digitando "860892"

        page.cleaningUpComments();//limpando o campo comments
        page.writeComments("simbora pro Desafio!");//inserindo no campo comments

        page.interactingCheckBox3();//desmarcando o terceiro checkBox
        page.interactingCheckBox1();//marcando o primeiro checkBok

        page.interactingRadio1();//marcando o radio 1

        page.interactingSelectValues4();//desmarcando o quarto select values
        page.interactingSelectValues2();//marcando no segundo select values

        page.interactingDropdown3();//clicando no dropdown 3

        page.submit();//clicando no botão submite

        //information validation
        Assert.assertEquals("EltonFelix", page.getUserName()); //campo name
        Assert.assertEquals("860892", page.getPassword());//campo passorwd
        Assert.assertEquals("simbora pro Desafio!", page.getComments());//campo comments
        Assert.assertEquals("cb1", page.getCheckBox());//checkbox items
        Assert.assertEquals("rd1", page.getRadioItems());// campo radio items
        Assert.assertEquals("ms2", page.getSelectValues());// campo select values
        Assert.assertEquals("dd3", page.getDropdowns());//campo dropdown
    }

    @Test
    public void SecondaryFlow(){
        page.cleaningUpComments();//limpando checkBox comments

        page.submit();//clicando no botão submit

        //information validation

        Assert.assertEquals("No Value for username", page.getUserNameNoValue());//validando a falta de user name
        Assert.assertEquals("No Value for password", page.getPasswordNoValue());//validando a falta de password
        Assert.assertEquals("No Value for comments", page.getCommentsNoValue());//validando a falta de comments
    }

}