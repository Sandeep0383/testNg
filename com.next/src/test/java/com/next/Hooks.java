package com.next;

import com.next.driver.DriverFactory;
import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hooks {
    private DriverFactory driverFactory=new DriverFactory();
    @Before
    public void SetUp(){
        driverFactory.OpenBrowser("Chrome");
        driverFactory.Url("https://www.next.co.uk");
        driverFactory.Maximize();
        driverFactory.PageLoadTimeOut();
        driverFactory.ImpWait();
        driverFactory.DeleteAllCookies();
    }
    @After
    public void tearDown()
    {
      //  driverFactory.Close();
    }
}
