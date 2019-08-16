package freecrmtest.pages;

import com.sun.org.glassfish.gmbal.NameValue;
import freecrmtest.base.TestBase;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends TestBase {

     //PAGE FACTORY : OR(OBJECT REPOSITORY)

    @FindBy(name="username")
     WebElement username;

    @FindBy(name="password")
    WebElement password;

    @FindBy(xpath="//input[@class='btn btn-small']")
    WebElement loginbtn;

    @FindBy(xpath = "//a[contains(text(),'Sign Up')]")
    WebElement signupbtn;

    @FindBy(xpath = "//a[@class='navbar-brand']//img[@class='img-responsive']")
    WebElement crmlogo;

    //INITIALIZING THE PAGE OBJECTS
    public LoginPage(){
        PageFactory.initElements(driver,this);
    }

    //ACTIONS:
    public String validloginpagetitle(){
        return driver.getTitle();
    }
    public boolean validateCRMimage() {
       return crmlogo.isDisplayed();
    }

    public SignUp clicksignup() throws InterruptedException {
        Thread.sleep(3000);
        signupbtn.click();
        return new SignUp();
    }

    public HomePage login(String un,String pwd) throws InterruptedException {
        username.sendKeys(un);
        password.sendKeys(pwd);
        Thread.sleep(3000);
        loginbtn.click();
        return new HomePage();

    }
}
