package stepDefinitions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Thanos_Step_Def {

	@Given("^thanos is collecting the stones in the earth$")
	public void thanos_is_collecting_the_stones_in_the_earth() throws Throwable {
		System.out.println("thanos is collecting the stones in the earth");

	}

	@When("^thanos after collecting all the stones he just sanp the fingers$")
	public void thanos_after_collecting_all_the_stones_he_just_sanp_the_fingers() throws Throwable {
		System.out.println("thanos after collecting all the stones he just sanp the fingers");
	}

	@When("^thanos after snap the fingers half of the living things are died in the earth$")
	public void thanos_after_snap_the_fingers_half_of_the_living_things_are_died_in_the_earth() throws Throwable {
		System.out.println("thanos after snap the fingers half of the living things are died in the earth");
	}

	@Then("^thanos taking the test on his own garden$")
	public void thanos_taking_the_test_on_his_own_garden() throws Throwable {
		System.out.println("thanos taking the test on his own garden");

	}

}
