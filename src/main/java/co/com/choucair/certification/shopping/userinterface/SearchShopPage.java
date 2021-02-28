package co.com.choucair.certification.shopping.userinterface;


import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class SearchShopPage {

    public static final Target INPUT_SEARCH = Target.the("")
            .located(By.id("search_query_top"));
    public static final Target SEARCH_BUTTON = Target.the("")
            .located(By.xpath("//button[@class='btn btn-default button-search']"));
    public static final Target VIEW_CLICK = Target.the("")
            .located(By.xpath("//div[@class='product-container']"));
    public static final Target CLICK_SIZE = Target.the("")
            .located(By.xpath("//select[@id='group_1']//option[contains(text(),'M')]"));
    public static final Target CLICK_COLOR = Target.the("")
            .located(By.xpath("//a[@id='color_8']"));
    public static final Target ADD_TO_CART_BUTTON = Target.the("")
            .located(By.xpath("//button[@class='exclusive']"));
    public static final Target ADD_PROCEED_TO_CHECKOUT = Target.the("")
            .located(By.xpath("//a[@class='btn btn-default button button-medium']"));
    public static final Target SUMMARY_PROCEED_TO_CHECKOUT = Target.the("")
            .located(By.xpath("//a[@class='button btn btn-default standard-checkout button-medium']"));
    public static final Target ADD_COMMENT = Target.the("")
            .located(By.cssSelector("textarea.form-control"));
    public static final Target ADDRESS_PROCEED_TO_CHECKOUT = Target.the("")
            .located(By.xpath("//button[@class='button btn btn-default button-medium']"));
    public static final Target TERMS_OF_SERVICE = Target.the("")
            .located(By.xpath("//input[@id='cgv']"));
    public static final Target SHIPPING_PROCEED_TO_CHECKOUT = Target.the("")
            .located(By.xpath("//button[@class='button btn btn-default standard-checkout button-medium']"));
    public static final Target PAY_BY = Target.the("")
            .located(By.xpath("//a[@class='bankwire']"));
    public static final Target CONFIRM_ORDER = Target.the("")
            .located(By.xpath("//button[@class='button btn btn-default button-medium']"));
    public static final Target BACK_TO_ORDERS = Target.the("")
            .located(By.xpath("//a[@class='button-exclusive btn btn-default']"));
    public static final Target SEARCH_ORDER = Target.the("")
            .located(By.xpath("//h1[contains(text(),'Order ')]"));


}
