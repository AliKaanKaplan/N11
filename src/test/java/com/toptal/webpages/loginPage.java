package com.toptal.webpages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;
import java.util.Set;

public class loginPage {
    private WebDriver driver;

  @FindBy(xpath = "//*[@class=\"facebook_large medium facebookBtn  btnLogin\"]")
  private WebElement facebookLogin;

  @FindBy(xpath = "//*[@id=\"email\"]")
  private WebElement facebookMailBtn;

  @FindBy(xpath = "//*[@id=\"pass\"]")
    private WebElement facebookPassword;

  @FindBy(xpath = "//*[@name=\"login\"]")
  private WebElement facebookLoginBtn;

  @FindBy(xpath = "//*[@class=\"logo  home \"]")
  private WebElement logo;

    //Constructor
    public loginPage (WebDriver driver){
        this.driver=driver;

        //Initialise Elements
        PageFactory.initElements(driver, this);
    }
    public  void facebookIleGirisYap() throws InterruptedException {
        homePage homePage = new homePage(driver);
        homePage.closeHomePagePopUp();
        homePage.enterLoginPage();
        Thread.sleep(4000);
        facebookLogin.click();
        Thread.sleep(6000);
        System.out.println("Parent Window Title "+driver.getTitle());
        for(String handle:driver.getWindowHandles())
        {
            driver.switchTo().window(handle);
        }
        facebookMailBtn.sendKeys("optimdeneme@gmail.com");
        facebookPassword.sendKeys("a1b2c3d4");
        facebookLoginBtn.click();
        for(String handle:driver.getWindowHandles())
        {
            driver.switchTo().window(handle);
            break;
        }
        Thread.sleep(4000);
        logo.click();

    }
}
