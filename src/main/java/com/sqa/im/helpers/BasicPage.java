package com.sqa.im.helpers;
/**
 *   File Name: BasicPage.java<br>
 *
 *   Malla, Isha<br>
 *   Created: Feb 4, 2017
 *
 */


import org.apache.log4j.*;
import org.openqa.selenium.*;
import org.openqa.selenium.support.*;

/**
 * BasicPage //ADDD (description of class)
 * <p>
 * //ADDD (description of core fields)
 * <p>
 * //ADDD (description of core methods)
 *
 * @author Malla, Isha
 * @version 1.0.0
 * @since 1.0
 *
 */
public class BasicPage {

	private WebDriver driver;

	private Logger log;

	public BasicPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
		this.log = Logger.getLogger(BasicTest.class);
	}

	public WebDriver getDriver() {
		return this.driver;
	}

	public Logger getLog() {
		return this.log;
	}

	public boolean isElementPresent(By by) {
		return AutoBasics.isElementPresent(getDriver(), by);
	}

	public boolean takeScreeshot(String name) {
		return AutoBasics.takeScreenShot(getDriver(), name);
	}

}
