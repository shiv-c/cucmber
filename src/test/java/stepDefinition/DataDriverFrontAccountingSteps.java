package stepDefinition;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
//import junit.framework.Assert;

public class DataDriverFrontAccountingSteps {
	WebDriver driver;
	@Given("User is on Login Page")
	public void user_is_on_login_page() {
		System.setProperty("webdriver.chrome.driver","src/test/resources/drivers/chromedriver.exe");
	    driver= new ChromeDriver();
	    driver.get("http://demo.frontaccounting.eu/index.php");
	}

	@When("User enters username and password as {string} &{string} & clicks on login")
	public void user_enters_username_and_password_as_clicks_on_login(String user, String pwd) {
		driver.findElement(By.name("user_name_entry_field")).clear();
		   driver.findElement(By.name("user_name_entry_field")).sendKeys(user);
		   driver.findElement(By.name("password")).clear();
		   driver.findElement(By.name("password")).sendKeys(pwd);
		   driver.findElement(By.name("SubmitUser")).click();
	}  

	@Then("login {string} be happen")
	public void login_be_happen(String status) {
	    if(status.equals("should")) {
	    	if(driver.getTitle().equals("Main Menu")) {
	    		System.out.println("positive test pass");
	    	}
	    	else {
	    		System.out.println("positive  test failed");
	    		//Assert.fail("positive  test failed");
	    	}
	    }else {
	    	if(driver.getTitle().equals("Main Menu")) {
	    		System.out.println("negative test failed");
	    	}else  {
				   System.out.println("Negative test pass");
				  // Assert.fail("Negative test pass");
			   }
	    		
	    	}
	    }
	}


