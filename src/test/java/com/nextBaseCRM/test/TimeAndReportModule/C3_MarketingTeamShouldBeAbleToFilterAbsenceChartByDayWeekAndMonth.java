package com.nextBaseCRM.test.TimeAndReportModule;

import com.nextBaseCRM.utility.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class C3_MarketingTeamShouldBeAbleToFilterAbsenceChartByDayWeekAndMonth {
    public static void main(String[] args) throws InterruptedException {

        //1-Action: Access to nextBaseCRM
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.get("https://login2.nextbasecrm.com/");
        //1-ER: User should be landed on the log in page
        Thread.sleep(2000);
        //2-Action: User enter a valid credentials and click Log In
        driver.findElement(By.xpath("//input[@class='login-inp']")).sendKeys("marketing21@cybertekschool.com");
        driver.findElement(By.xpath("//input[@type='password']")).sendKeys("UserUser");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//input[@type='submit']")).click();
        //2-ER: User should be landed on the home page of the NextBaseCRM website

        //3-Action: Click menu button on the very top-left corner
        driver.findElement(By.xpath("//span[@class='sitemap-menu-lines']")).click();
        //3-ER: User should be able to see all the modules and observe the "Time and Report" on the 5th column

        //4-Action: Click on "Time and Report" module
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@id='sitemap-content']/div[7]/a")).click();
        //4-ER: User should be landed on the "Absence Chart" under the Time and Report module

        Thread.sleep(2000);
        //5-Action: Click the "Day tab" located in the middle right side of the page
        driver.findElement(By.xpath("//*[@id='bx_view_switcher_day']/span[2] ")).click();
        //5-ER: User should be able to see the time break down after clicking the day tab

        Thread.sleep(3000);
        //6- Action: Click the "Week" tab located in middle right side of the page next to the Day tab
        driver.findElement(By.xpath("//*[@id='bx_view_switcher_week']/span[2]")).click();
        //6-ER: User should be able to see the week days break down after clicking the week tab

        Thread.sleep(3000);
        //7- Action: Click on the "Month" tab located in the middle right side of the page next to the Week tab
        driver.findElement(By.xpath("//*[@id='bx_view_switcher_month']/span[2]")).click();
        //7- Er: User should be able to see the days of the month break down after clicking the month tab

        Thread.sleep(5000);
        driver.close();




    }
}
