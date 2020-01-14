package br.com.rsi.hub_tdd.steps.login_page;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import br.com.rsi.hub_tdd.steps.home_page.CreateNewAccount;

public class NewUserPage {
	private WebDriver driver;
	
	public NewUserPage(WebDriver driver) {
		this.driver = driver;
	}
	
	public CreateNewAccount clickSignIn() {
		driver.findElement(By.id("menuUser")).click();
		
		return new CreateNewAccount(driver);
	}
	
//	private static WebElement element = null;
//	
////	public static WebElement txtbx_UserName(WebDriver driver) {
////		
////		element = driver.findElement(By.name("username"));
////		return element;
////	}
////	
////	public static WebElement txtbx_Password(WebDriver driver) {
////		element = driver.findElement(By.name("password"));
////		return element;
////	}
//	public static WebElement btn_NewUser(WebDriver driver) {
//		
//		WebDriverWait wait = new WebDriverWait(driver, 5);
//		WebElement espera = wait.until(ExpectedConditions.elementToBeClickable(By.linkText("CREATE NEW ACCOUNT")));
//		espera.sendKeys(Keys.ENTER);
//		element = driver.findElement(By.linkText("CREATE NEW ACCOUNT"));
//		return element;
//	}

}