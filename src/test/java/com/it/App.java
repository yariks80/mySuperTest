package com.it;

import com.it.steps.CommonSteps;
import com.it.steps.HomeSteps;
import com.it.steps.LoginSteps;

public class App {
    public CommonSteps common;
    public LoginSteps login;
    public HomeSteps home;

    public App() {
        common = new CommonSteps();
        login = new LoginSteps();
        home = new HomeSteps();

    }


}
