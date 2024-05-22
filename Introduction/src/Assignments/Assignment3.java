package Assignments;
import java.time.Duration;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Assignment3 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		// driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get("https://rahulshettyacademy.com/loginpagePractise/");
		driver.findElement(By.id("username")).sendKeys("rahulshettyacademy");
		driver.findElement(By.id("password")).sendKeys("learning");
		driver.findElement(By.cssSelector(".customradio:nth-child(2)")).click();
		WebDriverWait w = new WebDriverWait(driver, Duration.ofMillis(7000));
		w.until(ExpectedConditions.visibilityOfElementLocated(By.id("okayBtn")));
		driver.findElement(By.id("okayBtn")).click();
		WebElement option = driver.findElement(By.xpath("//select[@class='form-control']"));
		Select dropdown = new Select(option);
		dropdown.selectByValue("consult");
		driver.findElement(By.id("terms")).click();
		driver.findElement(By.id("signInBtn")).click();
		w.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.partialLinkText("Checkout")));
		// (By.cssSelector("a.nav-link btn btn-primary")));
		List<WebElement> products = driver.findElements(By.cssSelector(".card-footer .btn-info"));
		for (int i = 0; i < products.size(); i++) {
			products.get(i).click();
		}

		// driver.findElement(By.cssSelector("a.nav-link btn btn-primary")).click();
		/// driver.findElement(By.partialLinkText("Checkout")).click();

	}

}
