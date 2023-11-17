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
import org.openqa.selenium.By
import org.openqa.selenium.WebElement

public class General {
	@Keyword
	public void acceptCookies() {
		Boolean cookies = WebUI.verifyElementClickable(findTestObject('Amazon/General/Page_Amazon.es Compresores de aire Bricolaje y herramientas/input_Se ha producido un problema al guardar tus preferencias de cookies. Intntalo de nuevo_accept'))

		if (cookies) {
			WebUI.click(findTestObject('Amazon/General/Page_Amazon.es Compresores de aire Bricolaje y herramientas/input_Se ha producido un problema al guardar tus preferencias de cookies. Intntalo de nuevo_accept'))
		} else {
			Boolean cookies_alt = WebUI.verifyElementClickable(findTestObject('Amazon/General/Page_Amazon.es Compresores de aire Bricolaje y herramientas/Alternative_cookies'))

			if (cookies_alt) {
				WebUI.click(findTestObject('Amazon/General/Page_Amazon.es Compresores de aire Bricolaje y herramientas/Alternative_cookies'))
			}
		}
	}
	
	@Keyword
	public void searchProduct() {
		WebUI.setText(findTestObject('Amazon/Search Again/Page_TROTEC Compresor de batera PCPS 10-16V y Bomba de aire de batera PCPS 11-16V  Amazon.es Bricolaje y herramientas/input_Buscar Amazon.es_field-keywords'),
			GlobalVariable.producto)
		
		WebUI.submit(findTestObject('Amazon/Search Again/Page_TROTEC Compresor de batera PCPS 10-16V y Bomba de aire de batera PCPS 11-16V  Amazon.es Bricolaje y herramientas/input_Buscar Amazon.es_field-keywords'))
		
		
	}
	
	@Keyword
	public void myAccount() {
		Boolean mi_cuenta = WebUI.verifyElementClickable(findTestObject('Amazon/Login/Page_Amazon.es compra online de electrnica, libros, deporte, hogar, moda y mucho ms/span_Cuenta y listas'))
		
		if (mi_cuenta) {
			WebUI.click(findTestObject('Amazon/Login/Page_Amazon.es compra online de electrnica, libros, deporte, hogar, moda y mucho ms/span_Cuenta y listas'))
		} else {
			WebUI.click(findTestObject('Amazon/Registro/Page_Amazon.es compra online de electrnica, libros, deporte, hogar, moda y mucho ms/a_Mi cuenta'))
		}
	}


}
