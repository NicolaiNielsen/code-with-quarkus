package org.acme.steps;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.acme.GreetingResource;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class HelloServiceSteps {

    String result;
    GreetingResource service = new GreetingResource();

    @When("I call the hello service")
    public void iCallTheHelloService() {
        result = service.hello();
    }
    
    @Then("I get the answer {string}")
    public void iGetTheAnswer(String string) {
        assertEquals(string, result);
    }
}