package com.toptal.webpages;

import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class homePage {
    private WebDriver driver;

    //Page URL
    private static String PAGE_URL="https://www.n11.com/";

  // Apply as Developer Button
  @FindBy(xpath = "//*[@class=\"content\"]//*[@class=\"closeBtn\"]")
  private WebElement PopupCloseBtn;

  @FindBy(xpath = "//*[@class=\"btnSignIn\"]")
  private WebElement loginBtn;

  @FindBy(xpath = "//*[@id=\"searchData\"]")
  private WebElement searchBar;

  @FindBy(xpath = "//*[@class=\"searchBtn\"]")
  private WebElement searchBtn;

  @FindBy(xpath = "//*[@class=\"pagination\"]//*[.='2']")
  private WebElement secontPage;

  @FindBy(xpath = "//*[@class=\"pagination\"]//*[@class=\"active \"]")
  private WebElement secontPageCheck;

  @FindBy(
      xpath =
          "(//*[@id=\"view\"]//*[@class=\"clearfix\"]//*[@class=\"column \"])[3]//*[@class=\"pro\"]//*[@class=\"productName \" or @class=\"productName bold\"]")
  private WebElement produckName;

  @FindBy(
      xpath =
          "(//*[@id=\"view\"]//*[@class=\"clearfix\"]//*[@class=\"column \"])[3]//*[@class=\"pro\"]//*[@class=\"plink\"]")
  private WebElement thirdElement;

    @FindBy(xpath = "")
    private WebElement as;
    @FindBy(xpath = "")
    private WebElement ad;
    @FindBy(xpath = "")
    private WebElement aaa;

    //Constructor
    public homePage(WebDriver driver){
        this.driver=driver;
        driver.get(PAGE_URL);
        //Initialise Elements
        PageFactory.initElements(driver, this);
    }
    public void closeHomePagePopUp(){
        PopupCloseBtn.click();
    }
    public void enterLoginPage(){
        loginBtn.click();
    }
    public void search(String text) throws InterruptedException {
        searchBar.sendKeys(text);
        searchBtn.click();
        Thread.sleep(3000);


    }
    public void HomePageControl(){
        loginBtn.isDisplayed();
    }
    public void secontPage() throws InterruptedException {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,5000)");
        secontPage.click();
        Thread.sleep(2000);
        if(!secontPageCheck.getText().contains("2")){
            System.out.println(produckName.getText());
            Assert.fail("2. Sayfa açılamadı");
        }

    }
    public void selectThirtResult(){
        if(!produckName.getText().contains("Samsung")){
            System.out.println(produckName.getText());
            Assert.fail("sayfada Samsung ürünü bulunamadı");
        }
        thirdElement.click();

    }





}