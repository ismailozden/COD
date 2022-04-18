package com.saucedemo.stepdefinitions;

import com.saucedemo.pages.Cart;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;

public class CartStepDefs {

    @Given("user click on the Cart icon")
    public void user_click_on_the_Cart_icon() {
        new Cart().CartIcon.click();

    }

    @Then("cart page should be displayed")
    public void cart_page_should_be_displayed() {

        String ExpectedTitle= "YOUR CART";
        Assert.assertEquals(ExpectedTitle,new Cart().CartPageTitle.getText());

    }

    @And("user able to see title {string}")
    public void user_able_to_see_title(String string) {
        new Cart().CartPageTitle.isDisplayed();

    }

    @Given("user click on the remove button")
    public void user_click_on_the_remove_button() {
        new Cart().AddItem.click();
        new Cart().CartIcon.click();
        new Cart().RemoveItem.click();

    }

    @And("user can remove the item")
    public void user_can_remove_the_item() {
        Assert.assertFalse(new Cart().ItemName.isDisplayed());


    }

    @Given("user click on the checkout button")
    public void user_click_on_the_checkout_button() {

    }

    @And("checkout page should be displayed")
    public void checkout_page_should_be_displayed() {

    }

    @Given("user click on the ContinueShopping button")
    public void user_click_on_the_ContinueShopping_button() {

    }

    @And("user able to see BasePage Icon")
    public void user_able_to_see_BasePage_Icon() {

    }


}
