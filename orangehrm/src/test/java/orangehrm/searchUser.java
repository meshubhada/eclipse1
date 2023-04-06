package orangehrm;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class searchUser {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		String url="https://opensource-demo.orangehrmlive.com/";
		WebDriverManager.edgedriver();
		WebDriver driver=new EdgeDriver();
		driver.get(url);
		//login
		//JavascriptExecutor js=(JavascriptExecutor)driver;
		//js.executeScript("scrollBy(0,5000)");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
		WebElement username=driver.findElement(By.name("username"));
		username.sendKeys("Admin");
		
		WebElement password=driver.findElement(By.name("password"));
		password.sendKeys("admin123");
		
		driver.findElement(By.className("orangehrm-login-button")).click();
		
		Thread.sleep(3000);
		
		driver.findElement(By.partialLinkText("ad")).click();
		//driver.findElement(By.className("oxd-icon")).click();
		//oxd-icon
		Thread.sleep(3000);

		
		WebElement searchuser=driver.findElement(By.className("oxd-input"));
		searchuser.sendKeys("admin");
		//orangehrm-left-space
		
		Thread.sleep(300);

		
		driver.findElement(By.className("orangehrm-left-space")).click();
		
		
		
		
		
	}

}