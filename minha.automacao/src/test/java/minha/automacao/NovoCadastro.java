package minha.automacao;



import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class NovoCadastro {
	
	WebDriver driver;


	@Before
	public void setUp() throws Exception {
		
	System.setProperty("webdriver.chrome.driver","C:\\Drivers\\chromedriver.exe");
	driver = new ChromeDriver();
	driver.get ("https://www.amazon.com.br");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
	
			
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test() throws InterruptedException {
		
		WebElement ClicarLogin = driver.findElement(By.cssSelector("#nav-link-accountList"));
		ClicarLogin.click();
		Thread.sleep(5000);
			
		WebElement ClicarContinuar = driver.findElement(By.id("createAccountSubmit"));
		ClicarContinuar.click();
		Thread.sleep(5000);
		
		WebElement SeuNome = driver.findElement(By.id("ap_customer_name"));
		SeuNome.sendKeys("Fulano Beltrano");
		Thread.sleep(5000);
		
		WebElement DigitarEmail = driver.findElement(By.id("ap_email"));
		DigitarEmail.sendKeys("fulanobeltrano2022@gmail.com");
		Thread.sleep(5000);
		
		WebElement DigitarSenha = driver.findElement(By.id("ap_password"));
		DigitarSenha.sendKeys("07062022");
		Thread.sleep(5000);
		
		WebElement ConfirmeEmail = driver.findElement(By.id("ap_password_check"));
		ConfirmeEmail.sendKeys("07062022");
		Thread.sleep(5000);
		
		WebElement VerificarEmail = driver.findElement(By.id("continue"));
		VerificarEmail.click();
		Thread.sleep(5000);
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
