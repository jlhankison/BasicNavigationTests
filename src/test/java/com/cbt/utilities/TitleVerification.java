package com.cbt.utilities;

import org.openqa.selenium.WebDriver;


import java.util.Arrays;
import java.util.List;

public class TitleVerification {

    public static void main(String[] args) {

        List<String> urls = Arrays.asList("http://practice.cybertekschool.com/", "http://practice.cybertekschool.com/dropdown", "http://practice.cybertekschool.com/login");
        String title;
        WebDriver driver = BrowserFactory.getDriver("chrome");

        driver.get(urls.get(0));
        title = driver.getTitle();

        for ( int i = 0; i < urls.size(); i++ ) {
            driver.navigate().to(urls.get(i));
            if(!driver.getTitle().equals(title)) {
                System.out.println("FAIL");
                System.out.println("All WebPage titles not equal");
                System.out.println("Failed at urls index" + i);
                break;
            }else if(!driver.getCurrentUrl().startsWith("http://practice.cybertekschool.com")){
                System.out.println("FAIL");
                System.out.println("All WebPage URLs do not start with - \"http://practice.cybertekschool.com\"");
                System.out.println("Failed at urls index" + i);
                break;
            }
            if(i == urls.size()-1){
                System.out.println("PASS");
            }
        }


        driver.quit();
    }
}
