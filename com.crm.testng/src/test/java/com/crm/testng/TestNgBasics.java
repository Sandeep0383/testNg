package com.crm.testng;

import org.testng.annotations.*;

  //*@BeforeMethod
  //*@Test-1
  //*@AfterMethod

  //*@BeforeMethod
  //*@Test-2
  //*@AfterMethod

  //*@BeforeMethod
  //*@Test-3
  //*@AfterMethod


    public class TestNgBasics {

    //PRE CONDITION ANNOTATIONS----STARTING WITH @Before
    @BeforeSuite
    public void setup(){
        System.out.printf("set up system property for chrome");
    }
    @BeforeClass
    public void LaunchBrowser(){
        System.out.println("Launch Chrome Browser");
    }
    @BeforeTest
    public void login(){
        System.out.println("login to app");
    }
    @BeforeMethod
    public void entreURL(){
        System.out.println("Entre URL");
    }

    //TEST CASES----STARTING WITH @Test
    @Test
    public void googletitletest(){
        System.out.println("Google Title Test");
    }
    @Test
    public void searchtest(){
        System.out.println("search test");
    }
    @Test
    public void googlelogotest(){
        System.out.println("Google Logo Test");
    }

    //POST CONDITIONS ------ STARTING WITH @After
    @AfterMethod
    public void logout(){
        System.out.println("Log out from the application");
    }
    @AfterTest
    public void deleteallCookies(){
        System.out.println("Delete all Cookies");
    }
    @AfterClass
    public void closebrowser(){
        System.out.println("Close Browser");
    }
    @AfterSuite
    public void generateTestReport(){
        System.out.println("generate test report");
    }










}
