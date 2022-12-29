package stepDefinitions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;

public class DataTablesWithoutHeaderDef {
	WebDriver driver;

	@Given("^user should be on the orange HRM Login page$")
	public void user_should_be_on_the_orange_HRM_Login_page() throws Throwable {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	}

	@When("^user enter the valid username and password$")
	public void user_enter_the_valid_username_and_password(DataTable dataTable) throws Throwable {
		WebDriverWait wait = new WebDriverWait(driver, 60000);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("username")));

		List<String> credentials = dataTable.asList(String.class);
		String validUsername = credentials.get(0);
		String validPassword = credentials.get(1);
		System.out.println("username : " + validUsername);
		System.out.println("password : " + validPassword);

		WebElement username = driver.findElement(By.name("username"));
		username.sendKeys(validUsername);

		WebElement password = driver.findElement(By.name("password"));

		password.sendKeys(validPassword);
	}

	@When("^user click the login button$")
	public void user_click_the_login_button() throws Throwable {

		WebElement loginBtn = driver.findElement(By.xpath("//*[@type='submit']"));
		loginBtn.click();

		driver.quit(); // to close the browser

	}
}
