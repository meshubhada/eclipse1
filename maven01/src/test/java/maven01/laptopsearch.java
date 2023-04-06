package maven01;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class laptopsearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String url="https://demo.opencart.com/";
		WebDriverManager.edgedriver();
		WebDriver driver=new EdgeDriver();
		driver.get(url);
		
		Select sortlist=new Select(driver.findElement(By.id("narbar-menu")));
		sortlist.selectByIndex(1);
		

		

	}

}
