package co.com.choucair.certification.shopping.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class ShopSignInPage {
    public static final Target SIGNIN_LINK = Target.the("")
            .located(By.linkText("Sign in"));
    public static final Target INPUT_EMAILADDRESS = Target.the("")
            .located(By.id("email_create"));
    public static final Target CREATEANACCOUNT_BUTTON = Target.the("")
            .located(By.xpath("//button[contains(@class,'btn btn-default button button-medium exclusive')]"));
    public static final Target CLICK_MRS = Target.the("")
            .located(By.xpath("//div[@id='uniform-id_gender2']"));
    public static final  Target INPUT_FIRSTNAME = Target.the("")
            .located(By.id("customer_firstname"));
    public static final Target INPUT_LASTNAME = Target.the("")
            .located(By.id("customer_lastname"));
    public static final Target INPUT_PASSWORD = Target.the("")
            .located(By.id("passwd"));
    public static final Target SELECT_BIRTHDAY = Target.the("")
            .located(By.xpath("//select[@id='days']//option[contains(text(),'27')]"));
    public static final Target SELECT_BIRTHMONTH = Target.the("select month")
            .located(By.xpath("//select[@id='months']//option[contains(text(),'April')]"));
    public static final Target SELECT_BIRTHYEAR = Target.the("select year")
            .located(By.xpath("//select[@id='years']//option[contains(text(),'1991')]"));
    public static final Target CHECK_NEWSLETTER = Target.the("")
            .located(By.xpath("//input[@id='newsletter']"));
    public static final Target CHECK_OFFERS = Target.the("")
            .located(By.xpath("//input[@id='optin']"));
    public static final Target INPUT_COMPANY = Target.the("")
            .located(By.id("company"));
    public static final Target INPUT_ADDRESS1 = Target.the("")
            .located(By.id("address1"));
    public static final Target INPUT_ADDRESS2 = Target.the("")
            .located(By.id("address2"));
    public static final Target INPUT_CITY = Target.the("")
            .located(By.id("city"));
    public static final Target SELECT_STATE = Target.the("select State")
            .located(By.xpath("//select[@id='id_state']//option[contains(text(),'Florida')]"));
    public static final Target INPUT_POSTALCODE = Target.the("")
            .located(By.id("postcode"));
    public static final Target SELECT_COUNTRY = Target.the("")
            .located(By.xpath("//select[@id='id_country']//option[contains(text(),'United States')]"));
    public static final Target ADDITIONAL_INFORMATION = Target.the("")
            .located(By.cssSelector("textarea#other"));
    public static final Target INPUT_HOMEPHONE = Target.the("")
            .located((By.id("phone")));
    public static final Target INPUT_MOVILEPHONE = Target.the("")
            .located(By.id("phone_mobile"));
    public static final Target INPUT_ASSINGALIAS = Target.the("")
            .located(By.id("alias"));
    public static final Target REGISTER_BUTTON = Target.the("")
            .located(By.xpath("//button[@class='btn btn-default button button-medium']"));

}
