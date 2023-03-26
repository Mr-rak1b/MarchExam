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

    @Test
    public void Mac()
    {

        Assert.assertEquals(homepage.mac(),"MacBook Air");
    }

    @Test
    public void TestSupport()
    {
        String expt = "support.apple.com/kb/HT209218";
        Assert.assertEquals(expt,homepage.support());
    }


}
