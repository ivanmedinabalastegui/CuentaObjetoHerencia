public class Cuenta extends ProductoBancario {

    public Cuenta(String cliente, double saldo, int numProductos){
        super(cliente, saldo, numProductos);
    }

    public void DatosCuenta(){
        System.out.println("\nCUENTA\nCliente: " + cliente + "\nSaldo: " + saldo + "\nNúmero de productos: " + numProductos);
    }
}
