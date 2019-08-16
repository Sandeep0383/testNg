package com.crm.testng;

import org.testng.annotations.Test;

public class TestNgFeatures {

    @Test
    public void logintest(){
        System.out.println("login test");
        //int i=9/0;
    }
    @Test(dependsOnMethods = "logintest")
    public void HomePageTest(){
        System.out.println("Home Page Test");
    }
    @Test(dependsOnMethods = "logintest")
    public void searchpagetest(){
        System.out.println("search page test");
    }
    @Test(dependsOnMethods = "logintest")
    public void regpagetest(){
        System.out.println("registration page test");
    }

}
