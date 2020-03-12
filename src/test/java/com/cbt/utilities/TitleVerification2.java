package com.cbt.utilities;

import org.openqa.selenium.WebDriver;

import java.util.Arrays;
import java.util.List;

public class TitleVerification2 {

    public static void main(String[] args) {

        WebDriver driver = BrowserFactory.getDriver("chrome");
        List<String> urls = Arrays.asList("https://luluandgeorgia.com", "https://wayfair.com/", "https://walmart.com", "https://westelm.com/");
    
        for (String each : urls) {
            driver.get(each);
            String url = driver.getCurrentUrl().replace("https://www.", "").replace(".com/", "");
            String title = driver.getTitle().toLowerCase().replace(" ", "");
            if (!title.contains(url)){
                System.out.println("FAIL");
                System.out.println("url = " + driver.getCurrentUrl());
                System.out.println("title = " + title);
            }else{
                System.out.println("PASS");
            }
        }
        driver.quit();
    
    
    
    }


}

