package com.demo.DemoProject;

import javax.swing.text.InternationalFormatter;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindBy;

public class HomePage {

	public HomePage(RemoteWebDriver driver) {
		super();
	}

	//locators
	@FindBy(id = "product-askdiscount-button")
	WebElement askForDiscount;
	
	//actions
	
	public InformationModal clickAddToCart() {
		askForDiscount.click();
		return new InformationModal();
	}
	
	//accessors
	
	//validations
}
