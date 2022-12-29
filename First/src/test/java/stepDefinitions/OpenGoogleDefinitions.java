package stepDefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class OpenGoogleDefinitions {

	WebDriver driver;

	@Given("^user enters in google\\.com$")
	public void user_enters_in_google_com() throws Throwable {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("http://www.google.com");

	}

	@When("^users enters search term as \"([^\"]*)\"$")
	public void users_enters_search_term_as(String searchTerm) throws Throwable {
		WebElement searchbox = driver.findElement(By.name("q"));
		searchbox.sendKeys(searchTerm);

	}

	@When("^click search button or hit enter button in the keyboard$")
	public void click_search_button_or_hit_enter_button_in_the_keyboard() throws Throwable {
		driver.findElement(By.name("q")).sendKeys(Keys.RETURN);
//		driver.findElement(By.name("q"+Keys.ENTER));

	}

	@Then("^user should see the search results$")
	public void user_should_see_the_search_results() throws Throwable {

		Boolean result = driver.findElement(By.partialLinkText("current affairs")).isDisplayed();
		if (result) {
			System.out.println("Process Ran successfully..!!!");
		}
		driver.quit();
	}

}
