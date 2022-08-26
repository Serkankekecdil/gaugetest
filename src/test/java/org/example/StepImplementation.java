package org.example;

import com.thoughtworks.gauge.Logger;
import com.thoughtworks.gauge.Step;
import org.openqa.selenium.By;

public class StepImplementation extends BaseTest{


    @Step("<second> Saniye Bekle")
    public void waitElement(int second) throws InterruptedException {
        Thread.sleep(second+1000);
        Logger.info("<second> Saniye beklendi");
    }
    @Step("Css li <element> elemente tikla")
    public void ClickElementByCss(String element){
        driver.findElement(By.cssSelector(element)).click();
        Logger.info("Elemente tiklandi");
    }
    @Step("Css li <element> element bul ve <key> değeri yaz")
    public void SendKeyByCss(String element,String key){
        driver.findElement(By.cssSelector(element)).sendKeys(key);
        Logger.info("Element bulundu ve <key> degeri yazildi");
    }
    @Step("<url> adresine gidilir")
    public void GotoUrl(String url){
        driver.get(url);
        Logger.info("<url> adresine gidildi.");
    }
    @Step("İd li <element> element bul ve <text> yazma")
    public void SearchBoxText(String element,String text){
        driver.findElement(By.id(element)).sendKeys(text);
        Logger.info("Element bulundu ve <text> yazildi");
    }
    @Step("Xpath li <element> elemente tıkla")
    public void XpathElementByCss(String element){
        driver.findElement(By.xpath(element)).click();
        Logger.info("Elemente tiklandi");
    }
    @Step("İd li <element> tikla")
    public void İdElementClick(String element){
        driver.findElement(By.id(element)).click();
        Logger.info("Elemente tiklandi");
    }
}
