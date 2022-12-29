package hooks;

import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Use_hooks_in_background {
	@Before
	public void beforeScenrio() {
		System.out.println("before scenarios");
	}

	@After
	public void After_Scenrio() {
		System.out.println("After Scenarios");
	}

}
