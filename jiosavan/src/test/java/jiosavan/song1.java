package jiosavan;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class song1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
String url="https://www.jiosaavn.com/";
		
		//System.out.println("Hello World");
		
		WebDriverManager.edgedriver().setup();
		WebDriver driver=new EdgeDriver();
		driver.get(url);		
		driver.manage().window().maximize();
		Thread.sleep(100);
		
		driver.findElement(By.linkText("Tu Jhoothi Main Makkaar")).click();;
		driver.findElement(By.linkText("Play")).click();;
		WebElement play =driver.findElement(By.className("c-player__btn"));
		play.click();

		//c-player__btn


	}

}
