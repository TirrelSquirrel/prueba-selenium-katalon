package com.amazon

import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows

import internal.GlobalVariable

public class userForm {

	@Keyword
	public void login() {
		WebUI.setText(findTestObject('Amazon/Login/Page_Iniciar sesin en Amazon/input_Direccin de e-mail o nmero de telfono mvil_email'),
				GlobalVariable.emailLogin)

		WebUI.submit(findTestObject('Amazon/Login/Page_Iniciar sesin en Amazon/input_Direccin de e-mail o nmero de telfono mvil_email'))

		WebUI.setText(findTestObject('Amazon/Login/Page_Iniciar sesin en Amazon/input_Has olvidado la contrasea_password'), GlobalVariable.passLogin)

		WebUI.submit(findTestObject('Amazon/Login/Page_Iniciar sesin en Amazon/input_Has olvidado la contrasea_password'))
	}

	@Keyword
	public void register() {

		WebUI.click(findTestObject('Amazon/Registro/Page_Iniciar sesin en Amazon/a_Crea tu cuenta de Amazon'), FailureHandling.STOP_ON_FAILURE)

		WebUI.waitForElementVisible(findTestObject('Amazon/Registro/Page_Registro de Amazon/input_Nombre_customerName'), 5)

		WebUI.setText(findTestObject('Amazon/Registro/Page_Registro de Amazon/input_Nombre_customerName'), GlobalVariable.nameRegister)

		WebUI.setText(findTestObject('Amazon/Registro/Page_Registro de Amazon/input_ES 34_email'), GlobalVariable.emailRegister)

		WebUI.setText(findTestObject('Amazon/Registro/Page_Registro de Amazon/input_Contrasea_password'), GlobalVariable.passRegister)

		WebUI.setText(findTestObject('Amazon/Registro/Page_Registro de Amazon/input_Confirma tu contrasea_passwordCheck'), GlobalVariable.passRegister)

		WebUI.submit(findTestObject('Amazon/Registro/Page_Registro de Amazon/input_Confirma tu contrasea_passwordCheck'))
	}
}
