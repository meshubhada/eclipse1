package maven01;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class program7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String url="https://demo.opencart.com/";
		WebDriverManager.edgedriver().setup();
		WebDriver driver=new EdgeDriver();
		driver.get(url);
		
		driver.findElement(By.linkText("My Account")).click();
		driver.findElement(By.linkText("Login")).click();
		
		List<WebElement> l1=driver.findElements(By.xpath("a//[@class=list-group-item]"));
		
		System.out.println("list count is"+l1.size());
		
		for(WebElement i:l1)
		{
			System.out.println("the list is"+i.getText());
			
			System.out.println("Attribute value is"+i.getAttribute("href"));
		}
		
		//l1=(List) driver.findElement(By.xpath("a[@class='list-group-item']"));
		
		

	}

}
