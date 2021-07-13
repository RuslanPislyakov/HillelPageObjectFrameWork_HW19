package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class CartPage extends BasePage {

    private final By addedProductName = By.xpath("//a[normalize-space()='pink drop shoulder oversized t shirt - Pink']");
    private final By addedProductSize = By.xpath("//dd[@class='variation-Size']");
    private final By addedProductQuantity = By.xpath("//input[contains(@id, 'noo-quantity')]");

    public CartPage(WebDriver driver) {
        super(driver);
    }

    public void verifyProductInTheList(String productName, String productSize, String productQuantity) {
        waitTextToBePresentInElement(addedProductName, productName);
        Assert.assertEquals(getWebElement(addedProductSize).getText(), productSize);
        Assert.assertEquals(getWebElement(addedProductQuantity).getAttribute("value"), productQuantity);
    }
}
