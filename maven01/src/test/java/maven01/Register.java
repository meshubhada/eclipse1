package maven01;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Register {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		String url="https://demo.opencart.com/";
		
		System.out.println("Hello World");
		
		
		/*WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.navigate().to(url);
		
		System.out.println("the title of browser"+driver.getTitle());*/
		
		
		
		WebDriverManager.edgedriver().setup();
		WebDriver driver=new EdgeDriver();
		driver.get(url);
		
		System.out.println("the title of browser"+driver.getTitle());
		
		/*driver.findElement(By.linkText("My Account")).click();
		driver.findElement(By.linkText("Register")).click();
		
		//driver.findElement(By.id("input-firstname")).sendKeys("neloneloneloneloneloneloneloneloll");
		//driver.findElement(By.id("input-lastname")).sendKeys("neloneloneloneloneloneloneloneloll");

		//driver.findElement(By.id("input-password")).sendKeys("oll");
		
		//driver.findElement(By.id("input-newsletter-yes")).click();
		
		driver.findElement(By.name("agree")).click();
		
		
		driver.findElement(By.xpath("//button[@type='submit']")).click();*/
		
		
		System.out.println("url is:"+driver.getCurrentUrl());
		driver.navigate().to("https://www.google.com");

		
		System.out.println("the title of browser"+driver.getTitle());
		System.out.println("url is:"+driver.getCurrentUrl());
		driver.navigate().back();
		
		System.out.println("the title of browser"+driver.getTitle());
		System.out.println("url is:"+driver.getCurrentUrl());
		driver.navigate().forward();


		System.out.println("the title of browser"+driver.getTitle());
		System.out.println("url is:"+driver.getCurrentUrl());
		driver.quit();

		
		
		
		
		

	}

}
