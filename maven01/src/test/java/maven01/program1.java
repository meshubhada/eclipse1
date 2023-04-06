package maven01;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class program1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String url="https://demo.opencart.com/";
		WebDriverManager.edgedriver();
		WebDriver driver=new EdgeDriver();
		driver.get(url);
		
		
		
		
		driver.findElement(By.linkText("My Account")).click();
		driver.findElement(By.linkText("Login")).click();
		
		List l1=(List) driver.findElement(By.xpath("a[@class='list-group-item']"));
		
		
		
		System.out.println("List count is:"+l1.size());
		
		int i;
		
		for(i=0;i<=11;i++)
		{
			System.out.println("the list is"+l1.indexOf(i));
		}
		

	}

}
