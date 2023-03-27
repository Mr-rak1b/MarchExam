import org.example.DriverSetup;
import org.example.File.Path;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestClass extends DriverSetup {

    Path homepage;
    @BeforeMethod
    public void SetUp()
    {
        setupDriver("https://apple.com");
        homepage = PageFactory.initElements(driver,Path.class);
    }

    @AfterMethod
    void tearDown(){
        driver.quit();
    }

    //Testing to see if the Homepage load up
    @Test
    void title()
    {
        String Title = "https://www.apple.com/";
        String expted = driver.getCurrentUrl();
        Assert.assertEquals(expted,Title);
    }

    //Testing to see if MacbookAir logo is there
    @Test
    public void Mac()
    {Assert.assertEquals(homepage.mac(),"MacBook Air");}


    //Testing to see if support option is there
    @Test
    public void TestSupport()
    {
        String expt = "support.apple.com/kb/HT209218";
        Assert.assertEquals(expt,homepage.support());
    }


    //Testing to see if the search bar is displayed or not
    @Test
    public void testSearchBarIsDisplayed() {
        boolean isDisplayed = homepage.search();
        Assert.assertTrue(isDisplayed, "Search bar is not displayed.");
    }

//    @Test
//    public void supportTest(){
//    Assert.assertTrue(homepage.supporttest(),"It's not displayed");
//    }
}
