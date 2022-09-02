package Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

public class BaseClass
{
    static WebDriver driver;

    protected static PageFactory pageFactory;
    public static void SetUp()
    {
        System.setProperty("webdriver.chrome.driver","chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.marksandspencer.com/");
//        pageFactory = new PageFactory(driver);
    }
    public static void Close()
    {
        driver.close();
    }


}
