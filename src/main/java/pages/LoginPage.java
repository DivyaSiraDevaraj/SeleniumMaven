package pages;

import base.TestBase;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends TestBase {
    @FindBy(name="user-name")
    WebElement username;

    @FindBy(name="password")
    WebElement password;

    @FindBy(xpath="//*[@id=\"login-button\"]")
    WebElement loginBtn;


    //Initializing the Page Objects:
    public LoginPage(){
        PageFactory.initElements(driver, this);
    }

    //Actions:
    public String validateLoginPageTitle(){
        return driver.getTitle();
    }


   public HomePage login(String un, String pwd){
       username.sendKeys(un);
       password.sendKeys(pwd);
        loginBtn.click();
       //JavascriptExecutor js = (JavascriptExecutor)driver;
       //js.executeScript("arguments[0].click();", loginBtn);

       return new HomePage();
    }


}
