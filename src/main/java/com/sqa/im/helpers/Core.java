package com.sqa.im.helpers;

import org.apache.log4j.*;
import org.openqa.selenium.*;

public class Core {

	private WebDriver driver;

	private Logger logger;

	public Core() {
		this.logger = Logger.getLogger(Core.class);
	}

	public Core(WebDriver driver) {
		this.driver = driver;
		this.logger = Logger.getLogger(Core.class);
	}

	public boolean addProp(String key, String value) {
		return AutoBasics.addProperty(key, value);
	}

	public WebDriver getDriver() {
		return this.driver;
	}

	public int getInt(String name) {
		return AutoBasics.getInt(name);
	}

	public Logger getLog() {
		return this.logger;
	}

	public String getProp(String name) {
		return AutoBasics.getProp(name);
	}

	public boolean isElementPresent(By by) {
		return AutoBasics.isElementPresent(getDriver(), by);
	}

	public boolean takeScreeshot(String name) {
		return AutoBasics.takeScreenShot(getDriver(), name);
	}

	protected void setDriver(WebDriver driver) {
		this.driver = driver;
	}
}