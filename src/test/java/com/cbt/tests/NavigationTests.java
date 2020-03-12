package com.cbt.tests;

import com.cbt.utilities.BrowserFactory;
import com.cbt.utilities.StringUtility;
import org.openqa.selenium.WebDriver;

public class NavigationTests {

    public static void main(String[] args) {

        testChrome();
        testFirefox();
        testEdge();
    }

    public static void testChrome(){

        String s1;
        String s2;

        WebDriver driver = BrowserFactory.getDriver("chrome");

        driver.get("https://google.com");
        s1 = driver.getTitle();

        driver.navigate().to("https://etsy.com");
        s2 = driver.getTitle();

        driver.navigate().back();
        StringUtility.verifyEquals(s1, driver.getTitle());

        driver.navigate().forward();
        StringUtility.verifyEquals(s2, driver.getTitle());

        driver.quit();
    }

    public static void testFirefox(){

        String s1;
        String s2;

        WebDriver driver = BrowserFactory.getDriver("firefox");

        driver.get("https://google.com");
        s1 = driver.getTitle();

        driver.navigate().to("https://etsy.com");
        s2 = driver.getTitle();

        driver.navigate().back();
        StringUtility.verifyEquals(s1, driver.getTitle());

        driver.navigate().forward();
        StringUtility.verifyEquals(s2, driver.getTitle());

        driver.quit();
    }

    public static void testEdge(){

        String s1;
        String s2;

        WebDriver driver = BrowserFactory.getDriver("edge");

        driver.get("https://google.com");
        s1 = driver.getTitle();

        driver.navigate().to("https://etsy.com");
        s2 = driver.getTitle();

        driver.navigate().back();
        StringUtility.verifyEquals(s1, driver.getTitle());

        driver.navigate().forward();
        StringUtility.verifyEquals(s2, driver.getTitle());

        driver.quit();
    }
}
