package co.com.choucair.opencart.stepdefinitions;

import co.com.choucair.opencart.model.Datos;
import co.com.choucair.opencart.questions.*;
import co.com.choucair.opencart.tasks.*;
import cucumber.api.java.Before;
import cucumber.api.java.bs.Dato;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import org.hamcrest.Matchers;

import java.util.List;

public class MyStepdefs {

    @Before
    public void iniciarEscenario() {
        OnStage.setTheStage(new OnlineCast());
    }

    @Given("^dado que Elkin ingresa a la plataforma opencart$")
    public void dadoQueElkinIngresaALaPlataformaOpencart() {
        OnStage.theActorCalled("Elkin").attemptsTo(AbrirTask.Pagina());
    }

    @And("^digita las credenciales de acceso e ingresa$")
    public void digitaLasCredencialesDeAccesoEIngresa(List<Datos> data) {
        OnStage.theActorInTheSpotlight().attemptsTo(Login.acceso(data.get(0)));
    }

    @When("^busca la seccion de pedidos en el modulo de ventas$")
    public void buscaLaSeccionDePedidosEnElModuloDeVentas() {
        OnStage.theActorInTheSpotlight().attemptsTo(BuscarTask.moduloPedidos());

    }

    @And("^verifica que aparece la lista de pedidos$")
    public void verificaQueApareceLaListaDePedidos() {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(VerificaLista.pedidos(),Matchers.equalTo("Order List")));

    }

    @And("^realiza el filtro por id para buscar una orden$")
    public void realizaElFiltroPorIdParaBuscarUnaOrden(List<Datos> data) {
        OnStage.theActorInTheSpotlight().attemptsTo(BuscarOrden.venta(data.get(0)));
    }

    @And("^visualiza a detalle el pedido seleccionado$")
    public void visualizaADetalleElPedidoSeleccionado() {
        OnStage.theActorInTheSpotlight().attemptsTo(Detalle.orden());
    }

    @Then("^verifica que la informacion del pedido esta almacenada correctamente$")
    public void verificaQueLaInformacionDelPedidoEstaAlmacenadaCorrectamente(List<Datos> datos) {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(VerificaDetalle.orden(datos.get(0))));
    }





    @When("^busca la seccion de devoluciones en el modulo de ventas$")
    public void buscaLaSeccionDeDevolucionesEnElModuloDeVentas(List<Datos> datos) {
        OnStage.theActorInTheSpotlight().attemptsTo(SeleccionarDevol.ventas(datos.get(0)));
    }

    @And("^verifica que aparece la lista de devoluciones$")
    public void verificaQueApareceLaListaDeDevoluciones() {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(VerificarDevol.orden(),Matchers.equalTo("Product Return List")));

    }

    @And("^realiza el filtro por id para buscar una devolucion$")
    public void realizaElFiltroPorIdParaBuscarUnaDevolucion(List<Datos> data) {
        OnStage.theActorInTheSpotlight().attemptsTo(BuscarDevol.pedido(data.get(0)));
    }

    @And("^visualiza a detalle la devolucion seleccionada$")
    public void visualizaADetalleLaDevolucionSeleccionada() {
        OnStage.theActorInTheSpotlight().attemptsTo(DetallarDevolucion.devolucion());
    }

    @Then("^verifica que la informacion de la devolucion esta almacenada correctamente$")
    public void verificaQueLaInformacionDeLaDevolucionEstaAlmacenadaCorrectamente() {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(Comprobar.devolucion(), Matchers.equalTo("Product Information & Reason for Return")));
    }


    @When("^busca la seccion de vales de regalo en el modulo de ventas$")
    public void buscaLaSeccionDeValesDeRegaloEnElModuloDeVentas() {
        OnStage.theActorInTheSpotlight().attemptsTo(SeleccionarVale.regalos());
    }

    @And("^verifica que esta en la seccion de vales de regalo$")
    public void verificaQueEstaEnLaSeccionDeValesDeRegalo() {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(VerificarVale.regalo(),Matchers.equalTo("Gift Voucher List")));
    }

    @And("^selecciona la opcion agregar nuevo$")
    public void seleccionaLaOpcionAgregarNuevo() {
        OnStage.theActorInTheSpotlight().attemptsTo(Seleccionar.agregarNuevo());
    }

    @And("^resgistra los datos del formulario vales de regalo$")
    public void resgistraLosDatosDelFormularioValesDeRegalo(List<Datos> data) {
        OnStage.theActorInTheSpotlight().attemptsTo(RegistrarTask.formulario(data.get(0)));
    }

    @Then("^Entonces valida creacion de vale fallido$")
    public void entoncesValidaCreacionDeValeFallido() {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(VerificarRegistro.fallido(),Matchers.equalTo("Warning: You do not have permission to modify vouchers!\n×")));
    }
}
