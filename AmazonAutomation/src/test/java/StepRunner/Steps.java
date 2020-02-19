package StepRunner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Steps {
	
	WebDriver driver;
	@Given("^Open the Chrome and launch the application$")					
    public void open_the_Chrome_and_launch_the_application() throws Throwable							
    {		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\rupam\\Desktop\\automate\\chromedriver_win32\\chromedriver.exe");					
       driver= new ChromeDriver();					
       driver.manage().window().maximize();			
       driver.get("https://www.amazon.com/ap/signin?_encoding=UTF8&ignoreAuthState=1&openid.assoc_handle=usflex&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.mode=checkid_setup&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0&openid.ns.pape=http%3A%2F%2Fspecs.openid.net%2Fextensions%2Fpape%2F1.0&openid.pape.max_auth_age=0&openid.return_to=https%3A%2F%2Fwww.amazon.com%2F%3Fref_%3Dnav_custrec_signin&switch_account=");
    }
	@When("^Enter the (.*) and (.*)$")  
	public void enter_the_email_and_password(String email,String password) throws InterruptedException
	{
		//Enter email 
		driver.findElement(By.xpath("//input[@id=\"ap_email\"]")).sendKeys(email);
		//Click on continue button
		driver.findElement(By.xpath("//input[@id=\"continue\"]")).click();
		Thread.sleep(2000);
		//Enter password
		driver.findElement(By.xpath("//input[@id=\"ap_password\"]")).sendKeys(password);
		
	}
	@Then("^Click on SignIn Button$")
	public void click_on_signIn_Button()throws Throwable	
	{
		Thread.sleep(2000);
		//Click on sign in button
		driver.findElement(By.xpath("//input[@id=\"signInSubmit\"]")).click();
	}

}
