package com.next.driver;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;

import java.util.concurrent.TimeUnit;

public class DriverFactory {
    public DriverFactory(){
        PageFactory.initElements(driver,this);
    }
    public static WebDriver driver;

    public void OpenBrowser(String browser){
        switch (browser) {
            case "Chrome":
                WebDriverManager.chromedriver().setup();
                driver = new ChromeDriver();
                break;
            case "Edge":
                WebDriverManager.edgedriver().setup();
                driver = new EdgeDriver();
            default:
                WebDriverManager.firefoxdriver().setup();
                driver = new FirefoxDriver();
                break;
        }
    }
    public void Url(String url){
        driver.get(url);
    }
    public void Maximize(){
        driver.manage().window().maximize();
    }
    public void PageLoadTimeOut() {
        driver.manage().timeouts().pageLoadTimeout(2000, TimeUnit.SECONDS);

    }
    public void ImpWait()
    {
            driver.manage().timeouts().implicitlyWait(2000, TimeUnit.SECONDS);
    }
    public void DeleteAllCookies(){
        driver.manage().deleteAllCookies();
    }
    public void Close()
    {
        driver.quit();
    }
    }

