package stepDefinitions;

import cucumber.api.java.en.Given;

public class RegularExpressionClass {
	@Given("^I have (\\d+) laptop$")
	public void regex(int lapCount)
	{
		System.out.println("LapCount : "+lapCount);
	}
	
	@Given("^I have (\\d+\\.\\d+) CGPA$")
	public void i_have_CGPA(float CGPA) throws Throwable {
	    
		System.out.println("CGPA : "+CGPA);
	    }
	@Given ("^\"(.*?)\" is elder to \"(.*?)\"$") // or ("^\"([^\"]*)\" is elder to \"([^\"]*)\"$")
	public void is_elder_to(String Elder, String Younger) throws Throwable {
	   System.out.println("Elder : "+Elder);
	   System.out.println("Younger : "+Younger);
	    
	}
	
	


}
