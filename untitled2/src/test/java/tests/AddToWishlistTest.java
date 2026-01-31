package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;

public class AddToWishlistTest extends BaseTest {

    @Test
    public void userCanAddProductToWishlistTest()throws InterruptedException {

        
        driver.findElement(By.id("small-searchterms")).sendKeys("book");
        driver.findElement(By.cssSelector("input.button-1.search-box-button")).click();
        Thread.sleep(1000);
        
        driver.findElement(By.cssSelector("h2.product-title a")).click();
        Thread.sleep(1000);
        
        driver.findElement(By.id("add-to-wishlist-button-22")).click();

        Thread.sleep(1000);
        
        String wishlistQty = driver.findElement(
                By.cssSelector("span.wishlist-qty")
        ).getText();
        Thread.sleep(1000);
        Assert.assertEquals(wishlistQty, "(1)", "Proizvod nije dodan u wishlist");
    }
}


