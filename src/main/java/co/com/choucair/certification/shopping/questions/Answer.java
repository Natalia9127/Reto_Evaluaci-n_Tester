package co.com.choucair.certification.shopping.questions;

import co.com.choucair.certification.shopping.userinterface.SearchShopPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

public class Answer implements Question<Boolean> {
    private String strOrder;

    public Answer(String strOrder) {
        this.strOrder = strOrder;
    }

    public static Answer toThe(String strOrder) {
        return new Answer(strOrder);
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        boolean result;
        String nameProduct = Text.of(SearchShopPage.SEARCH_ORDER).viewedBy(actor).asString();
        if(strOrder.equals(nameProduct)){
            result = true;
        }else {
            result = false;
        }
        return result;
    }
}
