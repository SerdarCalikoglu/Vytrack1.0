package com.Cybertek.CukesRunner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)

@CucumberOptions

        (

            features = "src/test/resources",
                glue="com/Cybertek/StepDeffinitions",
                dryRun = false,
                tags = "@wip"
        )


public class Cukes {





}
