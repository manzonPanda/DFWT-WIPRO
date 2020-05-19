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

WebUI.callTestCase(findTestCase('Components/Login/Login'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Components/Business Units/openProjectFolder'), [('userProjectFolder') : 'TempProject', ('userBusinessUnit') : 'MSP'], 
    FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Components/Menus/Project Details/Add Team Members/clickAddTeamMembers'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Components/Menus/Project Details/Add Team Members/verifyAddTeamMembersLabel'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Components/Menus/Project Details/Add Team Members/inputEmployeeId'), [('userEmployeeId') : 'x1047437'], 
    FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Components/Menus/Project Details/Add Team Members/inputFullName'), [('userFullName') : 'Jake James Manzon'], 
    FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Components/Menus/Project Details/Add Team Members/selectFunctions'), [('userFunctions') : 'Tools'], 
    FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Components/Menus/Project Details/Add Team Members/clickAddButton'), [:], FailureHandling.STOP_ON_FAILURE)
