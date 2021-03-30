package com.saucelabs.base;

import com.saucelabs.pages.CheckoutPage;
import com.saucelabs.pages.HomePage;
import com.saucelabs.pages.ItemPage;
import com.saucelabs.pages.LoginPage;

public class PageManager {
    public static LoginPage LoginPage;
    public static ItemPage ItemPage;
    public static CheckoutPage CheckoutPage;
    public static HomePage HomePage;

    public static  void initialie(){
        // initialize pages
        LoginPage = new LoginPage();
        ItemPage = new ItemPage();
        CheckoutPage = new CheckoutPage();
        HomePage = new HomePage();

    }

}
