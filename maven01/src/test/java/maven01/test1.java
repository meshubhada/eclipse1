package maven01;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class test1 {
	
	
	public test1()
	{
		String url="https://www.amazon.in/";
		WebDriverManager.edgedriver().setup();
		WebDriver driver=new EdgeDriver();
		driver.get(url);
		
		JavascriptExecutor js1=(JavascriptExecutor)driver;
		js1.executeScript("alert('hey its me');");
		
	}

}
