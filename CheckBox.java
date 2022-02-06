package week2.day2.Assignments4;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CheckBox {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leafground.com/pages/checkbox.html");
		driver.manage().window().maximize();
		System.out.println(" Title page is:  "+driver.getTitle());   
		System.out.println(" URL page is:  "+driver.getCurrentUrl()); 
		System.out.println(driver.getPageSource());
		boolean findElement = driver.findElement(By.xpath("(//label[text()='Confirm Selenium is checked']/following::input)")).isSelected();
		System.out.println(findElement);
		driver.close();

	}

}
