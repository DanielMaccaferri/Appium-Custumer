package br.com.customer.screens;

import static br.com.customer.driver.Driver.getDriver;

import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class HomeScreen {

	public HomeScreen() {// construindo objetos na memória.
		PageFactory.initElements(new AppiumFieldDecorator(getDriver()), this);
	}

	@AndroidFindBy(id = "imageView7")
	MobileElement buttonPlus;

	public MobileElement getButtonPlus() {
		return buttonPlus;
	}

	public void setButtonPlus(MobileElement buttonPlus) {
		this.buttonPlus = buttonPlus;
	}

}
