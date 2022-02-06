package week2.day2.Assignments4;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropDownBox {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leafground.com/pages/Dropdown.html");
		driver.manage().window().maximize();
		System.out.println("Title page is:  "+driver.getTitle());   
		System.out.println(" URL page is:  "+driver.getCurrentUrl()); 
		System.out.println(driver.getPageSource());
		boolean selected = driver.findElement(By.id("dropdown1")).isSelected();
		System.out.println(selected);
		String tagName = driver.findElement(By.id("dropdown1")).getTagName();
		System.out.println(tagName);
		Object size = driver.findElement(By.id("dropdown1")).getSize();	
		System.out.println(size);
		Object location = driver.findElement(By.className("dropdown")).getLocation();
		System.out.println(location);
		driver.close();
	}

}
