package com.toptal.webpages;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
public class productPage {
    private WebDriver driver;

  @FindBy(xpath = "//*[@class=\"button-group\"]//*[@title=\"Sepete Ekle\"]")
  private WebElement addBasketBtn;

  @FindBy(xpath = "//*[@class=\"hMenu\"]//*[@class=\"icon iconBasket\"]")
  private WebElement basket;

  @FindBy(xpath = "//*[@class=\"closeBtn\"]")
  private WebElement popUpClose;

  @FindBy(xpath = "//*[@title=\"Sil\"]")
  private WebElement deleteBtn;

  @FindBy(xpath = "//*[@class=\"prodDetail\"]")
  private WebElement basketCheck;

  @FindBy(
      css = ".fancybox-segmentify > span,::before")
  private WebElement addPopUp;

    //Constructor
    public productPage (WebDriver driver){
        this.driver=driver;

        //Initialise Elements
        PageFactory.initElements(driver, this);

    }
    public void addBasket() throws InterruptedException {
        Thread.sleep(2000);
    addBasketBtn.click();
        Thread.sleep(2000);

        try{
            addPopUp.click();
        }catch (Exception e){

        }
    }
    public void goBasket(){
        basket.click();
        try{
            addPopUp.click();
        }catch (Exception e){

        }
        popUpClose.click();
        Assert.assertTrue("Sepette Urun bulunmamaktadır",basketCheck.isDisplayed());
    }
    public void deleteProduck() throws InterruptedException {
        deleteBtn.click();
        Thread.sleep(1000);
        try{
            basketCheck.isEnabled();
            Assert.fail("Urun silinemedi");
        }catch (Exception e){
      System.out.println("ürün başarı ile silindi");
        }

    }
}
