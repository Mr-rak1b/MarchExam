import org.example.DriverSetup;
import org.example.File.Path;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.ArrayList;


public class TestClass extends DriverSetup {

    Path homepage;

    @BeforeMethod
    public void SetUp() {
        setupDriver("https://apple.com");
        homepage = PageFactory.initElements(driver, Path.class);
    }

    @AfterMethod
    void tearDown() {
        driver.quit();
    }

    //Testing to see if the Homepage load up
    @Test
    void title() {
        String Title = "https://www.apple.com/";
        String excepted = driver.getCurrentUrl();
        Assert.assertEquals(excepted, Title);
    }

    //Testing to see if MacbookAir logo is there
    @Test
    public void Mac() {
        Assert.assertEquals(homepage.mac(), "MacBook Air");
    }


    //Testing to see if support option is there
    @Test
    public void TestSupport() {
        String expected = "support.apple.com/kb/HT209218";
        Assert.assertEquals(expected, homepage.support());
    }


    //Testing to see if the search bar is displayed or not
    @Test
    public void testSearchBarIsDisplayed() {
        boolean isDisplayed = homepage.search();
        Assert.assertTrue(isDisplayed, "Search bar is not displayed.");
    }

    //Test to see if you get support Start now is visible
    @Test
    public void supportTest() {
        Assert.assertTrue(homepage.supportTest(), "It's not displayed");
    }


    //Testing to see if Apple Card option is there
    @Test
    public void Card() {
        String x = "Apple Card";
        Assert.assertEquals(x, homepage.Card());
    }


    //Test to see if Genius bar is there
    @Test
    public void geniusBar() {
        String y = "Genius Bar";
        Assert.assertEquals(y, homepage.geniusbar());
    }


    //Test to see if icloud option is enable
    @Test
    public void Icloud() {
        Assert.assertTrue(homepage.Icloud(), "It is clickable");
    }


    //Still not working
    @Test
    public void Footershopandlearn() {
        ArrayList<String> footerTextList = homepage.getFooterTextArrayList();
        String actualFooterText = String.join(",", footerTextList);
        String expectedFooterText = "Store,Mac,iPad,iPhone,Watch,Airpods,TV & Home,AirTag,Accessories,Gift Cards";
        Assert.assertEquals(actualFooterText, expectedFooterText);
    }



}


