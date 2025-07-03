package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
public class ContactPage {
	
	WebDriver driver;
	
	public ContactPage(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(name = "firstname")
	WebElement firstName;
	
	@FindBy(name = "lastname")
	WebElement lastName;
	
	@FindBy(name = "email")
	WebElement email;
	
	@FindBy(name = "phone")
	WebElement phone;
	
	@FindBy(linkText = "Send Message")
	WebElement submitButton;
	
	
	public void clickContactUs(String firstNameField, String lastNameField, String emailField, String phoneField)
	{	
		driver.switchTo().frame(0);
		System.out.println("Frame is switched.");
		firstName.sendKeys(firstNameField);
		lastName.sendKeys(lastNameField);
		email.sendKeys(emailField);
		phone.sendKeys(phoneField);
		
		submitButton.click();	
	}

}
