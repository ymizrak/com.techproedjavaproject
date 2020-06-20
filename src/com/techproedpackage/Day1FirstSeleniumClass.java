
package com.techproedpackage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day1FirstSeleniumClass {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","/Users/yakupmizrak/Documents/Selenyum dependencies/drivers/chromedriver");
        //driver olusturduk
        WebDriver driver = new ChromeDriver();
        //url'e git
        driver.get("https://www.google.com/");
        driver.get("https://www.google.com/");
    }
}
