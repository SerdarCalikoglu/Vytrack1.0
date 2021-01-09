package com.Cybertek.StepDeffinitions;

import com.Cybertek.utilities.Driver;
import io.cucumber.java.After;
import io.cucumber.java.Before;

import java.util.concurrent.TimeUnit;

public class Hooks {
    @Before
    public void setup(){
        Driver.get().manage().window().maximize();
        Driver.get().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

    }
    @After
    public void tearDown(){


        //Driver.closeDriver();
    }

}
