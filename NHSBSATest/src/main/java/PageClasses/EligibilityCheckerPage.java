package PageClasses;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import CommonMethods.Methods;

public class EligibilityCheckerPage extends Methods{

	public WebDriver driver;
	
	public static String Do_Not_Use_Cookies_Button ="//button[text()='Do not use analytics cookies']";
	public static String Start_Now_Button = "//input[@id='next-button' and @value='Start now']";
	
	public static String Wales_Radiobutton = "//input[@id='radio-wales']";
	
	public static String Next_Button = "//input[@id='next-button']";
	
	public static String Yes_Radiobutton = "//input[@id='radio-yes']";
	
	public static String Day_TextField = "//input[@id='dob-day']";
	
	public static String Month_TextField = "//input[@id='dob-month']";
	
	public static String Year_TextField = "//input[@id='dob-year']";
	
	public static String No_Radiobutton = "//input[@id='radio-no']";
	
	public static String You_get_free_Text = "//h2[contains(text(),'You get free:')]";
	
	public static String NHS_Prescription_Text = "//span[contains(text(),'If your prescription is dispensed in Wales or you have an Entitlement Card')]";
	
	public static String How_to_get_your_help_Text = "//h2[contains(text(),'How to get your help')]";
	
	public static String Entitlement_Card_Text = "//h3[contains(text(),'How to apply for an Entitlement Card')]";
	
	
	public static String Q1_Text = "//h1[contains(text(),'Which country do you live in?')]";
	public static String Q2_Text = "//h1[contains(text(),'Is your GP practice in Scotland or Wales?')]";
	public static String Q3_Text = "//h1[contains(text(),'Which country is your dental practice in?')]";
	public static String Q4_Text = "//h1[contains(text(),'What is your date of birth?')]";
	public static String Q5_Text = "//h1[contains(text(),'Do you live with a partner?')]";
	public static String Q6_Text = "//span[contains(text(),'Do you claim any benefits or tax credits?')]";
	public static String Q7_Text = "//h1[contains(text(),'Are you pregnant or have you given birth in the last 12 months?')]";
	public static String Q8_Text = "//h1[contains(text(),'Do you have an injury or illness caused by serving in the armed forces?')]";
	public static String Q9_Text = "//h1[contains(text(),'Do you have diabetes?')]";
	public static String Q10_Text = "//span[contains(text(),'Do you have glaucoma?')]";
	public static String Q11_Text = "//span[contains(text(),'Do you live permanently in a care home?')]";
	public static String Q12_Text = "//span[contains(text(),'Do you have more than £16,000 in savings, investments or property?')]";
			
	

	public  EligibilityCheckerPage(WebDriver driver) {
		this.driver = driver;
	}
	
	public void click_DoNotUseCookies() {
		Click_Button(driver,Do_Not_Use_Cookies_Button);
		//driver.findElement(By.xpath(Do_Not_Use_Cookies_Button)).click();
		
	}
	
	
	public void click_StartNow() {
		Click_Button(driver,Start_Now_Button);
		//driver.findElement(By.xpath(Start_Now_Button)).click();
		
	}
	
	public void Select_Wales() throws InterruptedException {
		Thread.sleep(1000);
		Select_Radiobutton(driver,Wales_Radiobutton);
		//driver.findElement(By.xpath(Wales_Radiobutton)).click();
		
	}
	
	
	public void Select_Yes() throws InterruptedException {
		Thread.sleep(1000);
		Select_Radiobutton(driver,Yes_Radiobutton);
		//driver.findElement(By.xpath(Yes_Radiobutton)).click();
		
	}
	
	public void Select_No() throws InterruptedException {
		Thread.sleep(1000);
		Select_Radiobutton(driver,No_Radiobutton);
		//driver.findElement(By.xpath(No_Radiobutton)).click();
		
	}
	
	public void Click_Next() throws InterruptedException {
		Thread.sleep(1000);
		Select_Radiobutton(driver,Next_Button);
		//driver.findElement(By.xpath(Next_Button)).click();
		
	}
	
	
	public void Enter_DOB(String day, String month,String year) throws InterruptedException {
		Thread.sleep(1000);
		Input_Text(driver,day,Day_TextField);
		//driver.findElement(By.xpath(Day_TextField)).sendKeys(day);
		Thread.sleep(1000);
		Input_Text(driver,month,Month_TextField);
		//driver.findElement(By.xpath(Month_TextField)).sendKeys(month);
		Thread.sleep(1000);
		Input_Text(driver,year,Year_TextField);
		//driver.findElement(By.xpath(Year_TextField)).sendKeys(year);
		
		
	}
	
	
	public void Verify_YouGetFree_text(String Text) throws InterruptedException {
		Thread.sleep(1000);
		Verify_Text( driver, You_get_free_Text,Text);
		//Verify_Webelement_Displayed(driver,You_get_free_Text);
		//driver.findElement(By.xpath(You_get_free_Text)).isDisplayed();
		
	}
	public void Verify_Question1_text() throws InterruptedException {
		Thread.sleep(1000);
		Verify_Webelement_Displayed(driver,Q1_Text);
		//driver.findElement(By.xpath(Q1_Text)).isDisplayed();
		
	}
	
