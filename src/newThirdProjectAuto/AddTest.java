package newThirdProjectAuto;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class AddTest {

	public class MyTestcases {
		
		WebDriver driver = new ChromeDriver();
		
		@BeforeTest
		public void mysetUp() {
			driver.get("https://www.saucedemo.com/");
			driver.manage().window().maximize();
			
			
		}
	
		@Test (priority = 1)
		public void loginTest() {
		String username ="standard_user";
		String password = "secret_sauce";
			
		WebElement usernameInput =   driver.findElement(By.id("user-name"));
		WebElement passwordInput =   driver.findElement(By.id("password"));
		WebElement loginButton =     driver.findElement(By.id("login-button"));
		
			usernameInput.sendKeys(username);
			passwordInput.sendKeys(password);
			loginButton.click();

		}
		
		@Test(priority = 2)
		public void addToCard4Items() {
			List<WebElement> AddtoCartButtons = driver.findElements(By.className("btn"));
			for (int i=0 ; i < AddtoCartButtons.size() ;i++) {
			AddtoCartButtons.get(i).click();
			 if (i == 3) {
				 break ;
			// string n = "l" ;  Error Unreachable code
			 }
			 
			}
		
		
		}
		
	}
}
