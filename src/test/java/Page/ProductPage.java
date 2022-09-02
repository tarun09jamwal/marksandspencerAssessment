package Page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ProductPage
{
    static WebDriver driver;
    static By women = By.xpath("(//a[@class='nav-primary__menu-link icon--hdr-arrow-right'])[1]");

    public ProductPage(WebDriver driver)

    {
        this.driver = driver;
    }
    public static void product()
    {
        driver.findElement(women).click();
    }


}
