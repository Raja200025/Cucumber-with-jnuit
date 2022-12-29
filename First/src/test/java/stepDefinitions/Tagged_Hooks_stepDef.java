package stepDefinitions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Tagged_Hooks_stepDef {

	@Given("^this is first first step$")
	public void this_is_first_first_step() throws Throwable {

		System.out.println("this is first first step");

	}

	@When("^this is second step$")
	public void this_is_second_step() throws Throwable {
		System.out.println("this is second step");
	}

	@Then("^this is third step$")
	public void this_is_third_step() throws Throwable {
		System.out.println("this is third step");

	}

}
