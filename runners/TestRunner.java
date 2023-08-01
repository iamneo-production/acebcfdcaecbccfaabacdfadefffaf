package com.yourcompany.runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/java/com/yourcompany/features", glue = "com.yourcompany.stepdefinitions")
public class TestRunner {
}