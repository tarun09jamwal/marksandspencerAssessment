package Test;

import Page.PageFactory;

public class TestProduct extends BaseClass
{
    public static void main(String[] args)
    {
        SetUp();
        PageFactory.productPage().product();
    }
}
