package jiosavan;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class songlang {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		String url="https://www.jiosaavn.com/";
		
		//System.out.println("Hello World");
		
		WebDriverManager.edgedriver().setup();
		WebDriver driver=new EdgeDriver();
		driver.get(url);		
		driver.manage().window().maximize();
		Thread.sleep(100);
		
		//WebElement ss=;
		Select item=new Select(driver.findElement(By.linkText("Music")));
		
		item.selectByVisibleText("English");
		driver.findElement(By.linkText("Update")).click();;
		
		
		
		
		
		
		

	}

}
