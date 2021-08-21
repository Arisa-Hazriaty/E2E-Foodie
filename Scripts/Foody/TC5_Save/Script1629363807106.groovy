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

Mobile.startExistingApplication('com.foody.vn.activity', FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Android/Foody/Mencari_Makanan/btn_home'), 0)

Mobile.tap(findTestObject('Android/Foody/Mencari_Makanan/field_search'), 0)

Mobile.setText(findTestObject('Android/Foody/Mencari_Makanan/field_search_edit'), 'ice cream', 0)

Mobile.tap(findTestObject('Android/Foody/Mencari_Makanan/lbl_food_product'), 0)

Mobile.delay(7, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Android/Foody/Save/btnSave'), 0, FailureHandling.STOP_ON_FAILURE)

Mobile.verifyElementText(findTestObject('Android/Foody/Save/lblSaveToPlaceCollections'), 'Save to place collections')

Mobile.tap(findTestObject('Android/Foody/Save/btnCreateCollection'), 0)

Mobile.verifyElementText(findTestObject('Android/Foody/Save/lblCreateNewPlaceCollection'), 'Create new place collection')

Mobile.setText(findTestObject('Android/Foody/Save/fieldEditTextName'), 'Dessertt', 0)

Mobile.setText(findTestObject('Android/Foody/Save/fieldEditTextDescription'), 'Ice', 0)

Mobile.tap(findTestObject('Android/Foody/Save/btnCreate'), 0)

Mobile.verifyElementText(findTestObject('Android/Foody/Save/lblCollectionIsCreatedSuccessfully'), 'Collection is created successfully')

Mobile.tap(findTestObject('Android/Foody/Save/btnClose'), 0)

Mobile.tap(findTestObject('Android/Foody/Save/btnDone'), 0)

