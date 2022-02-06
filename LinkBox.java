package week2.day2.Assignments4;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LinkBox {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leafground.com/pages/Link.html");		
		driver.manage().window().maximize();
		System.out.println("The title page is:  "+driver.getTitle());   
		System.out.println("The URL page is:  "+driver.getCurrentUrl()); 
		System.out.println(driver.getPageSource());
		String attribute = driver.findElement(By.linkText("Find where am supposed to go without clicking me?")).getAttribute("href");
		System.out.println("The Attribute is  "+attribute);
		driver.get("http://leafground.com/pages/Button.html");
		String cssValue = driver.findElement(By.id("size")).getCssValue("background-color");
		System.out.println("The Background color in rgba is "+cssValue);
		String text = driver.findElement(By.id("size")).getText();
		System.out.println("Text is "+text);
		int x = driver.findElement(By.id("size")).getLocation().getX();
		System.out.println("location of X is "+x);
		Dimension size = driver.findElement(By.id("size")).getSize();
		System.out.println("size is :"+ size);
		String tagName = driver.findElement(By.id("size")).getTagName();
		System.out.println("TagName is "+ tagName);
		 boolean displayed = driver.findElement(By.id("position")).isDisplayed();
		 System.out.println(" displayed: "+ displayed);
		 driver.close();

	}

}
