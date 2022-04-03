public class Programa {

    public static void main (String args[]){
        ProductoBancario pb1 = new ProductoBancario("Pepito", 17, 10);
        Cuenta c1 = new Cuenta("Pepito", 17, 10);
        CuentaJoven cj1 = new CuentaJoven("Pepito", 17, 10);
        Prestamo p1 = new Prestamo("Pepito", 17, 10);
        Hipoteca h1 = new Hipoteca("Pepito", 17, 10);

        pb1.DatosCuentaBancaria();
        c1.DatosCuenta();
        cj1.DatosCuentaJoven();
        p1.DatosPestamo();
        h1.DatosHipoteca();
    }
}
