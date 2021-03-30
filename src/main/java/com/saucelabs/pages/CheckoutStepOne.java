package com.saucelabs.pages;

import com.saucelabs.utils.HelperMethods;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import static com.saucelabs.base.BasePage.driver;

public class CheckoutStepOne {
    @FindBy(xpath="//div[@class = 'inventory_item_name']")
    private static WebElement itemName;


    public CheckoutStepOne()
    {
        PageFactory.initElements(driver, this);
    }

    public static String getItemName() {
        return HelperMethods.doGetText(itemName);
    }
}
