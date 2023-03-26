package org.example.File;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Path {

    @FindBy (xpath ="//*[@id=\"globalnav-list\"]/li[2]/div/div/div[2]/ul/li[1]/a/span[1]")
    WebElement MacBook;
    @FindBy (xpath = "//*[@id=\"chapternav\"]/div/ul/li[1]/a/figure")
    WebElement MacbookAir;
    @FindBy (xpath = "//*[@id=\"main\"]/section[1]/div/div[1]/div/h1")
     WebElement Logo;


    public String mac()
    {
        MacBook.click();
        MacbookAir.click();
      String LOGO = Logo.getText();
      return LOGO;
    }



}
