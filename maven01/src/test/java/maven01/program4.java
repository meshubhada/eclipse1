package maven01;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class program4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		String url="https://letcode.in/alert";
		WebDriverManager.edgedriver();
		WebDriver driver=new EdgeDriver();
		driver.get(url);
		
		driver.findElement(By.id("accept")).click();
		
		Alert simplealert=driver.switchTo().alert();	
		
		System.out.println("Alert Text:"+simplealert.getText());
		simplealert.accept();
		
	}

}
