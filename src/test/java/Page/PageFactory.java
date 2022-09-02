package Page;

import static Page.ProductPage.driver;

public class PageFactory
{
    private ProductPage productPage;

    public ProductPage productPage()
    {
        if(productPage ==null)
        {
            productPage = new ProductPage(driver);
        }
        return productPage;
    }
}
