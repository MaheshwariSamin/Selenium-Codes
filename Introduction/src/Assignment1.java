import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Assignment1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver  = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		////div[@id='checkbox-example']
		//Check the first  Checkbox and verify if it is successfully checked and Uncheck it again to verify if it is successfully Unchecked
		Assert.assertFalse(driver.findElement(By.cssSelector("input[id*=eckBoxOption1]")).isSelected());
		driver.findElement(By.cssSelector("input[id*=eckBoxOption1]")).click();
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("input[id*=eckBoxOption1]")).click();
		//How to get the Count of number of check boxes present in the page
		//checkbox-example
		driver.findElement(By.xpath("//div[@id='checkbox-example']"));
		List<WebElement> checkboxCount = driver.findElements(By.xpath("//input[@type='checkbox']"));
		int Count = checkboxCount.size();
		System.out.println("Number of checkboxes found: " + Count);
		
		
		/* RahulShettyANS
		
		Check the first  Checkbox and verify if it is successfully checked and Uncheck it again to verify if it is successfully Unchecked

		WebDriver driver =new ChromeDriver();

		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.findElement(By.cssSelector("input[id='checkBoxOption1']")).click();
		Assert.assertTrue(driver.findElement(By.cssSelector("input[id='checkBoxOption1']")).isSelected());
		driver.findElement(By.cssSelector("input[id='checkBoxOption1']")).click();
		Assert.assertFalse(driver.findElement(By.cssSelector("input[id='checkBoxOption1']")).isSelected());
		
		
		How to get the Count of number of check boxes present in the page
		driver.findElements(By.cssSelector("input[value='checkbox']")).size(); */

	}

}
