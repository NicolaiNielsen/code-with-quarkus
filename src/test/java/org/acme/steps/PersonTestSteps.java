package org.acme.steps;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.acme.Person;
import org.acme.PersonRessource;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class PersonTestSteps {

    private final PersonRessource resource = new PersonRessource();
    private Person person;

    @When("I call the person endpoint")
    public void callPersonEndpoint() {
        person = resource.getOnePerson();
    }

    @When("When i create a person")
    public void populatePerson() {
        person.setName("Nicolai");
        person.setCountry("Denmark");
    }

    @Then("I get a person named {string} from {string}")
    public void verifyPerson(String expectedName, String expectedCountry) {
        assertEquals(expectedName, person.getName());
        assertEquals(expectedCountry, person.getCountry());
    }

}

