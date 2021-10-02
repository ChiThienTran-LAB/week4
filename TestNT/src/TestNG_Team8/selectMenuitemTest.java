package TestNG_Team8;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class selectMenuitemTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\chrome\\chromedriver.exe");
		ChromeOptions options =new ChromeOptions();
		options.addArguments("--disable-notifications");
		WebDriver driver = new ChromeDriver(options);
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		driver.get("http://demo.guru99.com/test/guru99home/");
		driver.manage().window().maximize();
		
		selectMenuItem("Flash Movie Demo", driver);
	}
	public static void selectMenuItem(String str, WebDriver dri) {
		WebElement lEl = dri.findElement(By.xpath("//*[@class='nav navbar-nav']//li//ul"));
		List<WebElement> list_child = dri.findElements(By.xpath("//*[@class='dropdown']/ul/li/a[text()]"));	
		for (int i =0; i<=list_child.size(); i++) {
			if(list_child.get(i).getText().equals(str)) {
				list_child.get(i).click();
			}
		}
		dri.close();
	}
	
}
