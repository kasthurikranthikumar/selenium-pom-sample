package blogs.selinium_pom.com.theyachtclub.pom.pages;

import blogs.selinium_pom.com.theyachtclub.pom.locators.CoursesPageLocators;
import blogs.selinium_pom.com.theyachtclub.utils.driver.MyDriver;

public class CoursesPage {
	public static void NavigateToCourse() {
		MyDriver.driver.findElement(CoursesPageLocators.linkCourses).click();
	}

	public static void NavigateQuickExp() {
		MyDriver.driver.findElement(CoursesPageLocators.linkQuickExp).click();
	}
}
