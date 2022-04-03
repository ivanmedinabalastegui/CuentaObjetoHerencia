public class ProductoBancario {
    String cliente;
    double saldo;
    int numProductos;

    public ProductoBancario(String cliente, double saldo, int numProductos) {
        this.cliente = cliente;
        this.saldo = saldo;
        this.numProductos = numProductos;
    }

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public int getNumProductos() {
        return numProductos;
    }

    public void setNumProductos(int numProductos) {
        this.numProductos = numProductos;
    }

    public void DatosCuentaBancaria() {
        System.out.println("PRODUCTO BANCARIO\nCliente: " + cliente + "\nSaldo: " + saldo + "\nNúmero de productos: " + numProductos);
    }
}
