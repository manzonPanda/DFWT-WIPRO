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

WebUI.callTestCase(findTestCase('Components/Menus/Admin/Add Project/chooseBusinessUnit'), [('userBusinessUnit') : 'MSP'], 
    FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Components/Menus/Admin/Add Project/inputProjectName'), [('userProjectName') : 'TempProject'], 
    FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Components/Menus/Admin/Add Project/inputAlias'), [('userAlias') : ''], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Components/Menus/Admin/Add Project/inputPGx'), [('userPGx') : '1'], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Components/Menus/Admin/Add Project/inputPGy'), [('userPGy') : '0'], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Components/Menus/Admin/Add Project/inputDieRevision'), [('userDieRevision') : 'Die Revision'], 
    FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Components/Menus/Admin/Add Project/inputPMUserId'), [('userProjectManagerId') : 'x1047437'], 
    FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Components/Menus/Admin/Add Project/inputPMName'), [('userProjectManagerName') : 'Jake James Manzon'], 
    FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Components/Menus/Admin/Add Project/chooseHexAddress'), [('userHexAddress') : '2-byte'], 
    FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Components/Menus/Admin/Add Project/chooseMinimumDataSize'), [('userMinimumData') : '2 bytes'], 
    FailureHandling.STOP_ON_FAILURE)

