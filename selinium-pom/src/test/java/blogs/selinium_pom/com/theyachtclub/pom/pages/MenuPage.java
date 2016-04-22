package blogs.selinium_pom.com.theyachtclub.pom.pages;

import blogs.selinium_pom.com.theyachtclub.pom.locators.MenuPageLocators;
import blogs.selinium_pom.com.theyachtclub.utils.driver.MyDriver;

public class MenuPage {

	public static void NavigateToHomePage() {
		MyDriver.driver.findElement(MenuPageLocators.linkHome).click();
	}

	public static void NavigateToAboutPage() {
		MyDriver.driver.findElement(MenuPageLocators.linkAbout).click();
	}

	public static void NavigateToCorporateProgramsPage() {
		MyDriver.driver.findElement(MenuPageLocators.linkCorporatePrograms).click();
	}

	public static void NavigateToCoursesPage() {
		MyDriver.driver.findElement(MenuPageLocators.linkCourses).click();
	}

	public static void NavigateToKayakingPage() {
		MyDriver.driver.findElement(MenuPageLocators.linkKayaking).click();
	}

	public static void NavigateToSailingPage() {
		MyDriver.driver.findElement(MenuPageLocators.linkSailing).click();
	}

	public static void NavigateToSafetyPage() {
		MyDriver.driver.findElement(MenuPageLocators.linkSafety).click();
	}

	public static void NavigateToEventsPage() {
		MyDriver.driver.findElement(MenuPageLocators.linkEvents).click();
	}

	public static void NavigateToNewsGalleryPage() {
		MyDriver.driver.findElement(MenuPageLocators.linkNewsGallery).click();
	}

}
