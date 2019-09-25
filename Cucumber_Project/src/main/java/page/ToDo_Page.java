package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class ToDo_Page {

	WebDriver driver;

	// Every Page must have a constructor to invite the driver
	public ToDo_Page(WebDriver driver) {
		this.driver = driver;
	}

	// Element Library
	@FindBy(how = How.XPATH, using = "//button[@type='button' and contains (text(),'Set SkyBlue Background')] ")
	WebElement BluebackgroundButton;

	@FindBy(how = How.XPATH, using = "//button[@type='button' and contains (text(),'Set White Background')] ")
	WebElement WhitebackgroundButton;

	// Methods to interact with the elements
	public void todo() throws InterruptedException {
		BluebackgroundButton.click();
//		Thread.sleep(3000);
		WhitebackgroundButton.click();
	}

	public String getPageColor() {
		return driver.getTitle();
	}

	public void close() {
		driver.close();
		driver.quit();
	}
}