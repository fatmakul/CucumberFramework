package com.saucelabs.pages;

import com.saucelabs.utils.HelperMethods;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class HomePage {
    //locators
    @FindBy(xpath = "//div[@class='inventory_item_name']")
    public static List<WebElement> itemList;

    //Action methods

    public static void clickItem(String itemName) {
        for (WebElement item : itemList) {
            if (item.getText().equals(itemName)) {
                HelperMethods.doClick(item);
                break;
            }
        }
    }
}
