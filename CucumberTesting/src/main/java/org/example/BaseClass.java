package org.example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.Collections;
import java.util.concurrent.TimeUnit;

public class BaseClass {

    public static WebDriver driver;

    public static void setupdriver(){

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\USER\\Desktop\\Cucumber Project\\Cucumber-Project\\CucumberTesting\\src\\test\\resources\\driver\\chromedriver.exe");
        ChromeOptions ops = new ChromeOptions();
        driver = new ChromeDriver(ops);
        ops.addArguments("--remote-allow-origins=*");
        ops.addArguments("--start-maximized");
        ops.addArguments("--incognito");
        // this is code for headless
        //ops.addArguments("--headless");
        ops.setExperimentalOption("useAutomationExtension", false);
        ops.setExperimentalOption("excludeSwitches", Collections.singletonList("enable-automation"));
        //implicit wait
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://tutorialsninja.com/demo/index.php?route=account/login");

    }

    public static void closedriver(){
        driver.quit();
    }
}


