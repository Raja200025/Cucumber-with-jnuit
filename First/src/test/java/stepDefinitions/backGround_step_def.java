package stepDefinitions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class backGround_step_def {

	@Given("^student must completed high school$")
	public void student_must_completed_high_school() throws Throwable {
		System.out.println("student must completed high school");

	}

	@Given("^student must completed highersecondary school$")
	public void student_must_completed_highersecondary_school() throws Throwable {
		System.out.println("student must completed highersecondary school");

	}

	@Given("^student applied for the medical entrance exam$")
	public void student_applied_for_the_medical_entrance_exam() throws Throwable {
		System.out.println("student applied for the medical entrance exam");

	}

	@When("^student cleared the ebtrance exam$")
	public void student_cleared_the_ebtrance_exam() throws Throwable {
		System.out.println("student cleared the ebtrance exam");
	}

	@Then("^student can join any of the medical colleage$")
	public void student_can_join_any_of_the_medical_colleage() throws Throwable {
		System.out.println("student can join any of the medical colleage");

	}

	@Given("^student applied for the enginnering course$")
	public void student_applied_for_the_enginnering_course() throws Throwable {

		System.out.println("student applied for the enginnering course");
	}

	@When("^student has a good enginering cut-off$")
	public void student_has_a_good_enginering_cut_off() throws Throwable {
		System.out.println("student has a good enginering cut-off");

	}

	@Then("^student can join any of the engineering colleage$")
	public void student_can_join_any_of_the_engineering_colleage() throws Throwable {
		System.out.println("student can join any of the engineering colleage");

	}

}
