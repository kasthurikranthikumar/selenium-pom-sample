package blogs.selinium_pom.com.theyachtclub.pom.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import blogs.selinium_pom.com.theyachtclub.pom.pages.HomePage;
import blogs.selinium_pom.com.theyachtclub.pom.pages.MenuPage;
import blogs.selinium_pom.com.theyachtclub.utils.driver.MyDriver;

public class HomePageTest {
	
		
	@Test
	public void testLearnToSail(){
		MyDriver.driver.get("http://theyachtclub.in/");
		MyDriver.driver.manage().window().maximize();
		HomePage.NavigateToLearnSailing();
		Assert.assertTrue(MyDriver.driver.getCurrentUrl().contains("http://theyachtclub.in/courses-and-tutorials"),"Filed to navigate");
		
	}
	
	@Test
	public void testNavigateToAboutPage(){
		MyDriver.driver.get("http://theyachtclub.in/");
		MyDriver.driver.manage().window().maximize();
		MenuPage.NavigateToAboutPage();
		Assert.assertTrue(MyDriver.driver.getCurrentUrl().contains("http://theyachtclub.in/how-it-all-started/"));
		
	}

}
