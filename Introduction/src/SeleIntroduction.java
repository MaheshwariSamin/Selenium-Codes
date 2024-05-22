import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SeleIntroduction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Invoking browser
		//Chrome -- ChromeDriver -- which contains all methods
		//OPTIONAL STEP		
		//System.setProperty("webdriver.chrome.driver","/Maggie/Maggie Selenium/chromedriver-win64/chromedriver-win64.exe");
		
		//webdriver.chrome.driver --> value of path
		//WebDriver driver  = new ChromeDriver();

		//FireFox launch4
		//WebDriver driver  = new FireFoxDriver();
		//geckodriver
		
		
		//System.setProperty("webdriver.gecko.driver","D/Maggie/Maggie Selenium/geckodriver-v0.33.0-win64");
		//WebDriver driver  = new FirefoxDriver();
		
		//Edge Launch
		WebDriver driver  = new EdgeDriver();
		
		driver.get("https://instagram.com");
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		driver.close();
		//driver.quit();

	}

}
