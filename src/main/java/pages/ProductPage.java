package pages;

import base.TestBase;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.PageFactory;

public class ProductPage extends TestBase {
    @FindBy(xpath ="/html/body/div/div/div/div[1]/div[2]/div")
    @CacheLookup
    WebElement productLabel;

    @FindBy(xpath ="//*[@id=\"add-to-cart-sauce-labs-backpack\"]")
    @CacheLookup
    WebElement productAddToCartButton;
    @FindBy(xpath ="//*[@id=\"remove-sauce-labs-backpack\"]")
    @CacheLookup
    WebElement productRemoveButton;

   @FindBy(xpath = "/html/body/div/div/div/div[1]/div[2]/div/button")
    WebElement backToProducts;

    public ProductPage() {
        PageFactory.initElements(driver, this);
    }

    public String verifyProductLabel(){

        return productLabel.getText();
    }
    public ProductPage ProductAddToCart ()
    {
        productAddToCartButton.click();
        return new ProductPage();
    }
    public ProductPage ProductRemove ()
    {
        productRemoveButton.click();
        return new ProductPage();
    }
    public HomePage clickBackToProducts()
    {
        backToProducts.click();
        return new HomePage();
    }
}
