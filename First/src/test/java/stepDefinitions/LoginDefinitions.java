package stepDefinitions;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginDefinitions {

	WebDriver driver;

	@Given("^user be on orange HRM login page$")
	public void user_be_on_orange_HRM_login_page() throws Throwable {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

	}

	@When("^user enter valid username and valid password$")
	public void user_enter_valid_username_and_valid_password() throws Throwable {

		WebDriverWait wait = new WebDriverWait(driver, 60000);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("username")));

		WebElement username = driver.findElement(By.name("username"));
		username.sendKeys("Admin");
		WebElement password = driver.findElement(By.name("password"));
		password.sendKeys("admin123");
	}

	@When("^click the login button$")
	public void click_the_login_button() throws Throwable {

		WebElement loginBtn = driver.findElement(By.xpath("//*[@type='submit']"));
		loginBtn.click();

	}

	@Then("^user should navigate to homepage$")
	public void user_should_navigate_to_homepage() throws Throwable {
		WebDriverWait wait = new WebDriverWait(driver, 60000);
		wait.until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath("//*[@class='oxd-topbar-header-breadcrumb']/child::h6")));

		boolean result = driver.findElement(By.xpath("//*[@class='oxd-topbar-header-breadcrumb']/child::h6"))
				.isDisplayed();
		Assert.assertTrue(result);
		System.out.println("All the progress completed successfully...!!!");
		driver.quit();// to close the entire browser
	}

}
