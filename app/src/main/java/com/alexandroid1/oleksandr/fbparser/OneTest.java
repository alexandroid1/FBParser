package com.alexandroid1.oleksandr.fbparser;

/**
 * Created by Oleksandr on 24.12.2016.
 */

import junit.framework.TestCase;
import org.openqa.selenium.*;
import org.openqa.selenium.android.AndroidDriver;

public class OneTest extends TestCase {

    public void testGoogle() throws Exception {
        WebDriver driver = new AndroidDriver();

        // откроем страницу Google
        driver.get("http://www.google.com");

        // Найдем поле ввода по атрибуту name
        WebElement element = driver.findElement(By.name("q"));

        // Введем текст для поиска
        element.sendKeys("СЫР!");

        // Отправим форму. WebDriver найдет за нас нужную форму по её элементу.
        element.submit();

        // Проверим заголовок страницы
        System.out.println("Заголовок страницы: " + driver.getTitle());
        driver.quit();
    }
}
