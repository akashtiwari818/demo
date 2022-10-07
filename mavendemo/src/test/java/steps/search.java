package steps;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class search {
	WebDriver driver;

@Given("the user opens google")
public void the_user_opens_google() {
	 driver = new ChromeDriver();
	driver.get("http://www.google.co.in");

    // Write code here that turns the phrase above into concrete actions
   
}
@When("he enters a text and clicks on submit")
public void he_enters_a_text_and_clicks_on_submit() {
	
	driver.findElement(By.name("q")).sendKeys("learning selenium");
	driver.findElement(By.name("q")).submit();
    // Write code here that turns the phrase above into concrete actions
   
}
@Then("the system displays the web site names")
public void the_system_displays_the_web_site_names() {
	driver.quit();
    // Write code here that turns the phrase above into concrete actions
   
}



}
