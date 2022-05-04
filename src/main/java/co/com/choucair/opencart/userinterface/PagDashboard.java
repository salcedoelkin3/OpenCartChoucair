package co.com.choucair.opencart.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class PagDashboard extends PageObject {
    public static final Target SALES = Target.the("Clic en ventas").located(By.xpath("//a[@href='#collapse26']"));
    public static final Target ORDERS = Target.the("Clic en pedidos").located(By.xpath("//a[contains(text(),'Orders')]"));
    public static final Target VER_LIST_ORDER = Target.the("verifica lista de ordenes").located(By.xpath("//h3[contains(text(),' Order List')]"));
    public static final Target ORDER_ID = Target.the("ingresa id de venta").located(By.id("input-order-id"));
    public static final Target BUTTON_FILTER = Target.the("boton filtrar").located(By.id("button-filter"));
    public static final Target DETALLE = Target.the("ver detalle de orden").located(By.xpath("//i[@class='fa fa-eye']"));
    public static final Target VERIFICA_ID = Target.the("verifica el id de la orden").located(By.xpath("//h3[contains(text(),' Order (#16643)')]"));
    public static final Target RETURNS = Target.the("Clic en devoluciones").located(By.xpath("//a[contains(text(),'Returns')]"));
    public static final Target VERIF_DEV = Target.the("verifica lista de devoluciones").located(By.xpath("//h3[contains(text(),' Product Return List')]"));
    public static final Target RETURN_ID = Target.the("ingresa id de devolucion").located(By.xpath("//input[@id='input-return-id']"));
    public static final Target DETALLE_RETURN = Target.the("ver detalle de orden").located(By.xpath("//a[@data-original-title='Edit']"));
    public static final Target VALE = Target.the("Clic en vale de regalo").located(By.xpath("//a[@href='#collapse29']"));
    public static final Target VALE_REGALO = Target.the("Clic en vale de regalo").located(By.xpath("//ul[@id='collapse29']//a[text()='Gift Vouchers']"));
    public static final Target ADD_VALE = Target.the("Clic en aggregar").located(By.xpath("//div/a[@data-toggle='tooltip']"));
    public static final Target COMPROBAR_INFO = Target.the("Comprobacion").located(By.xpath("//legend[text()='Product Information & Reason for Return']"));
    public static final Target VERIF_VALE = Target.the("verifica lista de devoluciones").located(By.xpath("//h3[contains(text(),' Gift Voucher List')]"));
    public static final Target CODIGO = Target.the("ingresa codigo").located(By.xpath("//input[@id='input-code']"));
    public static final Target FROM_NAME= Target.the("ingresa from name").located(By.xpath("//input[@id='input-from-name']"));
    public static final Target FROM_EMAIL= Target.the("ingresa from email").located(By.xpath("//input[@id='input-from-email']"));
    public static final Target TO_NAME= Target.the("ingresa to name").located(By.xpath("//input[@id='input-to-name']"));
    public static final Target TO_EMAIL= Target.the("ingresa to name").located(By.xpath("//input[@id='input-to-email']"));
    public static final Target AMOUNT= Target.the("ingresa amount").located(By.xpath("//input[@id='input-amount']"));


    public static final Target REGISTRAR = Target.the("Registro").located(By.xpath("//button[@data-original-title='Save']"));


    public static final Target GUARDAR_REGISTRO = Target.the("gaurdar").located(By.xpath("//div[@class='alert alert-danger alert-dismissible']"));
}
