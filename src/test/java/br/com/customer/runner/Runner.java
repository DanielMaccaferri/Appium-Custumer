package br.com.customer.runner;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/main/resources/br/com/customer/features", tags = "@visitar", glue = "br.com.customer.steps", strict = true)
public class Runner {

}