package com.saucedemo.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Cart {

    @FindBy(xpath = "//a[@class='shopping_cart_link']")
    public WebElement CartIcon;

    @FindBy(xpath = "//button[@class='btn btn_secondary btn_small cart_button']")
    public WebElement RemoveItem;

    @FindBy(xpath = "//div[@class='cart_quantity']")
    public WebElement ItemQuantity;

    @FindBy(xpath = "//button[@class='btn btn_action btn_medium checkout_button']")
    public WebElement CheckoutButton;

    @FindBy(xpath = "//button[@class='btn btn_secondary back btn_medium']")
    public WebElement ContinueShoppingButton;

    @FindBy(xpath = "//span[@class='title']")
    public WebElement CartPageTitle;  //(YOUR CART)

    @FindBy(xpath = "//div[@class='inventory_item_name']")
    public WebElement ItemName;

    @FindBy(xpath = "(//input[@class='input_error form_input'])[1]")
    public WebElement FirstName;

    @FindBy(xpath = "(//input[@class='input_error form_input'])[2]")
    public WebElement LastName;

    @FindBy(xpath = "(//input[@class='input_error form_input'])[3]")
    public WebElement ZipCode;

    @FindBy(xpath = "//div[@class='peek']")
    public WebElement BasePageIcon;

    @FindBy(xpath = "(//button[@class='btn btn_primary btn_small btn_inventory'])[1]")
    public WebElement AddItem;


}

