package tests;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTest extends BaseTest {
    @Test
    public void userCanRegisterAndLogin()throws InterruptedException {

        String email = "test" + System.currentTimeMillis() + "@mail.com";
        String password = "Test123!";

        // REGISTER
        driver.findElement(By.linkText("Register")).click();
        driver.findElement(By.id("gender-male")).click();
        driver.findElement(By.id("FirstName")).sendKeys("Test");
        driver.findElement(By.id("LastName")).sendKeys("User");
        driver.findElement(By.id("Email")).sendKeys(email);
        driver.findElement(By.id("Password")).sendKeys(password);
        driver.findElement(By.id("ConfirmPassword")).sendKeys(password);
        driver.findElement(By.id("register-button")).click();
        Thread.sleep(1000);
        // LOGOUT
        driver.findElement(By.linkText("Log out")).click();
        Thread.sleep(1000);
        // LOGIN
        driver.findElement(By.linkText("Log in")).click();
        driver.findElement(By.id("Email")).sendKeys(email);
        driver.findElement(By.id("Password")).sendKeys(password);
        driver.findElement(By.cssSelector("input.button-1.login-button")).click();
        Thread.sleep(1000);
        // ASSERT
        String account = driver.findElement(By.cssSelector("a.account")).getText();
        Assert.assertEquals(account, email);
        Thread.sleep(1000);
    }

}
