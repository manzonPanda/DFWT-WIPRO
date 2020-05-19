import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import com.thoughtworks.selenium.Selenium

import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.WebDriver as WebDriver
import org.openqa.selenium.WebElement as WebElement
import com.kms.katalon.core.webui.driver.DriverFactory as DriverFactory
import org.openqa.selenium.By as By
import com.kms.katalon.core.util.KeywordUtil as KeywordUtil
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.Keys;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.ExpectedConditions
import org.openqa.selenium.support.ui.WebDriverWait
import java.time.Duration;
import org.openqa.selenium.chrome.ChromeDriver as ChromeDriver
import org.openqa.selenium.chrome.ChromeOptions
import org.openqa.selenium.support.ui.Select;

//WebDriver driver = DriverFactory.getWebDriver()
//continue with opened browser
System.setProperty("webdriver.chrome.driver", DriverFactory.getChromeDriverPath());
ChromeOptions options = new ChromeOptions();
options.setExperimentalOption("debuggerAddress", "localhost:9222")
WebDriver driver = new ChromeDriver(options);

String userBusinessUnit = userBusinessUnit;
try{
	List <WebElement>  businessUnitTree = driver.findElements(By.xpath('//div[@id="treeCon"]/ul/li/span/a'));
	boolean found = false;
	for(int i=0; i<businessUnitTree.size(); i++){
		if( businessUnitTree[i].getText() == userBusinessUnit ){
			found=true;
			if( driver.findElements(By.xpath("(//div[@id='treeCon']/ul/li/span/a)[${i+1}]/parent::span/following-sibling::ul")).size() == 0 ||
				driver.findElement(By.xpath("(//div[@id='treeCon']/ul/li/span/a)[${i+1}]/parent::span/following-sibling::ul")).getAttribute("style").contains("none") ){
				driver.findElement(By.xpath("((//div[@id='treeCon']/ul/li/span/a)[${i+1}]/preceding-sibling::span)[1]")).click()
			}
			
		}
	}
	(!found) ? KeywordUtil.markFailed("Cannot find business unit tree \"${userBusinessUnit} \"") : ""
}catch (Exception e) {
    KeywordUtil.markFailed('Cannot find business unit tree.')
} 


