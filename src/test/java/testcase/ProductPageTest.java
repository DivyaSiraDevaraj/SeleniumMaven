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

public class ProductPageTest extends TestBase {

    LoginPage loginPage;
    HomePage homePage;

    ProductPage productPage;
    TestUtil testUtil;

    public ProductPageTest(){
        super();
    }
    @BeforeMethod
    public void setUp(){
        initialization();
        testUtil = new TestUtil();
        loginPage = new LoginPage();
        productPage = new ProductPage();
        homePage = loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
    }
    //@Test(priority=1)
    //public void verifyProductPageLabel(){

      //  String text = productPage.verifyProductLabel();
        //Assert.assertEquals(text, "Back to products");
    //}

    @AfterMethod
    public void tearDown(){

        driver.quit();
    }

}
