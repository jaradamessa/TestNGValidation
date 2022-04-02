package pages;


import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.testng.Assert;




public class ValidationPage extends BasePage{
	
	WebDriver driver;
	
public void ValidPage(WebDriver driver) {
		
	
	}

	@FindBy(how = How.NAME, using = "categorydata")
	WebElement Add_Category;
	
	@FindBy(how = How.XPATH, using = "(//input[@value='Add category'])[1]")
	WebElement Validate_Dupicate;
	
	@FindBy(how = How.NAME, using = "due_month")
	WebElement Months_Dropdown;
	
	
	
	public void addCategory (String category) {
		int generatedNum = generateRandomNumber(700);
		Add_Category.sendKeys(category + generatedNum);
		String duplicate = (category+ generatedNum);
		System.out.println(duplicate);
		 
	}
	
	public void validDupicate() {
		
		if(Add_Category.getText() != null)

		{
		Assert.assertTrue(true);
		System.out.println("No duplicate");
		}
		else 
		{ 
			Assert.assertTrue(false);
		}
	
		
			
		}
		
	
	public void dropdownMonths(String name) {
		Months_Dropdown.click();
		selectFromDropdown(Months_Dropdown, name);
		
	}
	   

}
