package com.toptal.tests;

import com.toptal.webpages.facebookAutPage;
import com.toptal.webpages.loginPage;

import com.toptal.webpages.productPage;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import com.toptal.webpages.homePage;

public class addingFavoriteControl {
    public static WebDriver driver;

    @Before
    public void setup(){

        String baseUrl = "https://www.n11.com/ ";
        System.setProperty("webdriver.chrome.driver","src/main/resources/chromedriver");
        ChromeOptions options = new ChromeOptions();
        driver = new ChromeDriver(options);
        driver.manage().window().maximize();
        driver.get(baseUrl);

    }

    @Test
    public void login() throws InterruptedException {
        loginPage loginPage =new loginPage(driver);
        homePage homePage = new homePage(driver);
        productPage productPage = new productPage(driver);

        loginPage.facebookIleGirisYap();
        homePage.HomePageControl();
        homePage.search("samsung");
        homePage.secontPage();
        homePage.selectThirtResult();
        productPage.addBasket();
        productPage.goBasket();
        productPage.deleteProduck();
    }

    @After
    public void close(){
        driver.close();
    }
}

