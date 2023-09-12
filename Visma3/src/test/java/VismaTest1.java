import org.checkerframework.common.value.qual.BoolVal;
import org.example.core.BaseTest;
import org.example.pages.HomePage;
import org.example.pages.PricingPage;
import org.example.pages.SearchResultPage;
import org.example.utils.PropertiesReader;
import org.testng.annotations.*;

public class VismaTest1 extends BaseTest {
    private HomePage homePage;
    private SearchResultPage searchResultPage;
    private PricingPage pricingPage;
    private String url = PropertiesReader.getProperty("url");

    @BeforeClass
    public void testSetUp() {
        homePage = new HomePage(driver);
        searchResultPage = new SearchResultPage(driver);
        pricingPage = new PricingPage(driver);
    }

    @Test
    public void testGhostWebsite() {
        homePage.navigateToHomePage(url);
        homePage.navigateToResources();
        homePage.navigateToStartHere();

        searchResultPage.searchFor("create new blog");
        searchResultPage.open10thResult();

        homePage.navigateToPricing();
        //I will leave the sliding thing unchecked. Not as straight forward and might take some time. Also, it would be a first time tackling sliders.
    }
}