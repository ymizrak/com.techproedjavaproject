package com.techproedpackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day2Review {
    public static void main(String[] args) {
        //1. Create a class : Day2Review
        //2. ChromeDriver kullanarak, youtube web sayfasına gidin ve sayfa başlığının “youtube” olup olmadığını doğrulayın(verify), eğer değilse doğru başlığı(Actual Title) konsolda yazdirin.
        //3. Sayfa URL'sinin “youtube” içerip içermediğini(contains) doğrulayın, içermiyorsa doğru URL'yi yazdırın.
        //4. Daha sonra Navigate to https://www.amazon.com/
        //5. Navigate back to youtube
        //6. Refresh the page
        //7. Navigate forward to amazon
        //8. Maximize the window
        //9. Ardından sayfa başlığının "Amazon" içerip içermediğini(contains) doğrulayın, Yoksa doğru başlığı(Actual Title) yazdırın.
        //10.Sayfa URL'sinin https://www.amazon.com/ olup olmadığını doğrulayın, degilse doğru URL'yi yazdırın
        //11.Quit the browser

        System.setProperty("webdriver.chrome.driver","/Users/yakupmizrak/Documents/Selenyum dependencies/drivers/chromedriver") ;
        WebDriver driver = new ChromeDriver();
        //2. ChromeDriver kullanarak, youtube web sayfasına gidin ve
        driver.get("https://www.youtube.com/");
//        sayfa başlığının “youtube” olup olmadığını doğrulayın(verify), eğer değilse doğru başlığı(Actual Title) konsolda yazdirin.
        String actualYoutubeTitle = driver.getTitle();
        String expectedYoutubeTitle = "youtube";
        if(actualYoutubeTitle.equals(expectedYoutubeTitle)){
            System.out.println("PASS");
        }else {
            System.out.println("FAIL");
            System.out.println("ACTUAL YOUTUBE TITLE : "+actualYoutubeTitle);
            System.out.println("EXPECTED YOUTUBE TITLE : "+expectedYoutubeTitle);
        }
//        3. Sayfa URL'sinin “youtube” içerip içermediğini(contains) doğrulayın, içermiyorsa doğru URL'yi yazdırın.
        String actualYoutubeURL = driver.getCurrentUrl();
        String expectedYoutubeURL = "youtube";
        if(actualYoutubeURL.contains(expectedYoutubeURL)){
            System.out.println("PASS");
        }else{
            System.out.println("FAIL");
            System.out.println("ACTUAL YOUTUBE URL : "+actualYoutubeURL);
        }
//        4. Daha sonra Navigate to https://www.amazon.com/
        driver.navigate().to("https://www.amazon.com/");
//        5. Navigate back to youtube
        driver.navigate().back();
//        6. Refresh the page
        driver.navigate().refresh();
//        7. Navigate forward to amazon
        driver.navigate().forward();
//        8. Maximize the window
        driver.manage().window().maximize();
//        9. Ardından sayfa başlığının "Amazon" içerip içermediğini(contains) doğrulayın, Yoksa doğru başlığı(Actual Title) yazdırın.
        String actualAmazonTitle = driver.getTitle();
        String expectedAmazonTitle = "Amazon";
        if(actualAmazonTitle.contains(expectedAmazonTitle)){
            System.out.println("PASS");
        }else{
            System.out.println("FAIL");
            System.out.println("ACTUAL AMAZON TITLE : "+actualAmazonTitle);
        }
//        10.Sayfa URL'sinin https://www.amazon.com/ olup olmadığını doğrulayın, degilse doğru URL'yi yazdırın
        String actualAmazonURL = driver.getCurrentUrl();
        String expectedAmazonURL = "https://www.amazon.com/";
        if(actualAmazonURL.equals(expectedAmazonURL)){
            System.out.println("PASS");
        }else {
            System.out.println("FAIL");
            System.out.println("ACTUAL AMAZON URL : "+actualAmazonURL);
        }
//        11.Quit the browser
        driver.quit();
    }
}
