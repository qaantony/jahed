package pack0;

import org.testng.annotations.Test;

public class TestCases {
	@Test
	public  void TC1() {
		System.out.println("qaplanet1, lab1111");
		System.out.println(System.getProperty("user.dir"));
	}

	@Test
	public  void TC2() {
		System.out.println("qaplanet2, lab2222");
		
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\lib\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		// accessing the qahrm project home page
		driver.get("http://apps.qaplanet.in/qahrm/login.php");

		// statements to perform login action
		driver.findElement(By.name("txtUserName")).sendKeys("qaplanet1");
		driver.findElement(By.name("txtPassword")).sendKeys("lab1");
		driver.findElement(By.name("Submit")).click();
		Thread.sleep(5000);

		// statements to perform logout action
		driver.findElement(By.linkText("Logout")).click();

		// statements to quit the browser
		driver.quit();

	}

	@Test
	public  void TC3() {
		System.out.println("qaplanet3, lab3");

	}

	@Test
	public  void TC4() {
		System.out.println("qaplanet4, lab4");

	}

}
