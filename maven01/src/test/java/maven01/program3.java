package maven01;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class program3 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String url="https://demo.opencart.com/index.php?route=product/category&language=en-gb&path=20_27";
		WebDriverManager.edgedriver();
		WebDriver driver=new EdgeDriver();
		driver.get(url);
		
		Select sortlist=new Select(driver.findElement(By.id("input-sort")));
		
		sortlist.selectByIndex(3);
		
	}

}
