import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import org.testng.Assert as Assert
import org.testng.asserts.Assertion as Assertion
import org.openqa.selenium.WebDriver as WebDriver
import org.openqa.selenium.WebElement as WebElement
import org.apache.http.util.Asserts as Asserts
import org.openqa.selenium.By as By
import com.kms.katalon.core.util.KeywordUtil as KeywordUtil
import com.kms.katalon.core.webui.driver.DriverFactory as DriverFactory
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.support.ui.WebDriverWait
import org.openqa.selenium.support.ui.ExpectedConditions
import org.openqa.selenium.chrome.ChromeDriver as ChromeDriver
import org.openqa.selenium.chrome.ChromeOptions
//WebDriver driver = DriverFactory.getWebDriver()

//continue with already opened browser
System.setProperty("webdriver.chrome.driver", DriverFactory.getChromeDriverPath());
ChromeOptions options = new ChromeOptions();
options.setExperimentalOption("debuggerAddress", "localhost:9222")
WebDriver driver = new ChromeDriver(options);

WebDriverWait wait = new WebDriverWait(driver, 60)
//wait for notification dialog to appear
wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath('//div[@aria-describedby="confirmationBox"]')))
if( driver.findElement(By.xpath('//div[@aria-describedby="confirmationBox"]'))){
	if( driver.findElement(By.xpath('//div[@aria-describedby="confirmationBox"]/.//span[1]')).getText() == "Success Notification" ){
		KeywordUtil.markPassed('Verified: Success Notification appeared. Successfully added as a new project member.')
		driver.findElement(By.xpath('//span[text()="OK"]')).click()
	}
	if( driver.findElement(By.xpath('(//div[@aria-describedby="confirmationBox"]/.//span)[1]')).getText() == "Alert" ) {
		KeywordUtil.markPassed('Verified: Alert notification appeared. Some of the required fields is empty.')
	}
}













