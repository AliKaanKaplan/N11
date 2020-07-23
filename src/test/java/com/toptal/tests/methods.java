package com.toptal.tests;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import com.toptal.tests.addingFavoriteControl;
public class methods {
    WebDriver driver=addingFavoriteControl.driver;
    WebDriverWait wait = new WebDriverWait(driver,10);


//    public WebElement findElementByKey(String key){
//        WebElement element=null;
//        try{
//            wait.until(ExpectedConditions.elementToBeClickable(By.xpath((key))));
//            element=driver.findElement(By.xpath((key)));
//        }catch (Exception e){
//            Assert.fail(key+" Elementi sayfada bulunamadı");
//        }
//        return element;
//    }

}