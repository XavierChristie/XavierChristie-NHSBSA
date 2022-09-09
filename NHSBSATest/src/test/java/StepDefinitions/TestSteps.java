package StepDefinitions;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import PageClasses.EligibilityCheckerPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;







public class TestSteps{
	WebDriver driver=null;
	
	@Given("I am a person from Wales")
	public void i_am_a_person_from_wales() throws InterruptedException, IOException {
		try {
			//Chromedriver
		    System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\driver\\chromedriver.exe");
		    driver = new ChromeDriver();
		    
		    //Firefoxdriver
		    //System.setProperty("webdriver.gecko.driver","System.getProperty(\"user.dir\")+\"\\driver\\geckodriver.exe");
		    //WebDriver driver = new FirefoxDriver();
		    
			
			EligibilityCheckerPage eligiblitycheckPage = new EligibilityCheckerPage(driver);
			driver.manage().window().maximize();
			driver.get("https://services.nhsbsa.nhs.uk/check-for-help-paying-nhs-costs/start");
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			eligiblitycheckPage.Verify_PageTitle("Check what help you could get to pay for NHS costs - NHSBSA");
			eligiblitycheckPage.click_DoNotUseCookies();
            
        } catch (Exception e) {
        	take_screenshot(driver,"\\screenshot\\TestFail-Given.png");
            System.out.println(e.getMessage());
        }
		   
	}

	@When("I put my circumstances into the Checker tool")
	public void i_put_my_circumstances_into_the_checker_tool() throws InterruptedException, IOException {	
		try
		{
			EligibilityCheckerPage eligiblitycheckPage = new EligibilityCheckerPage(driver);
			System.out.println("When");
			eligiblitycheckPage.click_StartNow();
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
		} catch (Exception e) {
			take_screenshot(driver,"\\screenshot\\TestFail-When.png");
            System.out.println(e.getMessage());
		}
	    
	}

	@Then("I should get a result of whether I will get help or not")
	public void i_should_get_a_result_of_whether_i_will_get_help_or_not() throws InterruptedException, IOException {	
		try
		{
			EligibilityCheckerPage eligiblitycheckPage = new EligibilityCheckerPage(driver);
			System.out.println("Then");
			eligiblitycheckPage.Verify_YouGetFree_text("You get free:");
			eligiblitycheckPage.Verify_PageTitle("You get help with health costs - Check what help you could get to pay for NHS costs - NHSBSA");
			eligiblitycheckPage.Verify_How_to_get_your_help_text();
			eligiblitycheckPage.Verify_NHS_Prescription_text();
			eligiblitycheckPage.Verify_Entitlement_Card_text();
			take_screenshot(driver,"\\screenshot\\TestPass.png");
			driver.quit();
			System.out.println("execution completed");
		} catch (Exception e) {
			take_screenshot(driver,"\\screenshot\\TestFail-Then.png");
            System.out.println(e.getMessage());
		}
	   
	}
	
	
	
	public void take_screenshot(WebDriver driver,String Destination) throws IOException {
		 TakesScreenshot scrShot =((TakesScreenshot)driver); 
		 File SrcFile=scrShot.getScreenshotAs(OutputType.FILE);
		 File DestFile=new File(System.getProperty("user.dir")+Destination);
		 FileUtils.copyFile(SrcFile, DestFile);

	}
	
	
	

}
