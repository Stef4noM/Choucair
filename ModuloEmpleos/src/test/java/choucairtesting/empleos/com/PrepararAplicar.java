package choucairtesting.empleos.com;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PrepararAplicar {

	private WebDriver driver;
	By chourcairPageLocator = By.xpath("//*[@id=\"content\"]/div/div/div/div/div/section[2]/div/div/div[3]/div/div/div/div/div/figure/a");
	By chourcairTextPageLocator = By.xpath("//*[@id=\"content\"]/div/div/div/div/div/section[2]/div/div/div[3]/div/div/div/div/div/div/h3/a");
	String ruta = "#preparse";

	@Before
	public void setUp() throws Exception {
		System.setProperty("webdriver.chrome.drives", "./ModuloEmpleos/src/test/resources/Chromedriver/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.choucairtesting.com/empleos-testing");
	}

	@After
	public void tearDown() throws Exception {
		driver.quit();
	}

	@Test
	public void serchourcair ()  throws InterruptedException {
		if (driver.findElement(chourcairPageLocator).getAttribute("href").equals(ruta)) {
			System.out.print("Is Ok");
		}
		else if(driver.findElement(chourcairTextPageLocator).getAttribute("href").equals(ruta)) {
			System.out.print("Is OK");
		}
		else {
			System.out.print("Is Not OK");
		}
	}

}
