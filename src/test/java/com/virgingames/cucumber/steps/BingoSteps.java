package com.virgingames.cucumber.steps;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.restassured.response.ValidatableResponse;
import net.thucydides.core.annotations.Steps;

public class BingoSteps {

    static ValidatableResponse response;

    @Steps
    com.virgingames.bingoinfo.BingoSteps gamesSteps;

    @When("^User sends a GET request to list endpoint$")
    public void userSendsAGETRequestToListEndpoint() {
            response = gamesSteps.getDatafromBingo();
        }

    @Then("^User must get back a valid status code 200$")
    public void userMustGetBackAValidStatusCode() {
            response.statusCode(200);
        }

    }

