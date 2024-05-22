package Du;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DeviceOnly {

	public static void main(String[] args) throws IOException, InterruptedException {
		// TODO Auto-generated method stub
		ChromeOptions options = new ChromeOptions();
		options.setAcceptInsecureCerts(true);
		WebDriver driver = new ChromeDriver(options);
		driver.get("https://172.24.251.36:9002/en/personal/Mobile-phones/htc-ut11-p-CON-HS-HTC-086");
		WebDriverWait w = new WebDriverWait(driver, Duration.ofSeconds(10));
		System.out.println(driver.getTitle());
		//maximize the window
		driver.manage().window().maximize();
		Thread.sleep(3000);
		//Taking SS
		File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(src, new File("D:\\Maggie\\DuAutomation\\DeviceOnly\\screenshot.png"));
		w.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("button[type='submit'] span[class='v-btn__content']")));
		
		//Clicking on Add to cart
		driver.findElement(By.cssSelector("button[type='submit'] span[class='v-btn__content']")).click();
		Thread.sleep(3000);
		File src1 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(src1, new File("D:\\Maggie\\DuAutomation\\DeviceOnly\\screenshot1.png"));
		//Scrolling the page down
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy( 0, 500)");
		w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[text()='Confirm']")));
		File src2 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(src2, new File("D:\\Maggie\\DuAutomation\\DeviceOnly\\screenshot2.png"));
		
		//Clicking on confirm button in cart page
		driver.findElement(By.xpath("//button[text()='Confirm']")).click(); 
	}

}
