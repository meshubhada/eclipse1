package maven01;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class testng1 {
  @Test(dataProvider = "dp")
  public void f(Integer n, String s) {
	  
	  System.out.println("hello"+n+" \t"+s);
  }
  @BeforeMethod
  public void beforeMethod() {
	  
	  System.out.println("hello before");
  }

  @AfterMethod
  public void afterMethod() {
	  
	  
	  System.out.println("hello after");
  }


  @DataProvider
  public Object[][] dp() {
    return new Object[][] {
      new Object[] { 1, "a" },
      new Object[] { 2, "b" },
    };
  }
  @BeforeClass
  public void beforeClass() {
	  
	  
	  System.out.println("hello before class");
  }

  @AfterClass
  public void afterClass() {
	  
	  System.out.println("hello after class");

  }

  @BeforeTest
  public void beforeTest() {
	  
	  System.out.println("hello before test");

  }

  @AfterTest
  public void afterTest() {
	  
	  System.out.println("hello after test");

  }

  @BeforeSuite
  public void beforeSuite() {
  }

  @AfterSuite
  public void afterSuite() {
  }

}
