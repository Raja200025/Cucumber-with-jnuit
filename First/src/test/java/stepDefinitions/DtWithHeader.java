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

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class DtWithHeader {
	WebDriver driver;

	@Given("^user should go the orange HRM login page$")
	public void user_should_go_the_orange_HRM_login_page() throws Throwable {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	}

	@When("^user enter valid username and valid password as per the given below$")
	public void user_enter_valid_username_and_valid_password_as_per_the_given_below(DataTable DataTable)
			throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		// For automatic transformation, change DataTable to one of
		// List<YourType>, List<List<E>>, List<Map<K,V>> or Map<K,V>.
		// E,K,V must be a scalar (String, Integer, Date, enum etc)

		List<Map<String, String>> keyValuePair = DataTable.asMaps(String.class, String.class);

		String username = keyValuePair.get(0).get("username");
		String password = keyValuePair.get(0).get("password");

		WebDriverWait wait = new WebDriverWait(driver, 60000);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("username")));

		WebElement userName = driver.findElement(By.name("username"));
		userName.sendKeys(username);
		System.out.println("username : "+username);
		WebElement passWord = driver.findElement(By.name("password"));
		System.out.println("password : "+password);
		passWord.sendKeys(password);

	}

	@When("^clicks the login button present in the login page$")
	public void clicks_the_login_button_present_in_the_login_page() throws Throwable {
		WebElement loginBtn = driver.findElement(By.xpath("//*[@type='submit']"));
		loginBtn.click();

	}

	@Then("^user should able to see the homepage or landing page$")
	public void user_should_able_to_see_the_homepage_or_landing_page() throws Throwable {

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
