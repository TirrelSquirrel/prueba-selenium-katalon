package com.google

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

public class General {
	
	@Keyword
	public void acceptCookies() {
		Boolean aceptar_cookies = WebUI.verifyElementClickable(findTestObject('Google/Main/Page_Google/div_Aceptar todo'))
		
		if (aceptar_cookies) {
			WebUI.click(findTestObject('Google/Main/Page_Google/div_Aceptar todo'))
		}
	}
	
	@Keyword
	public void googleSearch(String texto) {
		WebUI.sendKeys(findTestObject('Google/Main/Page_Google/textarea__q'), texto)
		
		WebUI.submit(findTestObject('Google/Main/Page_Google/textarea__q'))
	}
}
