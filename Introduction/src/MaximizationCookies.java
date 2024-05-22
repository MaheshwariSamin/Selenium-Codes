import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MaximizationCookies {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		//to maximize the window
		driver.manage().window().maximize();
		//to deleteAllCookies
		driver.manage().deleteAllCookies();
		//to delete specific cookies
		driver.manage().deleteCookieNamed("facebook");
		//session cookie deletion -- it logs out the application and asks to login again
		driver.manage().deleteCookieNamed("sessionKey");
		
		//Opening the web browser
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		
		
	}

}
