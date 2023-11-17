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

public class Search_Results {
	
	@Keyword
	public void checkProductListAndGetFirst() {
		Boolean compresor_exists;
		
		compresor_exists = WebUI.verifyElementClickable(findTestObject('Amazon/Results/A_1_Compresor'))
		
		if (compresor_exists) {
			WebUI.click(findTestObject('Amazon/Results/A_1_Compresor'))
		}
	}
	
	@Keyword
	public void filter_Results() {
		WebUI.click(findTestObject('Amazon/Search Again/Page_Amazon.es  Compresor elctrico/i_Con derecho a envo gratis_a-icon a-icon-checkbox'))
		
		WebUI.click(findTestObject('Amazon/Search Again/Page_Amazon.es  Compresor elctrico/span_Ordenar porDestacados'))
		
		WebUI.click(findTestObject('Amazon/Search Again/Page_Amazon.es  Compresor elctrico/a_Precio De menor a mayor'))
	}
	
	@Keyword
	public void get_Products_Data() {
		def elementos = WebUI.findWebElements(findTestObject('Object Repository/Amazon/Search Again/result_products_title'), 30)
		def precios = WebUI.findWebElements(findTestObject('Object Repository/Amazon/Search Again/result_products_price'), 30)
		for(producto in [elementos, precios].transpose()) {
			println(producto[0].getText())
			println(producto[1].getText())
		}
	}
}
