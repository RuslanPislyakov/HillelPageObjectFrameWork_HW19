package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class ProductPage extends BasePage {

    private final By colorDropDown = By.id("pa_color");
    private final By sizeDropDown = By.id("pa_size");
    private final By quantityField = By.xpath("//input[contains(@id, 'noo-quantity')]");
    private final By addToCartButton = By.xpath("//button[normalize-space()='Add to cart']");
    private final By cartButton = By.xpath("//i[@class='icon_bag_alt']");

    public ProductPage(WebDriver driver) {
        super(driver);
    }

    public void changeColor(String color){
        Select select = new Select(driver.findElement(colorDropDown));
        select.selectByVisibleText(color);
    }

    public void changeSize(String size){
        Select select = new Select(driver.findElement(sizeDropDown));
        select.selectByVisibleText(size);
    }

    public void changeQuantity(String quantity){
        clickByLocator(quantityField);
        clearByLocator(quantityField);
        sendKeysToLocator(quantityField, quantity);
    }

    public void addToCart(){
        clickByLocator(addToCartButton);
    }

    public void navigateToCart(){
        clickByLocator(cartButton);
    }

}
