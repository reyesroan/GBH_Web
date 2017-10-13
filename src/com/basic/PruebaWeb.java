package com.basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;



public class PruebaWeb {

	public WebDriver driver;
	public String chromePath =System.getProperty("user.dir")+"\\src\\com\\basic\\chromedriver.exe";
	public String baseUrl ="http://www.gbh.com.do";
	public String expectedTitle =null;
	public String actualTitle = null;
	
	
	
	@BeforeTest
	public void launchBrowser()
	{
		//Open Chrome
				System.setProperty("webdriver.chrome.driver",chromePath);
				driver = new ChromeDriver();
				
				//Navigate to URL
				driver.get(baseUrl); 
	}

	@AfterTest
	public void terminateBrowser() 
	{
		driver.quit();
	}
	
	@BeforeMethod
	public void verifyHomePageTitle() {
		expectedTitle="Soluciones GBH - Servicios informaticos en Republica Dominicana";
		actualTitle = driver.getTitle();
		Assert.assertEquals(actualTitle, expectedTitle);
		
	}
	
	@AfterMethod
	public void goBackToHomePage() {
		driver.findElement(By.id("menu-item-21")).click();
	}
	
	@Test // objetos de Menu - Servicio -Asesoría de interfaz y experiencia de usuario (UX)
	public void M_Servicio_AIEU() {
		M_Servicio(); //hover de menu servicio
		driver.findElement(By.id("menu-item-2642")).click();
		expectedTitle="Asesoría de interfaz y experiencia de usuario (UI/UX) - Soluciones GBH";
		actualTitle = driver.getTitle();
		Assert.assertEquals(actualTitle, expectedTitle);
	}
	
	@Test // objetos de Menu - Desarrollo de Software en República Dominicana
	public void M_Servicio_DS() {	
		M_Servicio(); //hover de menu servicio
		driver.findElement(By.id("menu-item-2976")).click();
		expectedTitle="Desarrollo de Software en República Dominicana";
		actualTitle = driver.getTitle();
		Assert.assertEquals(actualTitle, expectedTitle);
	}
	
	@Test // objetos de Menu - Diseño web en Republica Dominicana
	public void M_Servicio_DWRD() {	
		M_Servicio(); //hover de menu servicio
		driver.findElement(By.id("menu-item-226")).click();
		expectedTitle="Diseño web en Republica Dominicana";
		actualTitle = driver.getTitle();
		Assert.assertEquals(actualTitle, expectedTitle);
	}
	
	@Test // objetos de Menu - Manejo de redes sociales para empresas - Soluciones GBH
	public void M_Servicio_MRSE() {	
		M_Servicio(); //hover de menu servicio
		driver.findElement(By.id("menu-item-2895")).click();
		expectedTitle="Manejo de redes sociales para empresas - Soluciones GBH";
		actualTitle = driver.getTitle();
		Assert.assertEquals(actualTitle, expectedTitle);
	}
	
	@Test // objetos de Menu - Consultoría Web - Soluciones GBH
	public void M_Servicio_CW() {	
		M_Servicio(); //hover de menu servicio
		driver.findElement(By.id("menu-item-1998")).click();
		expectedTitle="Consultoría Web - Soluciones GBH";
		actualTitle = driver.getTitle();
		Assert.assertEquals(actualTitle, expectedTitle);
	}

	@Test // objetos de Menu - SEO (optimizacion en motores de busqueda)
	public void M_Servicio_SEO() {	
		M_Servicio(); //hover de menu servicio
		driver.findElement(By.id("menu-item-227")).click();
		expectedTitle="SEO (optimizacion en motores de busqueda)";
		actualTitle = driver.getTitle();
		Assert.assertEquals(actualTitle, expectedTitle);
	}
	

