package com.mindtree.seleniumclass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class demotide2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://tide.com/en-us");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		driver.findElement(By.xpath("//a[@data-action-detail='How to Wash Clothes']")).click();
		//driver.findElement(By.xpath("//img[@src='https://images.ctfassets.net/ajjw8wywicb3/4VqIsedzGHfO2wdPejiZOT/276eaa8aeba5ba60db7994464f1bccd3/00037000849926_C7N1_hero_521x480_1221.png?fm=png']")).click();
		//driver.findElement(By.xpath("//a[@href='/en-us/how-to-wash-clothes/how-to-remove-stains']")).click();
		driver.findElement(By.xpath("//p[text()='How to remove stains']")).click();
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		driver.findElement(By.xpath("//button[text()='Learn More']")).click();

	}

}
