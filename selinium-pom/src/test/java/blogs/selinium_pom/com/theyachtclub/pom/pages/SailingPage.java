package blogs.selinium_pom.com.theyachtclub.pom.pages;

import blogs.selinium_pom.com.theyachtclub.pom.locators.SailingPageLocators;
import blogs.selinium_pom.com.theyachtclub.utils.driver.MyDriver;

public class SailingPage {
	public static void NavigateToBoats() {
		MyDriver.driver.findElement(SailingPageLocators.linkBoats).click();
	}

	public static void NavigateToOurChamps() {
		MyDriver.driver.findElement(SailingPageLocators.linkOurChampions).click();
	}
}
