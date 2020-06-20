package com.techproedpackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day1BasicNavigations {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","/Users/yakupmizrak/Documents/Selenyum dependencies/drivers/chromedriver") ;
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.google.com/");
        driver.navigate().to("https://www.amazon.com/");
        driver.navigate().back(); // icine url yazmamiza gerek yok
        // cunku bir onceki sayfaya gel dedik
        driver.navigate().forward();
        // Bir onceki sayfaya geri geldi. amazaon.com
        driver.navigate().refresh(); // sayfayi yeniler.
        driver.manage().window().maximize(); // tam erkran yapar.
        // fullscreen den farki fullscreen tool bari da saklar.
        Thread.sleep(10000);
        driver.quit();
    }
}
