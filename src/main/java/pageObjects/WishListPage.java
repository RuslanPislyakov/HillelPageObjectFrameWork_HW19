package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class WishListPage extends BasePage {

    private final By addedProductName = By.xpath("//a[normalize-space()='Tokyo Talkies']");

    public WishListPage(WebDriver driver) {
        super(driver);
    }

    public void verifyProductIsInTheList() {
        waitTextToBePresentInElement(addedProductName, "TOKYO TALKIES");
    }
}
