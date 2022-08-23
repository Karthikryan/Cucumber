package stepDefs;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.But;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginPage {

	ChromeDriver driver;
	
	@Given ("Launch Chrome Browser")
	
		public void LaunchBrowser()
	{

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();

	}
	@And ("Load the URL and Maximize")

	public void loadandMax() {

		driver.get("http://leaftaps.com/opentaps");
		driver.manage().window().maximize();

	}

	@Given ("Enter the username as {string}")

	public void typeusername (String username) {

		driver.findElement(By.id("username")).sendKeys(username);
	}

	@And ("Enter the password as {string}")
	public void typepassword(String password) {
		driver.findElement(By.id("password")).sendKeys(password);
	}	
	@When ("click on the login button")
	public void clickLoginbutton() {
		driver.findElement(By.className("decorativeSubmit")).click();
	}
	
	@Then ("Verify the home page is displayed")
	public void homepage() {
		String attribute = driver.findElement(By.className("decorativeSubmit")).getAttribute("value");
		if(attribute.equals("Logout"))
			System.out.println("Successfully Logged In");	
		else
			System.out.println("Home page is not displayed");				
	}
	
	@But ("Verify the error message page is displayed")
	public void Errormsg() {
		String text = driver.findElement(By.id("errorDiv")).getText();
		System.out.println(text);

	}
}



