public class Prestamo extends ProductoBancario{

    protected Prestamo(String cliente, double saldo, int numProductos){
        super(cliente, saldo, numProductos);
    }

    public void DatosPestamo(){
        System.out.println("\nPRÉSTAMO\nCliente: " + cliente + "\nSaldo: " + saldo + "\nNúmero de productos: " + numProductos);
    }
}
