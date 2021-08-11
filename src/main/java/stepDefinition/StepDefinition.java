package stepDefinition;

import helper.BrowserHandler;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.Checkout;
import pages.Home;
import pages.Wishlist;

import java.io.IOException;

import static org.junit.Assert.assertEquals;

    public class StepDefinition extends BrowserHandler {
    //initialising all page object classes
    Checkout checkout = new Checkout(driver);
    Home home = new Home(driver);
    Wishlist wishlist = new Wishlist(driver);;

    @Given("I add four different product to my wish list")
    public void i_add_four_different_product_to_my_wish_list() throws IOException {
        home.addItemsToWishList(driver);
    }

    @When("I view my wishlist table")
    public void i_view_my_wishlist_table() throws IOException {
        home.clickOnWishList(driver);
    }

    @Then("I find total four selected items in my wishlist")
    public void i_find_total_four_selected_items_in_my_wishlist() {
        assertEquals(wishlist.countItemInList(), 4);
    }

    @When("I search for lowest price product")
    public void i_search_for_lowest_price_product() {
        wishlist.findLowestPriceItem(driver);
    }

    @When("I am able to add the lowest price item to my cart")
    public void i_am_able_to_add_the_lowest_price_item_to_my_cart() {
        wishlist.verifyDisplayedConfirmationText(driver);
    }

    @Then("I am able to verify the item in my cart")
    public void i_am_able_to_verify_the_item_in_my_cart() throws IOException {
        checkout.verifyCart(driver);

    }

}
