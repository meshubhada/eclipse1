package project01;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class program1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String url="https://demo.opencart.com/";
		WebDriverManager.edgedriver();
		WebDriver driver=new EdgeDriver();
		driver.get(url);
		//driver.manage().window().maximize();
		
		
		driver.findElement(By.("Name (A - Z)")).click();
		
		
		
		
		
		
		//JavascriptExecutor js=(JavascriptExecutor)driver;
		//js.executeScript("scrollBy(0,5000)");
		
		
		//driver.findElement(By.name("q")).sendKeys("javatpoint tutorial");
		//driver.findElement(By.name("q")).submit();
		
		//driver.findElement(By.linkText("Join Now")).click();
		
		
		//driver.close();
		
		//driver.close();
		
		
	}

}