	@Test // objetos de Menu - Mantenimiento preventivo y correctivo de computadoras
	public void M_Servicio_MPCC() {	
		M_Servicio(); //hover de menu servicio
		driver.findElement(By.id("menu-item-361")).click();
		expectedTitle="Mantenimiento preventivo y correctivo de computadoras";
		actualTitle = driver.getTitle();
		Assert.assertEquals(actualTitle, expectedTitle);
	}
	
	@Test // objetos de Menu - Evaluacion de infraestructura (IT)
	public void M_Servicio_EI() {	
		M_Servicio(); //hover de menu servicio
		driver.findElement(By.id("menu-item-392")).click();
		expectedTitle="Evaluacion de infraestructura (IT)";
		actualTitle = driver.getTitle();
		Assert.assertEquals(actualTitle, expectedTitle);
	}
	
	
	@Test // objetos de Menu -Configuracion de respaldo (backup)
	public void M_Servicio_CR() {	
		M_Servicio(); //hover de menu servicio
		driver.findElement(By.id("menu-item-360")).click();
		expectedTitle="Configuracion de respaldo (backup)";
		actualTitle = driver.getTitle();
		Assert.assertEquals(actualTitle, expectedTitle);
	}
	
	@Test // objetos de Menu -Instalacion de cableado estructurado (redes de datos)
	public void M_Servicio_ICERD() {	
		M_Servicio(); //hover de menu servicio
		driver.findElement(By.id("menu-item-357")).click();
		expectedTitle="Instalacion de cableado estructurado (redes de datos)";
		actualTitle = driver.getTitle();
		Assert.assertEquals(actualTitle, expectedTitle);
	}

	
	@Test // objetos de Menu -Instalacion y configuracion de redes Wi-Fi
	public void M_Servicio_ICRW() {	
		M_Servicio(); //hover de menu servicio
		driver.findElement(By.id("menu-item-358")).click();
		expectedTitle="Instalacion y configuracion de redes Wi-Fi";
		actualTitle = driver.getTitle();
		Assert.assertEquals(actualTitle, expectedTitle);
	}
	
	@Test // objetos de Menu -Certificacion de cableado estructurado
	public void M_Servicio_CCE() {	
		M_Servicio(); //hover de menu servicio
		driver.findElement(By.id("menu-item-356")).click();
		expectedTitle="Certificacion de cableado estructurado";
		actualTitle = driver.getTitle();
		Assert.assertEquals(actualTitle, expectedTitle);
	}
	
	@Test // objetos de Menu -Portafolio
	public void M_Portafolio() {	
		driver.findElement(By.id("menu-item-62")).click();
		expectedTitle="Portafolio de trabajo Soluciones GBH";
		actualTitle = driver.getTitle();
		Assert.assertEquals(actualTitle, expectedTitle);
	}
	
	@Test // objetos de Menu -Soluciones GBH
	public void M_Conocenos() {	
		driver.findElement(By.id("menu-item-65")).click();
		expectedTitle="Soluciones GBH";
		actualTitle = driver.getTitle();
		Assert.assertEquals(actualTitle, expectedTitle);
	}

	@Test // objetos de Menu -- Aplica para trabajar en Soluciones GBH
	public void M_Empleos() {	
		driver.findElement(By.id("menu-item-126")).click();
		expectedTitle="Aplica para trabajar en Soluciones GBH";
		actualTitle = driver.getTitle();
		Assert.assertEquals(actualTitle, expectedTitle);
	}

	@Test // objetos de Menu -- Noticias de tecnología
	public void M_Blog() {	
		driver.findElement(By.id("menu-item-20")).click();
		expectedTitle="Noticias de tecnología";
		actualTitle = driver.getTitle();
		Assert.assertEquals(actualTitle, expectedTitle);
	}
	
	
	
	//Funcion para hacer hover sobre el menu servicio
	 public void M_Servicio()
	 {
		 Actions action = new Actions(driver);
			WebElement we = driver.findElement(By.id("menu-item-209"));
			action.moveToElement(we).build().perform(); 
	 }

	
		
	
	
	
}
