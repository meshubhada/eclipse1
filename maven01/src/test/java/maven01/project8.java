package maven01;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class project8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		String url="https://letcode.in/alert";
		WebDriverManager.edgedriver().setup();
		WebDriver driver=new EdgeDriver();
		driver.get(url);
		
		
		driver.findElement(By.id("accept")).click();
		
		Alert simplealert=driver.switchTo().alert();
		System.out.println("Alert text \t"+simplealert.getText());
		simplealert.accept();
		
		
		
		
		
				
				
				
		
	}

}
