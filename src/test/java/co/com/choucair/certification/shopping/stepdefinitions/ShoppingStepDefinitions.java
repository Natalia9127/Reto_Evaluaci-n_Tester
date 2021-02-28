package co.com.choucair.certification.shopping.stepdefinitions;

import co.com.choucair.certification.shopping.model.ProductShopData;
import co.com.choucair.certification.shopping.questions.Answer;
import co.com.choucair.certification.shopping.tasks.OpenUp;
import co.com.choucair.certification.shopping.tasks.SearchProductAndProceedToCheckout;
import co.com.choucair.certification.shopping.tasks.SignIn;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

import java.util.List;

public class ShoppingStepDefinitions {

    @Before
    public void setStage(){
        OnStage.setTheStage(new OnlineCast());
    }

    @Given("^that natalia want to do automation at the product shopping$")
    public void thatNataliaWantToDoAutomationAtTheProductShopping(List<ProductShopData> productShopData) throws Exception {
        OnStage.theActorCalled("Natalia").wasAbleTo(OpenUp.thePage(), SignIn.thePage( productShopData.get(0).getStrEmail(), productShopData.get(0).getStrFirstName(), productShopData.get(0).getStrLastName(),
                                                                                                 productShopData.get(0).getStrPassword(), productShopData.get(0).getStrCompany(), productShopData.get(0).getStrAddress1(),
                                                                                                 productShopData.get(0).getStrAddress2(), productShopData.get(0).getStrCity(), productShopData.get(0).getStrPostalCode(),
                                                                                                 productShopData.get(0).getStrAddInfo(), productShopData.get(0).getStrHomePhone(), productShopData.get(0).getStrMovilePhone(),
                                                                                                 productShopData.get(0).getStrAlias()
                                                                                               )
                                                               );
    }

    @When("^she search for the produduct in the shop, add to cart and proceed to checkout\\.$")
    public void sheSearchForTheProduductInTheShopAddToCartAndProceedToCheckout(List<ProductShopData> productShopData) throws Exception {
            OnStage.theActorInTheSpotlight().attemptsTo(SearchProductAndProceedToCheckout.the(productShopData.get(0).getStrProduct(), productShopData.get(0).getStrComment()));
    }

    @Then("^she product shopping$")
    public void sheProductShopping(List<ProductShopData> productShopData) throws Exception {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(Answer.toThe(productShopData.get(0).getStrOrder())));

    }

}
