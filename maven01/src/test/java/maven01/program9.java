package maven01;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class program9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		String url="https://letcode.in/windows";
		WebDriverManager.edgedriver().setup();
		WebDriver driver=new EdgeDriver();
		driver.get(url);
		
		String windowhandle=driver.getWindowHandle();
		System.out.println("first window"+windowhandle);
		
		driver.findElement(By.id("multi")).click();
		
		List<String> l1=new ArrayList<String>(driver.getWindowHandles());
		
		System.out.println(l1.size());
		for(int i=0;i<l1.size();i++)
		{
			System.out.println(l1.get(i));
			
			driver.switchTo().window(l1.get(i));
			System.out.println("The url is"+driver.getCurrentUrl());
		}
		
		
		
			
	}

}
