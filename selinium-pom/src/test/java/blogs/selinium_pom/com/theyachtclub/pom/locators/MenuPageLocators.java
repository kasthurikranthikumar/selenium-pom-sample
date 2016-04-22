package blogs.selinium_pom.com.theyachtclub.pom.locators;

import org.openqa.selenium.By;

public class MenuPageLocators {
	public static By linkHome = By.linkText("Home");
	public static By linkAbout = By.xpath(".//*[@id='mainNavigation']/div[2]/label");
	public static By linkCorporatePrograms = By.linkText("Corporate Programs");
	public static By linkCourses = By.xpath(".//*[@id='mainNavigation']/div[4]/label");
	public static By linkKayaking = By.linkText("Kayaking");
	public static By linkSailing = By.xpath(".//*[@id='mainNavigation']/div[6]/label");
	public static By linkSafety = By.linkText("Safety");
	public static By linkEvents = By.xpath(".//*[@id='mainNavigation']/div[8]/label");
	public static By linkNewsGallery = By.linkText("News Gallery");
}
