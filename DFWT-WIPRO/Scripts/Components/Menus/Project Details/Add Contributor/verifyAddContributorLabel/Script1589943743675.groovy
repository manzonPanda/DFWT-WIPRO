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
WebDriver driver = DriverFactory.getWebDriver()
//continue with already opened browser
//System.setProperty("webdriver.chrome.driver", DriverFactory.getChromeDriverPath());
//ChromeOptions options = new ChromeOptions();
//options.setExperimentalOption("debuggerAddress", "localhost:9222")
//WebDriver driver = new ChromeDriver(options);

boolean functionLabel = false;
boolean idLabel = false;
boolean nameLabel = false;
List <WebElement> addContributorLabels = driver.findElements(By.xpath('//table[@id="addFunctionTbl"]/tbody/tr/td[@class="label"]'))
for(WebElement label : addContributorLabels){
	if(label.getText().contains("Function") ) {
		functionLabel=true
		KeywordUtil.markPassed("VERIFIED: Function input field found.")
	}else if( label.getText().contains("Employee ID")  ){
		idLabel=true
		KeywordUtil.markPassed("VERIFIED: Employee ID input field found.")
	}else if(label.getText().contains("Full Name")){
		nameLabel=true
		KeywordUtil.markPassed("VERIFIED: Full Name input field found.")
	}
}

if( !functionLabel || !idLabel || !nameLabel ) {
	KeywordUtil.markFailedAndStop("FAILED: Some of the input field for Adding Contributor is missing.")
}



