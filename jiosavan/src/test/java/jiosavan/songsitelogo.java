package jiosavan;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class songsitelogo {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		String url="https://www.jiosaavn.com/";

		WebDriverManager.edgedriver().setup();
		WebDriver driver=new EdgeDriver();
		driver.get(url);		
		driver.manage().window().maximize();
		Thread.sleep(100);
		
		//class="c-logo"
		
		
		WebElement logo=driver.findElement(By.linkText("Top Playlists"));
		logo.click();
		
		Thread.sleep(1000);
		
		WebElement logo1=driver.findElement(By.className("c-logo"));
		logo1.click();
		

	}

}
