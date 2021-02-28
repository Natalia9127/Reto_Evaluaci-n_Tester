package co.com.choucair.certification.shopping.tasks;

import co.com.choucair.certification.shopping.userinterface.ShopSignInPage;
import cucumber.api.java.af.En;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

public class SignIn implements Task {
    private String strEmail;
    private String strFirstName;
    private String strLastName;
    private String strPassword;
    private String strCompany;
    private String strAddress1;
    private String strAddress2;
    private String strCity;
    private String strPostalCode;
    private String strAddInfo;
    private String strHomePhone;
    private String strMovilePhone;
    private String strAlias;

    public SignIn(String strEmail, String strFirstName, String strLastName, String strPassword, String strCompany, String strAddress1, String strAddress2, String strCity, String strPostalCode, String strAddInfo, String strHomePhone, String strMovilePhone, String strAlias) {
        this.strEmail = strEmail;
        this.strFirstName = strFirstName;
        this.strLastName = strLastName;
        this.strPassword = strPassword;
        this.strCompany = strCompany;
        this.strAddress1 = strAddress1;
        this.strAddress2 = strAddress2;
        this.strCity = strCity;
        this.strPostalCode = strPostalCode;
        this.strAddInfo = strAddInfo;
        this.strHomePhone = strHomePhone;
        this.strMovilePhone = strMovilePhone;
        this.strAlias = strAlias;
    }

    public static SignIn thePage(String strEmail, String strFirstName, String strLastName, String strPassword, String strCompany, String strAddress1, String strAddress2, String strCity, String strPostalCode, String strAddInfo, String strHomePhone, String strMovilePhone, String strAlias) {
        return Tasks.instrumented(SignIn.class, strEmail, strFirstName, strLastName, strPassword, strCompany, strAddress1, strAddress2, strCity, strPostalCode, strAddInfo, strHomePhone, strMovilePhone, strAlias);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(ShopSignInPage.SIGNIN_LINK),
                Enter.theValue(strEmail).into(ShopSignInPage.INPUT_EMAILADDRESS),
                Click.on(ShopSignInPage.CREATEANACCOUNT_BUTTON),
                Click.on(ShopSignInPage.CLICK_MRS),
                Enter.theValue(strFirstName).into(ShopSignInPage.INPUT_FIRSTNAME),
                Enter.theValue(strLastName).into(ShopSignInPage.INPUT_LASTNAME),
                Enter.theValue(strPassword).into(ShopSignInPage.INPUT_PASSWORD),
                Click.on(ShopSignInPage.SELECT_BIRTHDAY),
                Click.on(ShopSignInPage.SELECT_BIRTHMONTH),
                Click.on(ShopSignInPage.SELECT_BIRTHYEAR),
                Click.on(ShopSignInPage.CHECK_NEWSLETTER),
                Click.on(ShopSignInPage.CHECK_OFFERS),
                Enter.theValue(strCompany).into(ShopSignInPage.INPUT_COMPANY),
                Enter.theValue(strAddress1).into(ShopSignInPage.INPUT_ADDRESS1),
                Enter.theValue(strAddress2).into(ShopSignInPage.INPUT_ADDRESS2),
                Enter.theValue(strCity).into(ShopSignInPage.INPUT_CITY),
                Click.on(ShopSignInPage.SELECT_STATE),
                Enter.theValue(strPostalCode).into(ShopSignInPage.INPUT_POSTALCODE),
                Click.on(ShopSignInPage.SELECT_COUNTRY),
                Enter.theValue(strAddInfo).into(ShopSignInPage.ADDITIONAL_INFORMATION),
                Enter.theValue(strPostalCode).into(ShopSignInPage.ADDITIONAL_INFORMATION),
                Enter.theValue(strHomePhone).into(ShopSignInPage.INPUT_HOMEPHONE),
                Enter.theValue(strMovilePhone).into(ShopSignInPage.INPUT_MOVILEPHONE),
                Enter.theValue(strAlias).into(ShopSignInPage.INPUT_ASSINGALIAS),
                Click.on(ShopSignInPage.REGISTER_BUTTON)
        );
    }
}
