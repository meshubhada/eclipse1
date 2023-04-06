package maven01;

import java.util.*;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Login {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String url="https://demo.opencart.com";
		
		System.out.println("Hello World");
		
		WebDriverManager.edgedriver().setup();
		WebDriver driver=new EdgeDriver();
		driver.get(url);
		
		driver.findElement(By.linkText("My Account")).click();
		driver.findElement(By.linkText("Login")).click();
		
		driver.findElement(By.id("input-email")).sendKeys("nelo@gmail.com");
		driver.findElement(By.id("input-password")).sendKeys("nelo");
		
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
		System.out.println("the title of browser"+driver.getTitle());

	}

}
