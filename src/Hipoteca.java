public class Hipoteca extends Prestamo{

    public Hipoteca(String cliente, double saldo, int numProductos){
        super(cliente, saldo, numProductos);
    }

    public void DatosHipoteca(){
        System.out.println("\nHIPOTECA\nCliente: " + cliente + "\nSaldo: " + saldo + "\nNúmero de productos: " + numProductos);
    }
}
