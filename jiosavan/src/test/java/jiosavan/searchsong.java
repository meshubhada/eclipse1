package jiosavan;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class searchsong {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		String url="https://www.jiosaavn.com/";
		
		//System.out.println("Hello World");
		
		WebDriverManager.edgedriver().setup();
		WebDriver driver=new EdgeDriver();
		driver.get(url);		
		driver.manage().window().maximize();
		Thread.sleep(100);
		
		WebElement sc=driver.findElement(By.className("rbt-input-main"));
		sc.sendKeys("mahi ve");
		sc.click();
		
				}

}
