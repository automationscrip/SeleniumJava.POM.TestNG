package quickstart.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import Constants.TimeOuts;
import functionLibrary.ReportLog;

public class GooglePage extends BasePage {

	public static String locSearchBox="//input[@name='q']";
	public static String firstResult="//div[@class='g']//h3/span";

	public static void searchKeyword(String keyword) {
		String searchResultLink="//h3[contains(.,'"+keyword+"')]";
		driver.findElement(By.xpath(GooglePage.locSearchBox)).sendKeys(keyword);
		driver.findElement(By.xpath(GooglePage.locSearchBox)).sendKeys(Keys.ENTER);
		ReportLog.logInfo("text entered in Google search box ->" +keyword );
		WebDriverWait wait= new WebDriverWait(driver, TimeOuts.DEFAULT_TIMEOUT);
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(searchResultLink)));
		ReportLog.logInfo("Google search Results page appeared");
		
	}

	public static boolean isLinkDisplayed(String elementName) {

		String searchResultLink="//h3[contains(.,'"+elementName+"')]";
		WebDriverWait wait= new WebDriverWait(driver, TimeOuts.DEFAULT_TIMEOUT);
		WebElement ele= wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(searchResultLink)));

		return ele.isDisplayed();
	}
 public static WebElement getFirstResult() {
	 WebElement firstLink= driver.findElement(By.xpath(GooglePage.firstResult));
	 return firstLink;
 }
}
