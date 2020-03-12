package com.cbt.utilities;

import io.github.bonigarcia.wdm.ChromiumDriverManager;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.opera.OperaDriver;
import org.openqa.selenium.safari.SafariDriver;

public class BrowserFactory {

    public static WebDriver getDriver (String browserName){

        switch (browserName.toLowerCase()) {
            case ("chrome"):
                WebDriverManager.chromedriver().setup();
                return new ChromeDriver();
            case ("firefox"):
                WebDriverManager.firefoxdriver().setup();
                return new FirefoxDriver();
            case ("edge"):

                if (System.getProperty("os.name").equalsIgnoreCase("mac")){
                    return null;
                }
                WebDriverManager.edgedriver().setup();
                return new EdgeDriver();
            case ("ie"):
                WebDriverManager.iedriver().setup();
                return new EdgeDriver();
            case ("opera"):
                WebDriverManager.operadriver().setup();
                return new OperaDriver();
            case ("safari"):
                if (System.getProperty("os.name").equalsIgnoreCase("win")){
                return null;
                }
                return new SafariDriver();
            default:
                System.out.println("input does not match any browser type, we created a chrome driver as default");
                WebDriverManager.chromedriver().setup();
                return new ChromeDriver();



        }
    }
}
