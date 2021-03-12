package functionLibrary;

import java.io.IOException;
import com.aventstack.extentreports.MediaEntityBuilder;
import quickstart.pages.BasePage;

public class ReportLog extends BasePage {
	

	public static void logPass(String checkpointDetails) throws IOException {
		String screenshotFilePath=Utilities.getScreenshot(driver);
		test.pass(checkpointDetails, MediaEntityBuilder.createScreenCaptureFromPath(screenshotFilePath).build());
		
	}
	public static void logFail(String checkpointDetails) throws IOException {
		String screenshotFilePath=Utilities.getScreenshot(driver);
		test.fail(checkpointDetails, MediaEntityBuilder.createScreenCaptureFromPath(screenshotFilePath).build());
	}
	
	public static void logInfo(String checkpointDetails) {
		test.info(checkpointDetails);
	}
}
