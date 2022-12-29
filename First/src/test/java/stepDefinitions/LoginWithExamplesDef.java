package stepDefinitions;

import java.util.List;
import java.util.Map;

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

public class LoginWithExamplesDef {
	WebDriver driver;

	@Given("^person should be in Orange HRM login page$")
	public void person_should_be_in_Orange_HRM_login_page() throws Throwable {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

	}

	@When("^user enter valid \"([^\"]*)\" and \"([^\"]*)\" as per the given below$")
	public void user_enter_valid_and_as_per_the_given_below(String username, String password) throws Throwable {

		WebDriverWait wait = new WebDriverWait(driver, 60000);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("username")));

		WebElement userName = driver.findElement(By.name("username"));
		userName.sendKeys(username);
		System.out.println("username : " + username);
		WebElement passWord = driver.findElement(By.name("password"));
		System.out.println("password : " + password);
		passWord.sendKeys(password);
	}

	@When("^clicks on the login button$")
	public void clicks_on_the_login_button() throws Throwable {
		WebElement loginBtn = driver.findElement(By.xpath("//*[@type='submit']"));
		loginBtn.click();
	}

	@Then("^user navigate to homepage or landing page$")
	public void user_navigate_to_homepage_or_landing_page() throws Throwable {
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
