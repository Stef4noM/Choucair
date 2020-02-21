package choucairtesting.empleos.com;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class buscarempleo {
	
	private WebDriver driver;
	By idclave = By.id("search_keywords");
	By idubicacion = By.id("search_location");
	By buscar = By.xpath("//*[@id=\"content\"]/div/div/div/div/div/section[12]/div/div/div/div/div/div[2]/div/div/div/form/div[1]/div[4]/input");
	By resultado = By.xpath("//*[@id=\"content\"]/div/div/div/div/div/section[12]/div/div/div/div/div/div[2]/div/div/div/ul/li/a");

	
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
	public void test() {
		driver.findElement(idclave).sendKeys("analista");
		driver.findElement(idubicacion).sendKeys("lima");
		driver.findElement(buscar).click();
		if (driver.findElement(resultado).isDisplayed()) {
			System.out.print("Is Ok");
		}
		else {
			System.out.print("Is Not Ok");
		}
	}

}
