package blogs.selinium_pom.com.theyachtclub.pom.pages;

import blogs.selinium_pom.com.theyachtclub.pom.locators.AboutPageLocators;
import blogs.selinium_pom.com.theyachtclub.utils.driver.MyDriver;

public class AboutPage {

	public static void NavigateToHowItsStarted() {
		MyDriver.driver.findElement(AboutPageLocators.linkHowItsStarted).click();
	}

	public static void NavigateToDignity() {
		MyDriver.driver.findElement(AboutPageLocators.linDignity).click();
	}
}
