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
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')

WebUI.callTestCase(findTestCase('Connecting two TC/TC1'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.maximizeWindow()

WebUI.verifyElementVisible(findTestObject('TC_2/Page_Welcome/a_Workflow'))

WebUI.click(findTestObject('Object Repository/TC_2/Page_Welcome/a_Workflow'))

WebUI.verifyElementVisible(findTestObject('Object Repository/TC_2/Page_Welcome/a_Workflow'))

WebUI.click(findTestObject('Object Repository/TC_2/Page_Welcome/a_Manage Forms'))

WebUI.click(findTestObject('Object Repository/TC_2/Page_Manage Forms/button_DND Poonawalla SGP_btnRowAction-0f2d_d44eaf'))

WebUI.verifyElementVisible(findTestObject('Object Repository/TC_2/Page_Manage Forms/button_DND Poonawalla SGP_btnRowAction-0f2d_d44eaf'))

WebUI.click(findTestObject('Object Repository/TC_2/Page_Manage Forms/button_DND Poonawalla SGP_btnRowAction-0f2d_d44eaf'), 
    FailureHandling.CONTINUE_ON_FAILURE)

WebUI.acceptAlert()

WebUI.click(findTestObject('Object Repository/TC_2/Page_Manage Forms/a_Test'))

