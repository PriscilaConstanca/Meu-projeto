package minha.automacao;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RealizandoPedido {

	WebDriver driver;

	@Before
	public void setUp() throws Exception {
		System.setProperty("webdriver.chrome.driver", "C:\\Drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.amazon.com.br");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
			}

	@After
	public void tearDown() throws Exception {
	}
	@Test
	public void test() throws InterruptedException {

		WebElement PesquisarIphone = driver.findElement(By.id("twotabsearchtextbox"));
		PesquisarIphone.sendKeys("iphone");
		Thread.sleep(3000);
				
		WebElement ClicarLupa = driver.findElement(By.id("nav-search-submit-button"));
		ClicarLupa.click();
		Thread.sleep(3000);
		
		WebElement SelecionarItemPesquisado = driver.findElement(By.cssSelector(
				"#search > div.s-desktop-width-max.s-desktop-content.s-opposite-dir.sg-row"
				+ " > div.s-matching-dir.sg-col-16-of-20.sg-col.sg-col-8-of-12.sg-col-12-of-16"
				+ " > div > span:nth-child(4) > div.s-main-slot.s-result-list.s-search-results.sg-row "
				+ "> div:nth-child(9) > div > div > div > div > div"));
		SelecionarItemPesquisado.click();
		Thread.sleep(3000);
		
		WebElement ComprarIphone = driver.findElement(By.id("buy-now-button"));
		ComprarIphone.click();
		Thread.sleep(3000);
		
		WebElement DigitarEmail = driver.findElement(By.id("ap_email"));
		DigitarEmail.sendKeys("fulanobeltrano2022@gmail.com");
		Thread.sleep(3000);
		
		WebElement ClicarContinuar = driver.findElement(By.id("continue"));
		ClicarContinuar.click();
		Thread.sleep(3000);
		
		WebElement DigitarSenha = driver.findElement(By.id("ap_password"));
		DigitarSenha.sendKeys("07062022");
		Thread.sleep(3000);
		
		WebElement FazerLogin = driver.findElement(By.id("signInSubmit"));
		FazerLogin.click();
		Thread.sleep(10000);
		
		WebElement PagamentoBoleto = driver.findElement(By.name("ppw-instrumentRowSelection"));
		PagamentoBoleto.click();
		Thread.sleep(10000);
		
		WebElement ClicarEmContinuar = driver.findElement(By.name("ppw-widgetEvent:SetPaymentPlanSelectContinueEvent"));
		ClicarEmContinuar.click();
		Thread.sleep(5000);
		
		WebElement ConfirmarPedido = driver.findElement(By.name("placeYourOrder1"));
		ConfirmarPedido.click();
		Thread.sleep(5000);
		
		driver.close();
		
		
		
		
	}

}
