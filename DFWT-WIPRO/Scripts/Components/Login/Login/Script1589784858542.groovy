import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import org.openqa.selenium.WebDriver as WebDriver

import com.kms.katalon.core.webui.driver.DriverFactory as DriverFactory
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;


System.setProperty("webdriver.chrome.driver", DriverFactory.getChromeDriverPath());

//////////////////////////////
// Setting new download directory path
Map<String, Object> prefs = new HashMap<String, Object>();
 
// Use File.separator as it will work on any OS
prefs.put("download.default_directory",
System.getProperty("user.dir") + File.separator + "downloadedFiles");
 
ChromeOptions options = new ChromeOptions();
options.setExperimentalOption("prefs", prefs);
////////////////////////////////

//WebDriver driver = new ChromeDriver(options);
//DriverFactory.changeWebDriver(driver)
ChromeDriver driver= new ChromeDriver(options)

//'Opens link to MST Page.\r\n'
//WebUI.openBrowser("")

//get driver
//WebDriver driver = DriverFactory.getWebDriver()

//WebUI.deleteAllCookies()

//'Delay'
//WebUI.delay(5)

//WebUI.navigateToUrl(GlobalVariable.host)
//driver.navigate().to(GlobalVariable.host)
driver.get(GlobalVariable.host)
DriverFactory.changeWebDriver(driver)

'Waits for MST Page load for 60 seconds.'
WebUI.waitForPageLoad(60)

'Maximizes MST Page Window.\r\n'
WebUI.maximizeWindow()
//html.sendKeys(Keys.chord(Keys.CONTROL, "0")); ->> return to default zoom
//zoom out

'Inputs username in email input field.\r\n'
WebUI.setText(findTestObject('Login/email text field'), findTestData('data_table').getValue(2, 1))

'Inputs encrypted text to password input field.'
WebUI.setEncryptedText(findTestObject('Login/pass text field'), findTestData('data_table').getValue(2, 2))

'Clicks Submit button.'
WebUI.click(findTestObject('Login/submit'))

//JavascriptExecutor jse = (JavascriptExecutor) driver;
//jse.executeScript("document.html.style.zoom='60'")

'Waits for MST Page to load.'
WebUI.waitForPageLoad(1800)

'Verifies home title in MST Homepage.'
WebUI.waitForElementPresent(findTestObject('Login/home title'), 30)


