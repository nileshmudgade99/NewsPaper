package Steps;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class RegisterPageSteps {

	WebDriver driver;
	@Given("user is on register page")
	public void user_is_on_register_page() {
		
		
	driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
	driver.manage().deleteAllCookies();
	driver.get("https://www.facebook.com/reg");
		
		
	}

	@When("user enter {string}, {string}, {string} and {string}>")
	public void user_enter_and(String firstname , String lastname, String username, String password) {
	    
	driver.findElement(By.name("firstname")).sendKeys(firstname);
	driver.findElement(By.name("lastname")).sendKeys(lastname);
	driver.findElement(By.name("reg_email__")).sendKeys(username);
	driver.findElement(By.name("reg_passwd__")).sendKeys(password);
	}
	
	
}
