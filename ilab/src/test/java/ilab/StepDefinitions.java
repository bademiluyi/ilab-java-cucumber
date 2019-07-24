package ilab;

import org.sikuli.guide.Guide;
import org.sikuli.script.Region;
import org.sikuli.script.Screen;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import ilab.ilab.Belly;

public class StepDefinitions {
	
	
	@Given("^I have (\\d+) cukes in my belly$")
    public void I_have_cukes_in_my_belly(int cukes) throws Throwable {
        
		Screen s1 = new Screen();
		/*Region chromeRegion = new Region(241, 765, 48, 32);
    	
		Guide guide = new Guide(chromeRegion);
		guide.text("Chrome!");
		guide.showNow(5);	*/
		
		s1.find("imgs/chromeicon.png");
		s1.click("imgs/chromeicon.png",0);
		
		Belly belly = new Belly();
        belly.eat();
    }

@When("^I wait (\\d+) hour$")
public void i_wait_hour(int arg1) throws Exception {
	Belly belly = new Belly();
    belly.eat();
}

@Then("^my belly should growl$")
public void my_belly_should_growl() throws Exception {
	Belly belly = new Belly();
    belly.eat();
}

}
