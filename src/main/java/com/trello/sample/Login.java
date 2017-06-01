package com.trello.sample;

import org.jbehave.web.selenium.FluentWebDriverPage;
import org.jbehave.web.selenium.WebDriverProvider;

public class Login extends FluentWebDriverPage{

private String url="https://trello.com/";
	 
	public Login(WebDriverProvider driverProvider) {
		super(driverProvider);
	}

	public void loadTrello() {
        get(url);


    }
    public void loginToTrello(String userName,String password){


    }

   

}
