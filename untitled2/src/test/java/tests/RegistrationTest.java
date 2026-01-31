package tests;


import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class RegistrationTest extends BaseTest {

    @Test
    public void userCanRegister() throws InterruptedException {
        driver.findElement(By.linkText("Register")).click();
        driver.findElement(By.id("gender-male")).click();
        driver.findElement(By.id("FirstName")).sendKeys("TestName");
        driver.findElement(By.id("LastName")).sendKeys("TestLast");
        driver.findElement(By.id("Email")).sendKeys("test" + System.currentTimeMillis() + "@mail.com");
        driver.findElement(By.id("Password")).sendKeys("Test123!");
        driver.findElement(By.id("ConfirmPassword")).sendKeys("Test123!");
        driver.findElement(By.id("register-button")).click();
        Thread.sleep(1000);
        String msg = driver.findElement(By.cssSelector(".result")).getText();
        Assert.assertTrue(msg.contains("Your registration completed"), "Registracija nije uspjela");
    }
}
