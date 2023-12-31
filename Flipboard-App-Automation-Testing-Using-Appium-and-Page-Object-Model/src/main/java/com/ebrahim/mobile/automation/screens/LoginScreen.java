package com.ebrahim.mobile.automation.screens;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import com.ebrahim.mobile.automation.base.ScreenBase;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class LoginScreen extends ScreenBase {

	@AndroidFindBy(id = "flipboard.app:id/first_launch_cover_continue")
	public WebElement continueButton;

	public LoginScreen(AppiumDriver<MobileElement> driver) {
		super(driver);
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}

	public ChooseTopisScreen clickGetStartedBtn() {
		continueButton.click();
		return new ChooseTopisScreen(driver);
	}
}
