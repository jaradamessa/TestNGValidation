package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import pages.ValidationPage;
import util.BrowserFactory;

public class ValidationTest {
	
	WebDriver driver;
	
	String category = "Automation Exam";

	private String Months_Dropdown;

	
	
	@Test
	public void userShouldAddCategory () {
		
		driver = BrowserFactory.init();
		
	ValidationPage validationpage = PageFactory.initElements(driver, ValidationPage.class);
	validationpage.addCategory(category);
	validationpage.validDupicate();
	validationpage.dropdownMonths(Months_Dropdown);
	
	BrowserFactory.tearDown();
	
	}
	
}
