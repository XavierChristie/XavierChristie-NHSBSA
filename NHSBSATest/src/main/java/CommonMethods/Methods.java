package CommonMethods;



import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;






public class Methods {
	
	
	public WebDriver driver;
	
	public void Input_Text(WebDriver driver,String input,String locator) {
		driver.findElement(By.xpath(locator)).sendKeys(input);
	}

	
	public void Click_Button(WebDriver driver,String locator) {
		driver.findElement(By.xpath(locator)).click();
	}


	public void Select_Radiobutton(WebDriver driver,String locator) {
		driver.findElement(By.xpath(locator)).click();
	}
	
	public void Verify_Webelement_Displayed(WebDriver driver,String locator) {
		driver.findElement(By.xpath(locator)).click();
	}
	
	public void Verify_Webelement_Enabled(WebDriver driver,String locator) {
		driver.findElement(By.xpath(locator)).click();
	}
	
	
	public void Verify_Text(WebDriver driver,String locator,String expected) {
		String actual= driver.findElement(By.xpath(locator)).getText();
		Assert.assertEquals( expected,actual);
		
	}	
	
	public void Verify_CurrentPageTitle(WebDriver driver,String expected) {
		String actual= driver.getTitle();
		Assert.assertEquals(expected,actual);
		
	}
	

}
