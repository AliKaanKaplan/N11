package com.toptal.webpages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class homePage {
    private WebDriver driver;

    //Page URL
    private static String PAGE_URL="https://www.hepsiburada.com/";

    //Apply as Developer Button
    @FindBy(how = How.ID, using = "txtUserName")
    private WebElement username;

    @FindBy(how = How.NAME, using = "btnLogin")
    private WebElement button;

    //Constructor
    public homePage(WebDriver driver){
        this.driver=driver;
        driver.get(PAGE_URL);
        //Initialise Elements
        PageFactory.initElements(driver, this);
    }



    public void typeUserName(){
        username.sendKeys("emailadrress");
    }

    public void submitButton(){
        button.click();
    }
}