package base;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import pages.HomePage;

public class BaseTests {
	
	private static WebDriver driver; // declarando objeto do tipo WebDriver utilizado pelo selenium WebDriver
	protected HomePage homePage;
	
	@BeforeAll// metodo será executado antes de todas as classes de testes
	
	 public static void inicializar() {
		System.setProperty("webdriver.chrome.driver", "C:\\automacao\\curso_iterasys\\webdrivers\\chromedriver\\versao83\\chromedriver.exe");
	    driver = new ChromeDriver();
	}
	
	@BeforeEach// antes de cada teste
	public void carregarPaginaInicial() {
		driver.get("https://marcelodebittencourt.com/demoprestashop/");
		homePage = new HomePage(driver);
	}

	@AfterAll//depois que finaliza a execução de cada classe de teste
	
	public static void finalizar() {
		driver.quit();
	}
}
