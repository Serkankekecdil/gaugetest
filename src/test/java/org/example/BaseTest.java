package org.example;

import com.google.gson.JsonParser;
import com.thoughtworks.gauge.AfterScenario;
import com.thoughtworks.gauge.BeforeScenario;
import com.thoughtworks.gauge.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import javax.lang.model.element.Element;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class BaseTest {
    protected static WebDriver driver;

    @BeforeScenario
    public void setUp() throws FileNotFoundException {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\testinium\\Selenium\\ChromeDriver\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();


        //JsonParser jsonParser=new JsonParser();
        //FileReader reader =new FileReader("Deneme.json");
        //Object obj =jsonParser.parse(reader);
    }
    /*AfterScenario
    public void tearDown(){
       driver.quit();
    }*/
}
