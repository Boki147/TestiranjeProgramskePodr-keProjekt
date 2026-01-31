package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class HomePageTest extends BaseTest {

    @Test
    public void verifyHomepageTitle()throws InterruptedException {
        String title = driver.getTitle();
        Thread.sleep(1000);
        Assert.assertTrue(title.contains("Demo Web Shop"), "Naslov ne odgovara");
    }
}
