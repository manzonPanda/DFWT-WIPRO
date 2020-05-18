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
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.By as By
import org.openqa.selenium.chrome.ChromeDriver as ChromeDriver
import org.openqa.selenium.WebDriver as WebDriver
import com.kms.katalon.core.webui.driver.DriverFactory as DriverFactory
import java.util.concurrent.TimeUnit as TimeUnit
import org.openqa.selenium.Keys as Keys
import org.openqa.selenium.JavascriptExecutor as JavascriptExecutor
import org.openqa.selenium.WebElement as WebElement
import org.openqa.selenium.interactions.Actions as Actions

WebUI.callTestCase(findTestCase('Components/Login/Login'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Components/Menus/Navigate to Add Project'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Components/Menus/Admin/Add Project/Add project'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Components/Menus/Admin/Add Project/clickResetButton'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Components/Menus/Admin/Add Project/verifyResetButtonFunctionality'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Components/Menus/Admin/Add Project/Add project'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Components/Menus/Admin/Add Project/clickAddButton'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Components/Menus/Admin/Add Project/verifyNewProjectCreated'), [:], FailureHandling.STOP_ON_FAILURE)

