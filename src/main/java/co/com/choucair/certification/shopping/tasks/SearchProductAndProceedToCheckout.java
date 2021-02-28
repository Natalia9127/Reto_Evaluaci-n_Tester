package co.com.choucair.certification.shopping.tasks;

import co.com.choucair.certification.shopping.userinterface.SearchShopPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

public class SearchProductAndProceedToCheckout implements Task {
    private String strProduct;
    private String strComment;

    public SearchProductAndProceedToCheckout(String strProduct, String strComment) {
        this.strProduct = strProduct;
        this.strComment = strComment;
    }

    public static SearchProductAndProceedToCheckout the(String strProduct, String strComment) {
        return Tasks.instrumented(SearchProductAndProceedToCheckout.class, strProduct, strComment);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Enter.theValue(strProduct).into(SearchShopPage.INPUT_SEARCH),
                         Click.on(SearchShopPage.SEARCH_BUTTON),
                         Click.on(SearchShopPage.VIEW_CLICK),
                         Click.on(SearchShopPage.CLICK_SIZE),
                         Click.on(SearchShopPage.CLICK_COLOR),
                         Click.on(SearchShopPage.ADD_TO_CART_BUTTON),
                         Click.on(SearchShopPage.ADD_PROCEED_TO_CHECKOUT),
                         Click.on(SearchShopPage.SUMMARY_PROCEED_TO_CHECKOUT),
                         Enter.theValue(strComment).into(SearchShopPage.ADD_COMMENT),
                         Click.on(SearchShopPage.ADDRESS_PROCEED_TO_CHECKOUT),
                         Click.on(SearchShopPage.TERMS_OF_SERVICE),
                         Click.on(SearchShopPage.SHIPPING_PROCEED_TO_CHECKOUT),
                         Click.on(SearchShopPage.PAY_BY),
                         Click.on(SearchShopPage.CONFIRM_ORDER),
                         Click.on(SearchShopPage.BACK_TO_ORDERS)
                        );
    }
}
