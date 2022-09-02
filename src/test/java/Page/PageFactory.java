package Page;

import static Page.ProductPage.driver;

public class PageFactory
{
    private static ProductPage productPage;

    public static ProductPage productPage()
    {
        if(productPage ==null)
        {
            productPage = new ProductPage(driver);
        }
        return productPage;
    }
}
