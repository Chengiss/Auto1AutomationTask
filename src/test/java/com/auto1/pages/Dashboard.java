package com.auto1.pages;

import com.auto1.utilities.ConfigurationReader;
import com.auto1.utilities.Driver;

public class Dashboard extends BasePage{
    public void goToPage(String page){
        switch (page) {
            case "search":
                Driver.get().get(ConfigurationReader.get("searchPageUrl"));
                break;
            case "other modules":
                // to be added...
                break;
        }
    };
}
