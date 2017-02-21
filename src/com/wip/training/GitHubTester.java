/**
 * 
 */
package com.wip.training;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class GitHubTester {

  public static void main(String[] args) {
    System.setProperty("webdriver.gecko.driver", "C:\\Users\\balu6\\Downloads\\geckodriver-v0.14.0-win64//geckodriver.exe");
    System.setProperty("webdriver.firefox.bin", "C:\\Program Files (x86)\\Mozilla Firefox\\firefox.exe");
    
    WebDriver driver = new FirefoxDriver();
    driver.navigate().to("https://github.com/");
    String appTitle = driver.getTitle();
    System.out.println("Application title is :: " + appTitle);
    driver.quit();


  }

}
