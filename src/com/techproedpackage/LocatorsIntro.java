package com.techproedpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorsIntro {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "/Users/yakupmizrak/Documents/Selenyum dependencies/drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("http://a.testaddressbook.com/sign_in");
        //email textbox,password textbox, and signin button elementlerini locate ediniz..
        //email text box locate
        //Username :  testtechproed@gmail.com
        WebElement emailTextBox = driver.findElement(By.id("session_email"));
        emailTextBox.sendKeys("testtechproed@gmail.com");  //sendKeys("....");  texti text boxa gonderir.
        //password text box locate
        //Password : Test1234!
        WebElement passwordTextBox = driver.findElement(By.id("session_password"));
        passwordTextBox.sendKeys("Test1234!");
        //sign in button locate
        WebElement signinButton = driver.findElement(By.name("commit"));
        signinButton.click();
        driver.manage().window().maximize();
        //Expected user id nin testtechproed@gmail.com  oldugunu dogrulayin(verify).
        WebElement userID = driver.findElement(By.className("navbar-text"));
        //System.out.println("USER ID WEBELEMENT => "+userID);
        //System.out.println("USER ID TEXT => "+userID.getText()); //getText(); metodu elementin gorune metnini verir. String return eder.
        String actualUserID = userID.getText();
        String expectedUserID = "testtechproed@gmail.com";
        if (actualUserID.equals(expectedUserID)) {
            System.out.println("PASS");
        } else {
            System.out.println("FAIL");
            System.out.println("ACTUAL USER ID : " + actualUserID);
            System.out.println("EXPECTED USER ID : " + expectedUserID);
        }
        //“Addresses”  textlerinin görüntülendiğini( displayed) doğrulayin(verify).
        //By.linkText(); sadece linkler icin kullanilir.
        WebElement addressLink = driver.findElement(By.linkText("Addresses"));
        String actualAddressLinkText = addressLink.getText();
        String expectedAddressLinkText = "Addresses";
        if (actualAddressLinkText.equals(expectedAddressLinkText)) {
            System.out.println("PASS");
        } else {
            System.out.println("FAIL");
        }
        //"Sign Out" textlerinin goruntulendigini (displayed) dogrulayin (verify)

        WebElement signOutLink = driver.findElement(By.linkText("Sign out"));
        String actualSignOutLink = signOutLink.getText();
        String expectedSignOutLink = "Sign Out";

        if (actualSignOutLink.equals(expectedSignOutLink)) {
            System.out.println("PASS");
        } else {
            System.out.println("FAIL");
            System.out.println("EXTECTED SIGN OUT TEXT");
        }
    }
}

