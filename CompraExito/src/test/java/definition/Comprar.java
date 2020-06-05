package definition;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;
import steps.ComprarSteps;

public class Comprar {
    @Steps
    ComprarSteps comprarSteps;

    @Given("^That Carolina wants to buy a television$")
    public void that_Carolina_wants_to_buy_a_television() {
        comprarSteps.abrirUrl();
    }

    @When("^she enters the website of the success and selects the desired TV$")
    public void she_enters_the_website_of_the_success_and_selects_the_desired_TV() {
        comprarSteps.buscar();
    }

    @Then("^she makes the purchase and the TV is delivered at home$")
    public void she_makes_the_purchase_and_the_TV_is_delivered_at_home() {
    }

}
