package quickstart.tests;

import java.io.IOException;

import org.testng.annotations.Test;
import functionLibrary.ReportLog;
import quickstart.pages.BasePage;
import quickstart.pages.GooglePage;

public class DemoTest extends BasePage{

	@Test
	public  void GoogleSearch_automationScript() throws IOException {
		GooglePage.searchKeyword("automationScript");
		boolean isDisplayed= GooglePage.isLinkDisplayed("automationScript");

		if(isDisplayed==true) {
			ReportLog.logPass("automationScript Link is displayed on Google Search results page 1");
		}else {
			ReportLog.logFail("automationScript Link is not displayed on Google Search results page 1");
		}
		String firstLinkText= GooglePage.getFirstResult().getAttribute("innerText");		
		if(firstLinkText.contains("automationScript")) {
			ReportLog.logPass("automationScript Link is displayed as 1st Link on Google Search results page 1");
		}else {
			ReportLog.logFail("automationScript Link is not displayed as 1st Link on Google Search results page 1");
		}

	}
	@Test
	public void GoogleSearch_Facebook() throws IOException {
		System.out.println("running test Test2");
		GooglePage.searchKeyword("Facebook");
		boolean isDisplayed= GooglePage.isLinkDisplayed("Facebook");

		if(isDisplayed==true) {
			ReportLog.logPass("Facebook Link is displayed on Google Search results page 1");
		}else {
			ReportLog.logFail("Facebook Link is not displayed on Google Search results page 1");
		}

		String firstLinkText= GooglePage.getFirstResult().getAttribute("innerText");
		if(firstLinkText.contains("Facebook")) {
			ReportLog.logPass("Facebook Link is displayed as 1st Link on Google Search results page 1");
		}else {
			ReportLog.logFail("Facebook Link is not displayed as 1st Link on Google Search results page 1");
		}
	}
	@Test
	public void GoogleSearch_LinkedIn() throws IOException {
		GooglePage.searchKeyword("LinkedIn");
		boolean isDisplayed= GooglePage.isLinkDisplayed("LinkedIn");

		if(isDisplayed==true) {
			ReportLog.logPass("LinkedIn Link is displayed on Google Search results page 1");
		}else {
			ReportLog.logFail("LinkedIn Link is not displayed on Google Search results page 1");
		}

		String firstLinkText= GooglePage.getFirstResult().getAttribute("innerText");
		if(firstLinkText.contains("LinkedIn")) {
			ReportLog.logPass("LinkedIn Link is displayed as 1st Link on Google Search results page 1");
		}else {
			ReportLog.logFail("LinkedIn Link is not displayed as 1st Link on Google Search results page 1");
		}

	}
	@Test
	public void GoogleSearch_Twitter() throws IOException {
		GooglePage.searchKeyword("Twitter");
		boolean isDisplayed= GooglePage.isLinkDisplayed("Twitter");

		if(isDisplayed==true) {
			ReportLog.logPass("Twitter Link is displayed on Google Search results page 1");
		}else {
			ReportLog.logFail("Twitter Link is not displayed on Google Search results page 1");
		}

		String firstLinkText= GooglePage.getFirstResult().getAttribute("innerText");
		if(firstLinkText.contains("Twitter")) {
			ReportLog.logPass("Twitter Link is displayed as 1st Link on Google Search results page 1");
		}else {
			ReportLog.logFail("Twitter Link is not displayed as 1st Link on Google Search results page 1");
		}
	}


}
