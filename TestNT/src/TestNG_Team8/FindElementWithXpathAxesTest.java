package TestNG_Team8;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class FindElementWithXpathAxesTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\chrome\\chromedriver.exe");
		ChromeOptions options =new ChromeOptions();
		options.addArguments("--disable-notifications");
		WebDriver driver = new ChromeDriver(options);
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		driver.get("http://demo.guru99.com/test/guru99home/");
		driver.manage().window().maximize();
		element(driver);
		button(driver);
		contain(driver);
		start_with(driver);
		following(driver);
		ancestor(driver);
		child(driver);
		
		driver.close();
	}
	public static void element(WebDriver dri) {
		String t1 = dri.findElement(By.xpath("//*[@class='rt-grid-2 rt-omega']//h4//a[text()='Linux']")).getText();
		System.out.println("Text1: " + t1);
		String t2 = dri.findElement(By.xpath("//*[@class='rt-grid-2 rt-omega']//h4//a[text()='SAP MM']")).getText();
		System.out.println("Text2: " + t2);
		String t3 = dri.findElement(By.xpath("//*[@id='awf_field-91977689']//*[@class='multiChoice'][3]")).getText();
		System.out.println("Text3" + t3);
	}
	public static void button(WebDriver dri) {
		WebElement el1 = dri.findElement(By.xpath("//*[@value='Submit']"));
		el1.click();
		WebElement el2 = dri.findElement(By.xpath("//*[@type='text']"));
		el2.clear();
		el2.sendKeys("thien.187it09835@vanlanguni.vn");
	}
	public static void contain(WebDriver dri) {
		WebElement el1 = dri.findElement(By.xpath("//*[contains(@type,'sub')]"));
		WebElement el2 = dri.findElement(By.xpath("//*[contains(@type,'text')]"));
		WebElement el3 = dri.findElement(By.xpath("//*[@type='submit' or @type='text']"));
	}
	public static void start_with(WebDriver dri) {
		WebElement el1 = dri.findElement(By.xpath("//div[starts-with(@class,'module-surround')]"));
	}
	public static void following(WebDriver dri) {
		WebElement el1 = dri.findElement(By.xpath("//*[@id='form']//following::input"));
	}
	public static void ancestor(WebDriver dri) {
		WebElement el1 = dri.findElement(By.xpath("//*[@id='awf_field-91977689']//ancestor::option"));
		WebElement el2 = dri.findElement(By.xpath(""));
	}
	public static void child(WebDriver dri) {
		WebElement el1 = dri.findElement(By.xpath("//*[@class='dropdown-menu']/child::li"));
	}
	
	
}