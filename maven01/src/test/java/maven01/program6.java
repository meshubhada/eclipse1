package maven01;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class program6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String url="https://google.com/";
		WebDriverManager.edgedriver();
		WebDriver driver=new EdgeDriver();
		driver.get(url);
		
		WebElement search=driver.findElement(By.name("q"));
		
		search.sendKeys("Software Testing Tools");
		search.submit();
		
		
		

	}

}
