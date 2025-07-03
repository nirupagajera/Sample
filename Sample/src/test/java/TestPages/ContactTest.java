package TestPages;

import org.testng.Assert;
import org.testng.annotations.Test;

import Base.BaseTest;
import Pages.ContactPage;

public class ContactTest extends BaseTest
{
	@Test(priority = 1)
	public void invalidLogin() throws Exception
	{

		ContactPage cp = new ContactPage(driver);
		cp.clickContactUs("Nirupa", "Gajera", "nirupa@krishaweb.com", "7600320564");
		
		Assert.assertTrue(driver.getTitle().contains("contact-us"), "Form is showing error message");
	}
}
