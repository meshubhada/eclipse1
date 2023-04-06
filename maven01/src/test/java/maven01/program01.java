package maven01;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class program01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String url="https://www.amazon.in/";
		WebDriverManager.edgedriver().setup();
		WebDriver driver=new EdgeDriver();
		driver.get(url);
		

		JavascriptExecutor js1=(JavascriptExecutor)driver;
		js1.executeScript("alert('hey its me');");
		
		
		
		
		

	}

}
