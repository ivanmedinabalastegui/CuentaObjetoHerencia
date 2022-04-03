public class CuentaJoven extends Cuenta{

    public CuentaJoven(String cliente, double saldo, int numProductos){
        super(cliente, saldo, numProductos);
    }

    public void DatosCuentaJoven(){
        System.out.println("\nCUENTA JOVEN\nCliente: " + cliente + "\nSaldo: " + saldo + "\nNúmero de productos: " + numProductos);
    }
}
