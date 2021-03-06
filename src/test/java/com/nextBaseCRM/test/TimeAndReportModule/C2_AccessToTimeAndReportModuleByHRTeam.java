package com.nextBaseCRM.test.TimeAndReportModule;

import com.nextBaseCRM.utility.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class C2_AccessToTimeAndReportModuleByHRTeam {
    public static void main(String[] args) throws InterruptedException {

        //1-Action: Access to nextBaseCRM
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.get("https://login2.nextbasecrm.com/");
        //1-ER: User should be landed on the log in page
        Thread.sleep(2000);

        //2-Action: User enter a valid credentials and click Log In
        driver.findElement(By.xpath("//input[@class='login-inp']")).sendKeys("hr21@cybertekschool.com");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//input[@type='password']")).sendKeys("UserUser");
        driver.findElement(By.xpath("//input[@type='submit']")).click();
        //2-ER: User should be landed on the home page of the NextBaseCRM website

        Thread.sleep(2000);

        //3- Action: Click menu button on the very top-left corner
        driver.findElement(By.xpath("//div[@class='sitemap-menu']")).click();
        //3-ER:User should be able to see all the modules and observe the "Time and Report" on the 5th column

        Thread.sleep(2000);
        //4- Action: Click on "Time and Report" module
        driver.findElement(By.xpath("//*[@id='sitemap-content']/div[7]/a")).click();
        //4- ER: User should be landed on the "Absence Chart" under the Time and Report module

        Thread.sleep(5000);
        driver.close();


    }
}
