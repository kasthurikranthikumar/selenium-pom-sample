package blogs.selinium_pom.com.theyachtclub.pom.pages;

import blogs.selinium_pom.com.theyachtclub.pom.locators.EventsPageLocators;
import blogs.selinium_pom.com.theyachtclub.utils.driver.MyDriver;

public class EventsPage {
	public static void NavigateToKayakathon() {
		MyDriver.driver.findElement(EventsPageLocators.linkKayakathon).click();
	}
}
