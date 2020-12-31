package com.nextBaseCRM.utility;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class WebDriverFactory {
    public static void main(String[] args) {

        String browser = "firefox";
        getDriver(browser);


    }

    public static WebDriver getDriver(String browserType) {

        if (browserType.equalsIgnoreCase("chrome")){
            WebDriverManager.chromedriver().setup();
            return  new ChromeDriver();
        }
        else if (browserType.equalsIgnoreCase("firefox")){
            WebDriverManager.firefoxdriver().setup();
            return new FirefoxDriver();
        }
        else if (browserType.equalsIgnoreCase("edge")){
            WebDriverManager.edgedriver().setup();
            return new EdgeDriver();
        }
        else if (browserType.equalsIgnoreCase("ie")) {
            WebDriverManager.iedriver().setup();
            return  new InternetExplorerDriver();
        }
        else {
            System.out.println("Given browser type does not exist, Driver = null");
            return null;
        }

    }
}
