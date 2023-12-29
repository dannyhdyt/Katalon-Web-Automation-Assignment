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

WebUI.callTestCase(findTestCase('demoblaze.com/Single_Test/03_puchase_item_test'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/demoblaze.com/Place_Order_Page/a_Cart'))

WebUI.click(findTestObject('Object Repository/demoblaze.com/Place_Order_Page/button_Place Order'))

WebUI.delay(2)

WebUI.setText(findTestObject('Object Repository/demoblaze.com/Place_Order_Page/inputname'), 'goku')

WebUI.setText(findTestObject('Object Repository/demoblaze.com/Place_Order_Page/inputcountry'), 'Salada')

WebUI.setText(findTestObject('Object Repository/demoblaze.com/Place_Order_Page/inputcity'), 'west city')

WebUI.setText(findTestObject('Object Repository/demoblaze.com/Place_Order_Page/inputcard'), '12345678910')

WebUI.setText(findTestObject('Object Repository/demoblaze.com/Place_Order_Page/inputmonth'), '12')

WebUI.setText(findTestObject('Object Repository/demoblaze.com/Place_Order_Page/inputyear'), '2000')

WebUI.click(findTestObject('Object Repository/demoblaze.com/Place_Order_Page/button_Purchase'))

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/demoblaze.com/Place_Order_Page/h2_Thank you for your purchase'))

WebUI.verifyElementPresent(findTestObject('Object Repository/demoblaze.com/Place_Order_Page/h2_Thank you for your purchase'), 2)

WebUI.click(findTestObject('Object Repository/demoblaze.com/Place_Order_Page/button_OK'))

