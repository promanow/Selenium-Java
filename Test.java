package com.company;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.*;

public class Test

{

    public static void main(String[] args)

    {

        System.setProperty("webdriver.chromedriver.driver", "/usr/local/bin/");

        WebDriver driver = new ChromeDriver();

        driver.get("http://demo.testarena.pl/zaloguj");

        driver.findElement(By.id("email")).sendKeys(" administrator@testarena.pl");

        driver.findElement(By.id("password")).sendKeys("sumXQQ72$L");

        driver.findElement(By.id("login")).click();

        System.out.println("Poprawne logowanie");
        driver.findElement(By.className("header_admin")).click();
        System.out.println("Poprawne klikanie");
        driver.findElement(By.className("button_link")).click();
        driver.findElement(By.id("name")).sendKeys("pawelqa");
        driver.findElement(By.id("prefix")).sendKeys("pqa");
        driver.findElement(By.id("save")).click();
        driver.findElement(By.className("activeMenu")).click();
        driver.findElement(By.id("search")).sendKeys("pawelqa");
        driver.findElement(By.id("j_searchButton")).click();
        driver.findElement(By.xpath(".//table//td[normalize-space()='pawelqa']"));

//driver.quit();

    }

}
