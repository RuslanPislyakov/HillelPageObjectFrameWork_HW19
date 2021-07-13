package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage extends BasePage {

    private final By addToWishListTokyoTalkiesDressButton = By.xpath("//div[@class='noo-product-item noo-product-sm-4 not_featured post-704 product type-product status-publish has-post-thumbnail product_cat-dress product_tag-dress product_tag-women has-featured first instock sale shipping-taxable purchasable product-type-variable has-default-attributes']//div[2]//div[1]//a[1]");
    private final By wishListLink = By.xpath("//a[normalize-space()='My Wishlist']");
    private final By pinkDropTShortLink = By.xpath("//a[normalize-space()='pink drop shoulder oversized t shirt']");

    public HomePage(WebDriver driver) {
        super(driver);
    }

    public void addToWishList() {
        clickByLocator(addToWishListTokyoTalkiesDressButton);
        clickByLocator(wishListLink);
    }

    public By getPinkDropTShortLink() {
        return pinkDropTShortLink;
    }
}
