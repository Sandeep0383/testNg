package freecrmtest.testcases;

import freecrmtest.base.TestBase;
import freecrmtest.pages.HomePage;
import freecrmtest.pages.LoginPage;
import freecrmtest.pages.SignUp;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LoginPageTest extends TestBase {
     LoginPage loginpage;
     HomePage homepage;
     SignUp signUp;

    public LoginPageTest(){
        super();
    }

    @BeforeMethod
    public void setup(){
        initialization();
        loginpage = new LoginPage();
    }
    @Test(priority = 1)
    public void loginpagetitletest(){
        String title =loginpage.validloginpagetitle();
        Assert.assertEquals(title,"CRMPRO - CRM software for customer relationship management, sales, and support.");
    }
    @Test(priority = 2)
    public void crmlogoimagetest(){
       boolean flag = loginpage.validateCRMimage();
       Assert.assertTrue(flag);
    }
    @Test(priority = 3)
    public void clicksignuptest() throws InterruptedException {
        loginpage.clicksignup();
    }
    @Test(priority = 4)
    public void loginTest() throws InterruptedException {
        homepage = loginpage.login(prop.getProperty("username"), prop.getProperty("password"));
    }
    @AfterMethod
    public void teardown(){
        driver.quit();
    }

}
