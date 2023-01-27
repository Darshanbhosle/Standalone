package pages;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SignInPage extends BaseClass{
      @FindBy(xpath="//*[text()=' SIGN IN']")
      private WebElement SignIn;
      
      @FindBy(xpath="//*[@ng-reflect-name='email']")
      private WebElement Username;
      
      @FindBy(xpath="(//*[@formcontrolname='password'])")
      private WebElement Password;
      
      @FindBy(xpath="//*[text()=' SIGN IN ']")
      private WebElement SignInButton;
      
      WebDriver driver;
      
      
   public SignInPage(WebDriver driver) throws IOException{
  		this.driver = driver;
  		PageFactory.initElements(driver, this);
  	}
	public void loginToApplication(String username, String password) {
		SignIn.click();
		
		Username.sendKeys(username);

		Password.sendKeys(password);

		SignInButton.click();
		
	
	}

}
