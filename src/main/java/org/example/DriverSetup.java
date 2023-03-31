package org.example;

import org.example.File.Path;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import javax.swing.*;
import java.util.Set;
import java.util.concurrent.TimeUnit;

public class DriverSetup {

    public WebDriver driver;

    public void setupDriver(String url) {
        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver");
        driver = new ChromeDriver();
        driver.get(url);


    }

    void Timeout(WebDriver driver) {
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
    }

    void WindowHandle (WebDriver driver)
    {
        Set<String> otherWindows  = driver.getWindowHandles();
        String CurrentWindow = driver.getCurrentUrl();

        for(String x : otherWindows){
            if (x!= CurrentWindow){
                driver.switchTo().window(x);
            }
        }
    }
}