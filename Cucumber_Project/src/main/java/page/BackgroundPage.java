package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class BackgroundPage extends BasePage {

	WebDriver driver; // Global

	// Every Page must have a constructor to invite the driver
	public BackgroundPage(WebDriver driver) {
		this.driver = driver;
	}

	// Element Library
	@FindBy(how = How.XPATH, using = "//body[@style='background-color: skyblue;']")
	WebElement BlueColor;
	@FindBy(how = How.XPATH, using = "//body[@style='background-color: white;']")
	WebElement WhiteColor;

	// Methods to interact with the elements
	public void waitForColor() {
		waitForElement(BlueColor, driver);
	}

	public boolean isBackGroundColorBlue() {
		try {
			waitForColor();
			return true;
		} catch (Exception e) {

		}
		return false;
	}

}
