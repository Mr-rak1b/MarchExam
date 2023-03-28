package org.example;

import org.example.File.Path;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import javax.swing.*;

public class DriverSetup {

    public WebDriver driver;

    public void setupDriver(String url) {
        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver");
        driver = new ChromeDriver();
        driver.get(url);


    }

}