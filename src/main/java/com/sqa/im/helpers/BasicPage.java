package com.sqa.im.helpers;

import org.openqa.selenium.*;
import org.openqa.selenium.support.*;

public class BasicPage extends Core {

	public BasicPage(WebDriver driver) {
		super(driver);
		PageFactory.initElements(driver, this);
	}
}