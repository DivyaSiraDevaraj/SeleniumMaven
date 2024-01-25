package pages;

import base.TestBase;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends TestBase {
    @FindBy(xpath = "//*[@id=\"header_container\"]/div[1]/div[2]/div")
    @CacheLookup
    WebElement userNameLabel;

    @FindBy(xpath ="//*[@id=\"inventory_container\"]/div/div[1]/div[2]")
    WebElement productLink;

    public HomePage() {
        PageFactory.initElements(driver, this);
    }

    public String verifyHomePageTitle(){
        return driver.getTitle();
    }

    public boolean verifyCorrectUserName()
    {
        return userNameLabel.isDisplayed();
    }

    public ProductPage clickOnProductLink()
    {
        productLink.click();
        return new ProductPage();
    }





}
