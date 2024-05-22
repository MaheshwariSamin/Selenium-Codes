import java.util.Iterator;
import java.util.Set;


import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scope {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		//to get the whole links from a program
		System.out.println(driver.findElements(By.tagName("a")).size());
		//to get the no.of links only from footer - limit the scope as below
		WebElement footDriver = driver.findElement(By.id("gf-BIG"));
		System.out.println(footDriver.findElements(By.tagName("a")).size());
		//to get the link counts from footer's 1st column
				WebElement coloumndriver=footDriver.findElement(By.xpath("//table/tbody/tr/td[1]/ul"));
				System.out.println(coloumndriver.findElements(By.tagName("a")).size());
				
				//4- click on each link in the column and check if the pages are opening-
				for(int i=1;i<coloumndriver.findElements(By.tagName("a")).size();i++)
				{
					
					String clickonlinkTab=Keys.chord(Keys.CONTROL,Keys.ENTER);
					
					coloumndriver.findElements(By.tagName("a")).get(i).sendKeys(clickonlinkTab);
					Thread.sleep(5000L);
					
				}// opens all the tabs
				Set<String> abc=driver.getWindowHandles();//4
				Iterator<String> it=abc.iterator();
				
				while(it.hasNext())
				{
					
				   driver.switchTo().window(it.next());
				   System.out.println(driver.getTitle());
				
				}
	};

}
