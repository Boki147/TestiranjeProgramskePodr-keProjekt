package tests;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AddToCartTest extends BaseTest {

    @Test
    public void searchAndAddProductToCart() throws InterruptedException {
        driver.findElement(By.id("small-searchterms")).sendKeys("book");
        driver.findElement(By.cssSelector("input.button-1.search-box-button")).click();

        Thread.sleep(1000);
        driver.findElement(By.cssSelector("input.button-2.product-box-add-to-cart-button")).click();

        Thread.sleep(1000);
        String cartQty = driver.findElement(By.cssSelector("span.cart-qty")).getText();
        Assert.assertTrue(cartQty.contains("1"), "Proizvod nije dodat u košaricu");
    }
}

