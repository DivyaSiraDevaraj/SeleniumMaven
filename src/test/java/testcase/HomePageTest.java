package testcase;

import base.TestBase;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.LoginPage;
import pages.ProductPage;
import util.TestUtil;

public class HomePageTest extends TestBase {
    LoginPage loginPage;
    HomePage homePage;
    TestUtil testUtil;

    ProductPage productPage;

    public HomePageTest() {
        super();
    }

    @BeforeMethod
    public void setUp() {
        initialization();
        testUtil = new TestUtil();
        loginPage = new LoginPage();
        productPage = new ProductPage();
        homePage = loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
    }

    @Test(priority=1)
    public void verifyHomePageTitleTest(){
        String homePageTitle = homePage.verifyHomePageTitle();
        Assert.assertEquals(homePageTitle, "Swag Labs","Home page title not matched");
    }
    @Test(priority=2)
    public void verifyCorrectUserNameTest(){

        Assert.assertTrue(homePage.verifyCorrectUserName());
    }

    @Test(priority=3)

    public void verifyClickOnProductLinkTest(){
        productPage = homePage.clickOnProductLink();


    }

@AfterMethod
    public void tearDown(){

        driver.quit();
}

}
