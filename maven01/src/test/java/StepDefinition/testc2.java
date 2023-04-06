package StepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class testc2 {
	
	WebDriver driver;
	
	@Given("Navigate desktop page")
	public void navigate_desktop_page() {
		
		
	    // Write code here that turns the phrase above into concrete actions
		
		String url="https://demo.opencart.com/";
		WebDriverManager.edgedriver();
		WebDriver driver=new EdgeDriver();
		driver.get(url);
		
	    throw new io.cucumber.java.PendingException();
	}

	@And("click on mac")
	public void click_on_mac() {
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(By.linkText("Desktop")).click();
	    throw new io.cucumber.java.PendingException();
	}

	@And("click on a-z")
	public void click_on_a_z() {
	    // Write code here that turns the phrase above into concrete actions
		
		Select sortlist=new Select(driver.findElement(By.id("input-sort")));
		
		sortlist.selectByIndex(3);
		
	    throw new io.cucumber.java.PendingException();
	}

	@When("click on Add to cart button")
	public void click_on_add_to_cart_button() {
	    // Write code here that turns the phrase above into concrete actions
		
		driver.findElement(By.xpath("//button[@type='submit']")).click();

	    throw new io.cucumber.java.PendingException();
	}

	@Then("I validate the outcome")
	public void i_validate_the_outcome() {
	    // Write code here that turns the phrase above into concrete actions
		
		System.out.println("hi there , not added in cart");
	    throw new io.cucumber.java.PendingException();
	}


}
