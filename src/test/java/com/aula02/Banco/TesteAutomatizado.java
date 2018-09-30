package com.aula02.Banco;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TesteAutomatizado {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "/Users/fibbauru/Downloads/chromedriver");

		WebDriver driver = new ChromeDriver();
		driver.get("http://192.168.4.103:8080/correntista/novo");
		WebElement campoNome = driver.findElement(By.id("nome"));
		WebElement campoEmail = driver.findElement(By.id("email"));
		campoNome.sendKeys("Daniel Correa");
		campoEmail.sendKeys("dancorrea@hotmail.com");
		driver.findElement(By.id("button1")).click();
		driver.close();
				
	}

}
