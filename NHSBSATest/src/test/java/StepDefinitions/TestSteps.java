package StepDefinitions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import PageClasses.EligibilityCheckerPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;



public class TestSteps{
	WebDriver driver=null;
	
	@Given("I am a person from Wales")
	public void i_am_a_person_from_wales() throws InterruptedException {
		
		System.out.println(System.getProperty("user.dir"));
	    System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\driver\\chromedriver.exe");
	    
		driver = new ChromeDriver();
		EligibilityCheckerPage eligiblitycheckPage = new EligibilityCheckerPage(driver);
		//Thread.sleep(5000);
		driver.manage().window().maximize();
		driver.get("https://services.nhsbsa.nhs.uk/check-for-help-paying-nhs-costs/start");
		Thread.sleep(5000);
		eligiblitycheckPage.click_DoNotUseCookies();
		eligiblitycheckPage.click_StartNow();
	   
	}

	@When("I put my circumstances into the Checker tool")
	public void i_put_my_circumstances_into_the_checker_tool() throws InterruptedException {
		
		EligibilityCheckerPage eligiblitycheckPage = new EligibilityCheckerPage(driver);
		System.out.println("When");
		eligiblitycheckPage.Verify_Question1_text();
		eligiblitycheckPage.Select_Wales();
		eligiblitycheckPage.Click_Next();
		eligiblitycheckPage.Verify_Question2_text();
		eligiblitycheckPage.Select_Yes();
		eligiblitycheckPage.Click_Next();
		eligiblitycheckPage.Verify_Question3_text();
		eligiblitycheckPage.Select_Wales();
		eligiblitycheckPage.Click_Next();
		eligiblitycheckPage.Verify_Question4_text();
		eligiblitycheckPage.Enter_DOB("01", "01", "1991");
		eligiblitycheckPage.Click_Next();
		eligiblitycheckPage.Verify_Question5_text();
		eligiblitycheckPage.Select_No();
		eligiblitycheckPage.Click_Next();
		eligiblitycheckPage.Verify_Question6_text();
		eligiblitycheckPage.Select_No();
		eligiblitycheckPage.Click_Next();
		eligiblitycheckPage.Verify_Question7_text();
		eligiblitycheckPage.Select_No();
		eligiblitycheckPage.Click_Next();
		eligiblitycheckPage.Verify_Question8_text();
		eligiblitycheckPage.Select_No();
		eligiblitycheckPage.Click_Next();
		eligiblitycheckPage.Verify_Question9_text();
		eligiblitycheckPage.Select_No();
		eligiblitycheckPage.Click_Next();
		eligiblitycheckPage.Verify_Question10_text();
		eligiblitycheckPage.Select_No();
		eligiblitycheckPage.Click_Next();
		eligiblitycheckPage.Verify_Question11_text();
		eligiblitycheckPage.Select_No();
		eligiblitycheckPage.Click_Next();
		eligiblitycheckPage.Verify_Question12_text();
		eligiblitycheckPage.Select_Yes();
		eligiblitycheckPage.Click_Next();
	    
	}

	@Then("I should get a result of whether I will get help or not")
	public void i_should_get_a_result_of_whether_i_will_get_help_or_not() throws InterruptedException {
		
		EligibilityCheckerPage eligiblitycheckPage = new EligibilityCheckerPage(driver);
		System.out.println("Then");
		eligiblitycheckPage.Verify_YouGetFree_text();
		eligiblitycheckPage.Verify_How_to_get_your_help_text();
		eligiblitycheckPage.Verify_NHS_Prescription_text();
		eligiblitycheckPage.Verify_Entitlement_Card_text();
	
		driver.quit();
		System.out.println("execution completed");
	   
	}
	
	
	

}
