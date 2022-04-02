package pages;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BasePage {

	WebDriver driver;

	public void waitForElement(WebDriver driver, int waitTime, WebElement element) {
		WebDriverWait wait = new WebDriverWait(driver, waitTime);
		wait.until(ExpectedConditions.visibilityOf(element));
	}

	public void selectFromDropdown(WebElement monthDropDown, String monthName) {
		
		Select selectMonth= new Select(monthDropDown);
		List<WebElement>opt = selectMonth.getOptions();
		int size = opt.size();
		for (int i=0; i<size; i++) {
			System.out.println(opt.get(i).getText());
			//String options =System.out.println(options);
		}
		
}
	public int generateRandomNumber(int boundaryNumber) {
		Random random = new Random();
		return random.nextInt(boundaryNumber);
	}
}