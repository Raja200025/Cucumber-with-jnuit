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

public class LoginDataDefinitions {
	WebDriver driver;

	@Given("^user be in the orange HRM login page$")
	public void user_be_in_the_orange_HRM_login_page() throws Throwable {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

	}

	@When("^user enter valid credentials username: \"([^\"]*)\" and password : \"([^\"]*)\"$")
	public void user_enter_valid_credentials_username_and_password(String arg1, String arg2) throws Throwable {
		WebDriverWait wait = new WebDriverWait(driver, 60000);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("username")));

		WebElement username = driver.findElement(By.name("username"));
		username.sendKeys("Admin");
		WebElement password = driver.findElement(By.name("password"));
		password.sendKeys("admin123");

	}

	@When("^clicks login button$")
	public void clicks_login_button() throws Throwable {

		WebElement loginBtn = driver.findElement(By.xpath("//*[@type='submit']"));
		loginBtn.click();

	}

	@Then("^user should see the homepage$")
	public void user_should_see_the_homepage() throws Throwable {
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
