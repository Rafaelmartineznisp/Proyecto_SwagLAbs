package co.com.choucair.swaglabs.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class LocalizarSwagLabs extends PageObject {


    public static final Target INPUT_USUARIO = Target.the("Ingresar Usuario").located(By.id("user-name"));
    public static final Target INPUT_CONTRASENNA = Target.the("Ingresar contrasenna").located(By.id("password"));
    public static final Target LOGIN = Target.the("Click en ingresar").located(By.id("login-button"));
    public static final Target LOGUIADO = Target.the("Verificar ingreso").located(By.xpath("//span[@class='title']"));
    public static final Target NOLOGUIADO = Target.the("ingreso fallido").located(By.xpath("//div[@class='error-message-container error']//h3"));
    public static final Target AGREGAR =Target.the("Adicionar producto al carrito").located(By.xpath("//div[@class='pricebar']//button[@name='add-to-cart-sauce-labs-backpack']"));
    public static final Target CARRITO = Target.the("Ir al carrtito de compras").located(By.xpath("//a[@class='shopping_cart_link']"));
    public static final Target VERIFICAR = Target.the("Verificar la compra").located(By.id("checkout"));
    public static final Target NOMBRE = Target.the("Ingrsar nombre del comprador").located(By.id("first-name"));
    public static final Target APELLIDO = Target.the("Ingresar Apellido del comprador").located(By.id("last-name"));
    public static final Target POSTAL = Target.the("Ingrsar codigo postal del comprador").located(By.id("postal-code"));
    public static final Target CONTINUAR = Target.the("Click en continuar").located(By.id("continue"));
    public static final Target FINALIZAR = Target.the("Click en finalizar").located(By.id("finish"));
    public static final Target COMPRA = Target.the("Verificar compra").located(By.xpath("//div[@id='checkout_complete_container']/h2"));
    public static final Target VOLVER_HOME = Target.the("Volver a la pagina principal").located(By.id("back-to-products"));
    public static final Target MENU = Target.the("Menu").located(By.id("react-burger-menu-btn"));
    public static final Target SALIR = Target.the("Salir de la plataforma").located(By.xpath("//div[@class='bm-menu-wrap']//a[contains(text(),'Logout')]"));
}
