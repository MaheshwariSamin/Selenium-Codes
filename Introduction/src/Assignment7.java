import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy( 0, 700)");
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		//js.executeScript("document.querySelector('.table-display').scrollTop=500");
		WebElement rowCount = driver.findElement(By.cssSelector(".table-display"));
		System.out.println("Number of rows: " +rowCount.findElements(By.tagName("tr")).size());
		WebElement columnCount = driver.findElement(By.cssSelector(".table-display "));
		System.out.println("Number of columns: " +columnCount.findElements(By.tagName("th")).size());
		System.out.println("2nd row value: " +driver.findElement(By.cssSelector(".table-display tr:nth-child(2)")).getText());
		
		
	}

}
