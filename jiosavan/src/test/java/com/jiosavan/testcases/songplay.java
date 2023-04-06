package com.jiosavan.testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class songplay {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		
		String url="https://www.jiosaavn.com/";
		
		WebDriverManager.edgedriver().setup();
		WebDriver driver=new EdgeDriver();
		
		driver.get(url);
		driver.manage().window().maximize();
		
		WebElement song=driver.findElement(By.linkText("Tu Jhoothi Main Makkaar"));
		song.click();
		Thread.sleep(3000);
		driver.findElement(By.id("player_play_pause")).click();
		
		
		//WebElement l=driver.findElement(By.id("logo"));
		//l.click();
		

	}

}
