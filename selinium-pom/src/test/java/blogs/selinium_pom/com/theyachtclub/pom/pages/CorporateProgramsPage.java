package blogs.selinium_pom.com.theyachtclub.pom.pages;

import blogs.selinium_pom.com.theyachtclub.pom.locators.CorporateProgramsPageLocators;
import blogs.selinium_pom.com.theyachtclub.utils.driver.MyDriver;

public class CorporateProgramsPage {
	public static void NavigateToDownload() {
		MyDriver.driver.findElement(CorporateProgramsPageLocators.linkDownload).click();
	}
}
