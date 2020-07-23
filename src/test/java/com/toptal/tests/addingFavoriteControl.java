package com.toptal.tests;

import com.toptal.webpages.facebookAutPage;
import com.toptal.webpages.loginPage;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;


public class addingFavoriteControl {
    public static WebDriver driver;

    @Before
    public void setup(){

        String baseUrl = "https://www.n11.com/ ";
        System.setProperty("webdriver.chrome.driver","/Users/testinium/Downloads/myprojectaboutoptim/src/main/resources/chromedriver");
        ChromeOptions options = new ChromeOptions();
        driver = new ChromeDriver(options);
        driver.manage().window().maximize();
        driver.get(baseUrl);
    }

    @Test
    public void applyAsDeveloper() {

        //loginPage Inıtialized etme
        loginPage loginPage= new loginPage(driver);

        //Check if page is opened
        Assert.assertTrue(loginPage.isPageOpened());

        //Click on Join Toptal
        loginPage.clikOnJoin();




        //facebookAutPage Inıtialized etme
        facebookAutPage facebookAutPage =new facebookAutPage(driver);

        //Check if page is opened
        Assert.assertTrue(facebookAutPage.isPageOpened());

        //Fill up data
        //facebookAutPage.setDeveloper_email("dejan@toptal.com");
        facebookAutPage.setDeveloper_full_name("Dejan Zivanovic Automated Test");
        facebookAutPage.setDeveloper_password("password123");
        facebookAutPage.setDeveloper_password_confirmation("password123");
        facebookAutPage.setDeveloper_skype("automated_test_skype");

    }

    @After
    public void close(){
        //driver.close();
    }
}

