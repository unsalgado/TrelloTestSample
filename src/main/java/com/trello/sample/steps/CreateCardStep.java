package com.trello.sample.steps;

import com.trello.sample.Login;
import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;

public class CreateCardStep {

    private Login login;

	@Given("Load Trello")
	public void loadTrello() {
		login.loadTrello();
	}

	@When("Login to Trello using username: $username password: $password")
	public void loginToTrello(String url, String userName, String password) {

        login.loginToTrello(userName, password);
	}

	@When("Navigate to CingleVue-UI-Board")
	public void selectCingleVueUIBoard() {
		selectCingleVueUIBoard();
	}

	@When("Click to Add Card")
	public void clickToAddCard() {
		clickToAddCard();
	}

	@When("Add Text: $text")
	public void addtextOnly(String text) {
		addtextOnly(text);
	}

	@Then("Click Add Button")
	public void clickAddButton() {
		clickAddButton();
	}

	@Then("Verify Card added successfully")
	public void verifyCardAdded() {
		verifyCardAdded();
	}

}
