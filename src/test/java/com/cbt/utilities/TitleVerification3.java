package com.cbt.utilities;

import org.openqa.selenium.WebDriver;

import java.util.Arrays;
import java.util.List;

public class TitleVerification3 {

    public static void main(String[] args) {

        List<String> urls = Arrays.asList("https://luluandgeorgia.com", "https://wayfair.com/", "https://walmart.com", "https://westelm.com/");
        WebDriver driver;

        for ( int i = 0; i < urls.size(); i++ ) {

            switch (i){
                case(0):
                    driver = BrowserFactory.getDriver("chrome");
                    break;
                case(1):
                    driver = BrowserFactory.getDriver("edge");
                    break;
                case(2):
                    driver = BrowserFactory.getDriver("firefox");
                    break;
                default:
                    driver = BrowserFactory.getDriver("ie");
            }

            driver.get(urls.get(i));
            String url = driver.getCurrentUrl().replace("https://www.", "").replace(".com/", "");
            String title = driver.getTitle().toLowerCase().replace(" ", "");
            if (!title.contains(url)){
                System.out.println("FAIL");
                System.out.println("url = " + driver.getCurrentUrl());
                System.out.println("title = " + title);
            }else{
                System.out.println("PASS");
            }
            driver.quit();
        }


    }

}
