package PageClasses;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class EligibilityCheckerPage {

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
	
	public static String NHS_Prescription_Text = "//span[contains(text(),'If your prescription is dispensed in Wales or you have an Entitlement Card)]";
	
	
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
		
		driver.findElement(By.xpath(Do_Not_Use_Cookies_Button)).click();
		
	}
	
	
	public void click_StartNow() {
		
		driver.findElement(By.xpath(Start_Now_Button)).click();
		
	}
	
	public void Select_Wales() throws InterruptedException {
		Thread.sleep(1000);
		driver.findElement(By.xpath(Wales_Radiobutton)).click();
		
	}
	
	
	public void Select_Yes() throws InterruptedException {
		Thread.sleep(2000);
		driver.findElement(By.xpath(Yes_Radiobutton)).click();
		
	}
	
	public void Select_No() throws InterruptedException {
		Thread.sleep(1000);
		driver.findElement(By.xpath(No_Radiobutton)).click();
		
	}
	
	public void Click_Next() throws InterruptedException {
		Thread.sleep(1000);
		driver.findElement(By.xpath(Next_Button)).click();
		
	}
	
	
	public void Enter_DOB(String day, String month,String year) throws InterruptedException {
		Thread.sleep(1000);
		driver.findElement(By.xpath(Day_TextField)).sendKeys(day);
		Thread.sleep(1000);
		driver.findElement(By.xpath(Month_TextField)).sendKeys(month);
		Thread.sleep(1000);
		driver.findElement(By.xpath(Year_TextField)).sendKeys(year);
		
		
	}
	
	
	public void Verify_YouGetFree_text() throws InterruptedException {
		Thread.sleep(1000);
		driver.findElement(By.xpath(You_get_free_Text)).isDisplayed();
		
	}
	public void Verify_Question1_text() throws InterruptedException {
		Thread.sleep(1000);
		driver.findElement(By.xpath(Q1_Text)).isDisplayed();
		
	}
	
	public void Verify_Question2_text() throws InterruptedException {
		Thread.sleep(1000);
		driver.findElement(By.xpath(Q2_Text)).isDisplayed();
		
	}
	
	public void Verify_Question3_text() throws InterruptedException {
		Thread.sleep(1000);
		driver.findElement(By.xpath(Q3_Text)).isDisplayed();
		
	}
	
	public void Verify_Question4_text() throws InterruptedException {
		Thread.sleep(1000);
		driver.findElement(By.xpath(Q4_Text)).isDisplayed();
		
	}
	
	public void Verify_Question5_text() throws InterruptedException {
		Thread.sleep(1000);
		driver.findElement(By.xpath(Q5_Text)).isDisplayed();
		
	}
	
	public void Verify_Question6_text() throws InterruptedException {
		Thread.sleep(1000);
		driver.findElement(By.xpath(Q6_Text)).isDisplayed();
		
	}
	
	public void Verify_Question7_text() throws InterruptedException {
		Thread.sleep(1000);
		driver.findElement(By.xpath(Q7_Text)).isDisplayed();
		
	}
	
	public void Verify_Question8_text() throws InterruptedException {
		Thread.sleep(1000);
		driver.findElement(By.xpath(Q8_Text)).isDisplayed();
		
	}
	
	public void Verify_Question9_text() throws InterruptedException {
		Thread.sleep(1000);
		driver.findElement(By.xpath(Q9_Text)).isDisplayed();
		
	}
	
	public void Verify_Question10_text() throws InterruptedException {
		Thread.sleep(1000);
		driver.findElement(By.xpath(Q10_Text)).isDisplayed();
		
	}
	
	public void Verify_Question11_text() throws InterruptedException {
		Thread.sleep(1000);
		driver.findElement(By.xpath(Q11_Text)).isDisplayed();
		
	}
	
	public void Verify_Question12_text() throws InterruptedException {
		Thread.sleep(1000);
		driver.findElement(By.xpath(Q12_Text)).isDisplayed();
		
	}
	
	public void Verify_NHS_Prescription_text() throws InterruptedException {
		Thread.sleep(1000);
		driver.findElement(By.xpath(NHS_Prescription_Text)).isDisplayed();
		
	}
	

}
