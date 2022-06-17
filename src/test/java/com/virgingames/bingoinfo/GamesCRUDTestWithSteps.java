package com.virgingames.bingoinfo;

import com.virgingames.testbase.TestBase;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Steps;
import net.thucydides.core.annotations.Title;
import org.junit.Test;
import org.junit.runner.RunWith;



@RunWith(SerenityRunner.class)
public class GamesCRUDTestWithSteps extends TestBase {


    @Steps
    BingoSteps gamesSteps;

    @Title("get all  Games data")
    @Test
    public void test001() {
        gamesSteps.getDatafromBingo().statusCode(200);
    }

}
