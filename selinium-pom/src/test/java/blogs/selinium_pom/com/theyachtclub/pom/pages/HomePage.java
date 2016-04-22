package blogs.selinium_pom.com.theyachtclub.pom.pages;

import blogs.selinium_pom.com.theyachtclub.pom.locators.HomePageLocators;
import blogs.selinium_pom.com.theyachtclub.utils.driver.MyDriver;

public class HomePage {
	public static void NavigateToLearnSailing() {
		MyDriver.driver.findElement(HomePageLocators.linkLerarnSailing).click();
	}

	public static void NavigateToQuickExp() {
		MyDriver.driver.findElement(HomePageLocators.linkQuickExp).click();
	}
}
