package org.example.File;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.ArrayList;


public class Path {

    //Testing to see if MacbookAir logo is there
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

    //Testing to see if support option is there
    @FindBy (xpath = "//*[@id=\"ac-globalfooter\"]/div/section[1]/ul/li[12]/a")
    WebElement supportlink;

    public String support()
    {
        String Support = supportlink.getText();
        return Support;
    }


    //Testing to see if the search bar is displayed or not
    @FindBy (xpath = "//*[@id=\"globalnav-menubutton-link-search\"]")
    WebElement Search;

    public boolean search(){
       return Search.isDisplayed();


    }

    //Testing to see if Apple card option is there
    @FindBy(xpath = "/html/body/main/section[3]/div[6]/div/div/div[1]/h4")
    WebElement card;

    public String Card()
    {
       String x = card.getText();
       return x;
    }

    //Test to see if get support Start now is visible
    @FindBy (xpath = "//*[@id=\"globalnav-list\"]/li[2]/div/div/div[10]/ul/li[1]/a/span[1]")
    WebElement Supporttest;
    @FindBy(xpath = "/html/body/div[6]/section[3]/div/div/div[3]/div[1]/div/div/ul/li/a")
    WebElement getsupport;

    public boolean supportTest(){
        Supporttest.click();
        getsupport.isDisplayed();
            return true;
    }

    //Test to see if Genius bar is there
    @FindBy(xpath = "//*[@id=\"footer-directory-column-section-storeservices\"]/li[2]/a")
    WebElement Geniusbar;

    public String geniusbar(){
       String x = Geniusbar.getText();
       return x;
    }


    //Test to see if icloud option is enable
    @FindBy(xpath = "//*[@id=\"footer-directory-column-section-accounts\"]/li[3]/a")
    WebElement icloud;

   public boolean Icloud(){
       icloud.isEnabled();
       return true;
   }

    @FindBy(xpath = "//*[@id=\"footer-directory-column-section-products\"]")
    ArrayList<WebElement> footerShopandlearn;

    public ArrayList<String> getFooterTextArrayList() {
        ArrayList<String> textList = new ArrayList<String>();
        for (WebElement element : footerShopandlearn) {
            textList.add(element.getText());
        }
        return textList;
    }



}
