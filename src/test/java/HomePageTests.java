import base.BaseTest;
import org.testng.annotations.Test;
import pageObjects.CartPage;
import pageObjects.HomePage;
import pageObjects.ProductPage;
import pageObjects.WishListPage;

public class HomePageTests extends BaseTest {

    @Test
    public void wishListTest() {
        getDriver().get("https://shop.demoqa.com/");
        getDriver().manage().window().maximize();
        HomePage homePage = new HomePage(getDriver());
        WishListPage wishListPage = new WishListPage(getDriver());

        homePage.addToWishList();
        wishListPage.verifyProductIsInTheList();
    }

    @Test
    public void productPresentInTheCartList() {
        getDriver().get("https://shop.demoqa.com/");
        getDriver().manage().window().maximize();

        HomePage homePage = new HomePage(getDriver());
        ProductPage productPage = new ProductPage(getDriver());
        CartPage cartPage = new CartPage(getDriver());

        homePage.clickByLocator(homePage.getPinkDropTShortLink());
        productPage.changeColor("Pink");
        productPage.changeSize("37");
        productPage.changeQuantity("3");
        productPage.addToCart();
        productPage.navigateToCart();
        cartPage.verifyProductInTheList("PINK DROP SHOULDER OVERSIZED T SHIRT - PINK", "37", "3");
    }
}
