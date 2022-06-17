package com.virgingames.bingoinfo;


import com.virgingames.constants.EndPoints;
import io.restassured.response.ValidatableResponse;
import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;


public class BingoSteps {

    @Step("Getting Games information with Bingo")
    public ValidatableResponse getDatafromBingo(){
        return SerenityRest.given().log().all()
                .when()
                .get(EndPoints.GET_ALL_DATA)
                .then();
    }


}