	public void Verify_Question2_text() throws InterruptedException {
		Thread.sleep(1000);
		Verify_Webelement_Displayed(driver,Q2_Text);
		//iver.findElement(By.xpath(Q2_Text)).isDisplayed();
		
	}
	
	public void Verify_Question3_text() throws InterruptedException {
		Thread.sleep(1000);
		Verify_Webelement_Displayed(driver,Q3_Text);
		//driver.findElement(By.xpath(Q3_Text)).isDisplayed();
		
	}
	
	public void Verify_Question4_text() throws InterruptedException {
		Thread.sleep(1000);
		Verify_Webelement_Displayed(driver,Q4_Text);
		//driver.findElement(By.xpath(Q4_Text)).isDisplayed();
		
	}
	
	public void Verify_Question5_text() throws InterruptedException {
		Thread.sleep(1000);
		Verify_Webelement_Displayed(driver,Q5_Text);
		//driver.findElement(By.xpath(Q5_Text)).isDisplayed();
		
	}
	
	public void Verify_Question6_text() throws InterruptedException {
		Thread.sleep(1000);
		Verify_Webelement_Displayed(driver,Q6_Text);
		//driver.findElement(By.xpath(Q6_Text)).isDisplayed();
		
	}
	
	public void Verify_Question7_text() throws InterruptedException {
		Thread.sleep(1000);
		Verify_Webelement_Displayed(driver,Q7_Text);
		//driver.findElement(By.xpath(Q7_Text)).isDisplayed();
		
	}
	
	public void Verify_Question8_text() throws InterruptedException {
		Thread.sleep(1000);
		Verify_Webelement_Displayed(driver,Q8_Text);
		//driver.findElement(By.xpath(Q8_Text)).isDisplayed();
		
	}
	
	public void Verify_Question9_text() throws InterruptedException {
		Thread.sleep(1000);
		Verify_Webelement_Displayed(driver,Q9_Text);
		//driver.findElement(By.xpath(Q9_Text)).isDisplayed();
		
	}
	
	public void Verify_Question10_text() throws InterruptedException {
		Thread.sleep(1000);
		Verify_Webelement_Displayed(driver,Q10_Text);
		//driver.findElement(By.xpath(Q10_Text)).isDisplayed();
		
	}
	
	public void Verify_Question11_text() throws InterruptedException {
		Thread.sleep(1000);
		Verify_Webelement_Displayed(driver,Q11_Text);
		//driver.findElement(By.xpath(Q11_Text)).isDisplayed();
		
	}
	
	public void Verify_Question12_text() throws InterruptedException {
		Thread.sleep(1000);
		Verify_Webelement_Displayed(driver,Q12_Text);
		//driver.findElement(By.xpath(Q12_Text)).isDisplayed();
		
	}
	
	public void Verify_NHS_Prescription_text() throws InterruptedException {
		Thread.sleep(1000);
		Verify_Webelement_Displayed(driver,NHS_Prescription_Text);
		//driver.findElement(By.xpath(NHS_Prescription_Text)).isDisplayed();
		
	}
	
	public void Verify_How_to_get_your_help_text() throws InterruptedException {
		Thread.sleep(1000);
		Verify_Webelement_Displayed(driver,How_to_get_your_help_Text);
		//driver.findElement(By.xpath(How_to_get_your_help_Text)).isDisplayed();
		
	}
	
	public void Verify_Entitlement_Card_text() throws InterruptedException {
		Thread.sleep(1000);
		Verify_Webelement_Enabled(driver,Entitlement_Card_Text);
		//driver.findElement(By.xpath(Apply_for_further_help_Text)).isEnabled();
		
	}
	
	public void Verify_PageTitle(String Title) throws InterruptedException {
		Thread.sleep(1000);
		Verify_CurrentPageTitle(driver,Title);
		//driver.findElement(By.xpath(Apply_for_further_help_Text)).isEnabled();
		
	}
	

}
