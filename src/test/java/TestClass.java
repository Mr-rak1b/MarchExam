import org.example.DriverSetup;
import org.example.File.Path;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


public class TestClass extends DriverSetup {

    Path homepage;

    @BeforeMethod
    public void SetUp() {
        setupDriver("https://www.apple.com");
        homepage = PageFactory.initElements(driver, Path.class);
    }

    @AfterMethod
    void tearDown() {
        driver.quit();
    }




    //Testing to see if the Homepage load up
    @Test(priority = 4)
    void title() {
        String Title = "https://www.apple.com/";
        String excepted = driver.getCurrentUrl();
        Assert.assertEquals(excepted, Title);
    }

    //Testing to see if MacbookAir logo is there
    @Test(priority = 1)
    public void Mac() {
        Assert.assertEquals(homepage.mac(), "MacBook Air");
    }


    //Testing to see if support option is there
    @Test(priority = 1)
    public void ContactAppleLogo() {
        String expected = "Contacting Apple";
        Assert.assertEquals(expected, homepage.ContactApple());
    }


    //Testing to see if the search bar is displayed or not
    @Test(priority = 10)
    public void testSearchBarIsDisplayed() {
        boolean isDisplayed = homepage.search();
        Assert.assertTrue(isDisplayed, "Search bar is displayed.");
    }

    //Test to see if you get support Start now is visible
    @Test(priority = 1)
    public void supportTest() {
        Assert.assertTrue(homepage.supportTest(), "It's displayed");
    }


    //Testing to see if Apple Card option is there
    @Test(priority = 1)
    public void Card() {
        String x = "Apple Card";
        Assert.assertEquals(x, homepage.Card());
    }


    //Test to see if Genius bar is there
    @Test(priority = 1)
    public void geniusBar() {
        String y = "Genius Bar";
        Assert.assertEquals(y, homepage.geniusbar());
    }


    //Test to see if icloud option is enable
    @Test(priority = 5)
    public void Icloud() {
        Assert.assertTrue(homepage.Icloud(), "It is clickable");
    }






    //trying to see if Shop the latest is there
        @Test(priority = 6)
        public void Storetheleastest() {
            Actions actions = new Actions(driver);
            actions.moveToElement(homepage.store) ;
            homepage.store.isDisplayed();
            System.out.println(homepage.store.isDisplayed());
        }



    //Testing to see iphone 14 buy option is on the page
    @Test(priority = 5)
    public void IphoneBuyOption() {
        Assert.assertTrue(homepage.iphonebuyoption(), "It's displayed");
    }

    //Testing to see if Iphone14 pro option is there
    @Test(priority = 5)
    public void Iphone14Pro() {
        Assert.assertTrue(homepage.iphone14Pro(), "It's displayed");
    }

    //Testing to see if airpod option is on iphone page
    @Test(priority = 5)
    public void AIRPOD() {
        Assert.assertTrue(homepage.Airpod(), "It's displayed");
    }

    //Testing to see if accessories page has the text Iphone Accessories
    @Test(priority = 5)
    public void IphoneAccessoriesTextTest(){
        String expected = "iPhone Accessories";
        String actual= homepage.IphoneAccessoriesText();
        Assert.assertEquals(expected,actual);
    }



    ///////////////////////////////////////////////////////////////Header logo test

    @Test(priority = 10)
    public void Applelogotest() {
        Assert.assertTrue(homepage.AppleLogo(), "It's displayed");
    }

    @Test(priority = 0)
    public void Storelogotest() {
        Assert.assertTrue(homepage.StoreLogo(), "It's displayed");
    }


    @Test(priority = 0)
    public void Maclogotest() {
        Assert.assertTrue(homepage.MacLogo(), "It's displayed");
    }


    @Test(priority = 0)
    public void Ipadlogotest() {
        Assert.assertTrue(homepage.IpadLogo(), "It's displayed");
    }


    @Test(priority = 0)
    public void Iphonelogotest() {
        Assert.assertTrue(homepage.IphoneLogo(), "It's displayed");
    }


    @Test(priority = 0)
    public void Watchlogotest() {
        Assert.assertTrue(homepage.WatchLogo(), "It's displayed");
    }


    @Test(priority = 0)
    public void AirPodlogotest() {
        Assert.assertTrue(homepage.AirpodLogo(), "It's displayed");
    }


    @Test(priority = 0)
    public void TvandHomelogotest() {
        Assert.assertTrue(homepage.TvandhomeLogo(), "It's displayed");
    }


    @Test(priority = 0)
    public void Entertanmentlogotest() {
        Assert.assertTrue(homepage.EntertainmentLogo(), "It's displayed");
    }

    @Test(priority = 0)
    public void AccessoriesLogotest() {
        Assert.assertTrue(homepage.AccessoriesLogo(), "It's displayed");
    }


    @Test(priority = 0)
    public void SupportLogotest() {
        Assert.assertTrue(homepage.SupportLogo(), "It's displayed");
    }

    @Test(priority = 0)
    public void SearchLogotest() {
        Assert.assertTrue(homepage.SearchLogo(), "It's displayed");
    }

    @Test(priority = 0)
    public void CartLogotest() {
        Assert.assertTrue(homepage.CartLogo(), "It's displayed");
    }

    //////////////////////////////////////////////////////////////////////Logo test done


    @Test(priority = 1)
    public void Shopforcollagetexttest(){
        String x = "Save on a new Mac or iPad with Apple education pricing.";
        Assert.assertEquals(x,homepage.shopForcollage());
    }


    @Test(priority = 1)
    public void successStories() throws InterruptedException {
        String x = "Apps help planes, trains, and package-carrying vehicles.";
        Assert.assertEquals(homepage.SuccessStorieslogo(),x);
    }

    @Test(priority = 1)
    public void Recialequityjustice()
    {
        Assert.assertTrue(homepage.recialequityjustice());
    }

    @Test(priority = 1)
    public void SignInPageTest(){
        homepage.Signintest();
    String x = driver.getTitle();
    String actual = "Sign In — Secure Checkout - Apple";
    Assert.assertEquals(actual,x);
    }

    @Test(priority = 1)
 public void WWDc23(){
        homepage.WWDC23();
        String actual = "WWDC23 - Apple Developer";
        Assert.assertEquals(actual,driver.getTitle());
 }

@Test(priority = 1)
public void selectSupport(){
    Actions actions = new Actions(driver);
    actions.moveToElement(homepage.selectsupport());
    homepage.selectsupport1().isDisplayed();
}

    @Test(priority = 1)
    public void shopAppleTvDisplay(){
        Actions actions = new Actions(driver);
        actions.moveToElement(homepage.ShopappleTvdisplay());
        homepage.ShopappleTvdisplay1().isDisplayed();
    }

    @Test(priority = 1)
    public void PrivacyPolicy()
    {
        Assert.assertTrue(homepage.Privacypolicy());
    }


}


