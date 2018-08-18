package com.it.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage {

    @FindBy(xpath = "//ul[@class='sn_menu']/li[1]")
    private WebElement labelUserEmail;



    public String getLabelUserEmail() {
       driver.scrollDown();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        driver.scrollUp();
        return labelUserEmail.getText();
    }
}
