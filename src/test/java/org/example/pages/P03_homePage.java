package org.example.pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;
import java.util.Queue;

import static org.example.stepDefs.Hooks.driver;
public class P03_homePage {



    public P03_homePage() {
        PageFactory.initElements(driver, this);
    }
    @FindBy(id="customerCurrency")
    public WebElement currencyList;


    @FindBy(css = "div[class=\"product-grid home-page-product-grid\"]")
    public List<WebElement> prices;

    @FindBy(id = "small-searchterms")
    public WebElement searching;


    @FindBy(css = "button[class=\"button-1 search-box-button\"]")
    public WebElement btn;

    @FindBy(css = "div[class=\"search-results\"]")
    public List<WebElement> searchResult;


    @FindBy(css = "div[class=\"picture\"]")
    public List <WebElement> products;

    @FindBy(id = "sku-36")
    public WebElement SKU36A;



    @FindBy(id = "sku-17")
    public WebElement SKU17B;


    @FindBy(id = "sku-12")
    public WebElement SKU12C;


    @FindBy(css = "div[class=\"sku\"]")
    public WebElement SKU;



    @FindBy(className = "nivo-imageLink")
    public WebElement sliderA;



    @FindBy(className = "nivo-imageLink")
    public WebElement sliderB;

    @FindBy(css = "a[href=\"http://www.facebook.com/nopCommerce\"]")
    public WebElement facebook;


    @FindBy(css = "a[href=\"https://twitter.com/nopCommerce\"]")
    public WebElement twitter;



@FindBy(css = "li[class=\"rss\"]")
public WebElement rss;



    @FindBy(css = "a[href=\"http://www.youtube.com/user/nopCommerce\"]")
    public WebElement youtube;

@FindBy(css = "button[class=\"button-2 add-to-wishlist-button\"]")
    public List<WebElement>  HTC;


@FindBy(css = "div[class=\"bar-notification success\"]")
    public WebElement color;


@FindBy(css = "span[class=\"wishlist-label\"]")
    public WebElement wishlistBTN;

@FindBy(css = "button[class=\"remove-btn\"]")
    public WebElement cancel;

@FindBy(css = "div[class=\"no-data\"]")
    public WebElement msg;

@FindBy(css = "input[class=\"qty-input\"]")
public WebElement QTY;

@FindBy(className = "wishlist-qty")
    public WebElement qty;

@FindBy(css = "ul[class=\"top-menu notmobile\"]>li")
    public List<WebElement> maincategories;


@FindBy(xpath = "//ul[@class='top-menu notmobile']//ul//li")
public List<WebElement> dropCategories;









@FindBy(css = "img[title*=\"Show products in\"]")
    public List<WebElement> SubCatg;



    @FindBy(css = "div[class=\"page-title\"]")
    public WebElement Titles;




}
