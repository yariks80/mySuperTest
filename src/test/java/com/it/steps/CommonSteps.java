package com.it.steps;

import com.it.pages.BasePage;

import static com.it.common.Constants.BASE_URL;

public class CommonSteps extends BasePage {
    public void open() {
        driver.get(BASE_URL);
    }

    public void close() {
        driver.quit();
    }

}
