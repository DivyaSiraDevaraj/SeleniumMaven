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
    TestUtil testUtil;
    ProductPage productPage;


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
        productPage = homePage.clickOnProductLink();
    }
    @Test(priority=1)
    public void verifyProductPageLabel(){

       // productPage = homePage.clickOnProductLink();
        String text = productPage.verifyProductLabel();
        Assert.assertEquals(text, "Back to products");
        //Assert.assertTrue(productPage.verifyProductLabel(), "Bac to products");

    }
    @Test(priority=2)
    public void verifyProductAddToCart(){
        productPage = productPage.ProductAddToCart();
     }

    @Test(priority=3)
    public void verifyProductRemove(){
        productPage = productPage.ProductAddToCart();
        productPage = productPage.ProductRemove();

    }
    @Test(priority=4)
    public void verifyClickBackToProducts(){

        homePage= productPage.clickBackToProducts();


    }

    @AfterMethod
   public void tearDown(){

       driver.quit();
   }

}
