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

Mobile.tap(findTestObject('Android/Foody/Check_In/btn_check_in'), 0)

Mobile.verifyElementExist(findTestObject('Android/Foody/Check_In/1_lbl_check_in'), 0)

Mobile.verifyElementExist(findTestObject('Android/Foody/Check_In/2_lbl_food_product_name'), 0)

Mobile.tap(findTestObject('Android/Foody/Check_In/3_txt_check_in_desc'), 0, FailureHandling.STOP_ON_FAILURE)

Mobile.setText(findTestObject('Android/Foody/Check_In/3_txt_check_in_desc'), 'okeeee', 0)

Mobile.tap(findTestObject('Android/Foody/Check_In/4_icon_camera_check_in'), 0)

Mobile.tap(findTestObject('Android/Foody/Check_In/5_select_image_gallery'), 0)

Mobile.tap(findTestObject('Android/Foody/Check_In/7_checked_image_gallery'), 0)

Mobile.verifyElementChecked(findTestObject('Android/Foody/Check_In/7_checked_image_gallery'), 0)

Mobile.tap(findTestObject('Android/Foody/Check_In/8_btn_done_image_selected'), 0)

Mobile.tap(findTestObject('Android/Foody/Check_In/9_bnt_done_image_selected2'), 0)

Mobile.verifyElementExist(findTestObject('Android/Foody/Check_In/11_image_check_in_desc_verify'), 0)

Mobile.tap(findTestObject('Android/Foody/Check_In/12_btn_post_check_in'), 0)

Mobile.tap(findTestObject('Android/Foody/Check_In/13_btn_view_reward_point'), 0)

Mobile.verifyElementExist(findTestObject('Android/Foody/Check_In/14_lbl_check_in_created'), 0)

Mobile.tap(findTestObject('Android/Foody/Check_In/15_btn_back_convert_reward_point'), 0)

Mobile.verifyElementExist(findTestObject('Android/Foody/Check_In/16_lbl_like'), 0)

Mobile.verifyElementExist(findTestObject('Android/Foody/Check_In/17_lbl_comment'), 0)

Mobile.verifyElementExist(findTestObject('Android/Foody/Check_In/18_lbl_share'), 0)

Mobile.tap(findTestObject('Android/Foody/Check_In/15_btn_back_convert_reward_point'), 0)

Mobile.checkElement(findTestObject('Android/Foody/Check_In/15_btn_back_convert_reward_point'), 0)

Mobile.tap(findTestObject('Android/Foody/Check_In/21_btn_back_search'), 0)

