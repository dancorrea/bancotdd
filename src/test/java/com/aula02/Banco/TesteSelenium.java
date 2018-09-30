package com.aula02.Banco;

import static org.junit.Assert.assertTrue;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TesteSelenium {

	@Test
	public void procuraRegistro() {

		System.setProperty("webdriver.chrome.driver", "/Users/fibbauru/Downloads/chromedriver");

		WebDriver driver = new ChromeDriver();
		driver.get("http://192.168.4.103:8080/correntista/lista");

		boolean email = driver.getPageSource().contains("dancorrea@hotmail.com");
		assertTrue(email);
		driver.close();

	}

}
