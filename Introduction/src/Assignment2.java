import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class Assignment2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver  = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/angularpractice/");
		driver.findElement(By.name("name")).sendKeys("Maggie");
		driver.findElement(By.name("email")).sendKeys("test@gmail.com");
		driver.findElement(By.id("exampleInputPassword1")).sendKeys("maggie");
		driver.findElement(By.xpath("(//input[@id='exampleCheck1'])[1]")).click();
		driver.findElement(By.id("exampleFormControlSelect1")).click();
		//System.out.println(driver.findElement(By.id("exampleFormControlSelect1")).getAttribute("style"));
		WebElement dropDown = driver.findElement(By.id("exampleFormControlSelect1"));
		Select options = new Select(dropDown);
		options.selectByVisibleText("Female");
		driver.findElement(By.id("inlineRadio1")).click();
		driver.findElement(By.name("bday")).sendKeys("12/12/2024");
		driver.findElement(By.cssSelector(".btn-success")).click();
		Thread.sleep(2000L);
		System.out.println(driver.findElement(By.cssSelector(".alert-success")).getText());
	}

}
