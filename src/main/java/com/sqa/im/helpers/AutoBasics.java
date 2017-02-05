/**
 *   File Name: AutoBasics.java<br>
 *
 *   Malla, Isha<br>
 *   Created: Feb 4, 2017
 *
 */

package com.sqa.im.helpers;

import java.io.*;

import org.apache.commons.io.*;
import org.openqa.selenium.*;

/**
 * AutoBasics //ADDD (description of class)
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
public class AutoBasics {

	public static boolean isElementPresent(WebDriver driver, By by) {
		try {
			driver.findElement(by);
		} catch (NoSuchElementException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return false;
		}
		return true;
	}

	public static boolean takeScreenShot(WebDriver driver, String fileName) {
		File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		try {
			FileUtils.copyFile(src, new File("screenshots/" + fileName + ".png"));
		} catch (IOException e) {
			e.printStackTrace();
			return false;
		}
		return true;
	}

}