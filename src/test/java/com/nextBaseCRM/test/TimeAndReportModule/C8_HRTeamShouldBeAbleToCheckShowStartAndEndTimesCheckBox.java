package com.nextBaseCRM.test.TimeAndReportModule;

import com.nextBaseCRM.utility.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class C8_HRTeamShouldBeAbleToCheckShowStartAndEndTimesCheckBox {
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

        Thread.sleep(2000);
        //5- Action: Click on the "Worktime" tab located on the top right of the page next to the "Absence Chart" tab
        driver.findElement(By.linkText("Worktime")).click();
        //5- ER: User is able to land on the "Worktime Summery" and see the "Statistics" check box located on the top right side of the page

        Thread.sleep(2000);
        //6- Action: Click the check box "Show start and end times"
        driver.findElement(By.xpath("//*[@name='additional']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@name='additional']")).click();
        //6- ER: User should be able to check and uncheck the "Show start and end times" box


        Thread.sleep(5000);
        driver.close();


    }
}
