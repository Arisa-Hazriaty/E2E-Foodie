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
import java.nio.file.Path as Path
import java.nio.file.Paths as Paths

Path currentRelativePath = Paths.get('')

def s = currentRelativePath.toAbsolutePath().toString()

System.out.println('Current absolute path is: ' + s)

s = (s + '\\Data Files\\Foody Find Reserve Delivery_v5.8.7_apkpure.com.apk')

System.out.println('Current absolute path is: ' + s)

Mobile.startApplication(s, false)

Mobile.tap(findTestObject('Login-Negative/btn-profile'), 0)

Mobile.tap(findTestObject('Login-Negative/btn-login'), 0)

Mobile.tap(findTestObject('Login-Negative/btn-connect-fb'), 0)

def data = findTestData('Login-Negatice')

for (def rowLogin = 1; rowLogin <= data.getRowNumbers(); rowLogin++) {
    Mobile.setText(findTestObject('Login-Negative/inputemail'), data.getValue('Email', rowLogin), 0)

    Mobile.setText(findTestObject('Login-Negative/inputpass'), data.getValue('Password', rowLogin), 0)

    Mobile.tap(findTestObject('Login-Negative/btn-masuk'), 0)

    if (data.getValue('Type', rowLogin) == 'Invalid pass') {
        actualResult = Mobile.getText(findTestObject('Login-Negative/txt-katasandisalah'), 0)

        Mobile.verifyMatch(actualResult, data.getValue('ExpectedResult', rowLogin), false)
    }
}

