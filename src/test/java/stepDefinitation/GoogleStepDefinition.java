package stepDefinitation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class GoogleStepDefinition {
	
	WebDriver driver;
	
	@Before
	public void setUp() {
		System.setProperty("webdriver.chrome.driver", "src/test/resources/executables/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}
	
	@After
	public void tearDown() {
		driver.quit();
	}
	
	@Given("Navigate to Google page")
	public void navigate_to_Google_page() {
		driver.get("https://www.google.com/");
	    
	}

	@Then("Enter {string} as text")
	public void enter_as_text(String text) {
		driver.findElement(By.name("q")).sendKeys(text);
	}

}
