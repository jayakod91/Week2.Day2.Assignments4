package week2.day2.Assignments4;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ImageBox {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leafground.com/pages/Image.html");
		driver.manage().window().maximize();
		System.out.println("Title page is:  "+driver.getTitle());   
		System.out.println("URL page is:  "+driver.getCurrentUrl()); 
		System.out.println(driver.getPageSource());
	    String text = driver.findElement (By.xpath("//label[contains(@for,position)]")).getText();
	    System.out.println(text);
	    driver.close();

	}

}
