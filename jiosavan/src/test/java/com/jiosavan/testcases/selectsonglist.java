package com.jiosavan.testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class selectsonglist {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		String url="https://www.jiosaavn.com/";
		
		WebDriverManager.edgedriver().setup();
		WebDriver driver=new EdgeDriver();
		
		driver.get(url);
		driver.manage().window().maximize();
		
		Thread.sleep(1000);
		
		WebElement sp=driver.findElement(By.linkText("Top Playlists"));
		sp.click();

	}

}
