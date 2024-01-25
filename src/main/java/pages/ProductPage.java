package pages;

import base.TestBase;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProductPage extends TestBase {
    @FindBy(id  ="back-to-products")
    WebElement productLabel;

    public ProductPage() {
        PageFactory.initElements(driver, this);
    }

    public String verifyProductLabel(){
        return productLabel.getText();
    }
}
