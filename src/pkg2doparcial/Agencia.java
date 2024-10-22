
package pkg2doparcial;


public class Agencia {
    
    private Destino destino;
    private Vendedor vendedor;

    public Agencia(Destino destino, Vendedor vendedor) {
        this.destino = destino;
        this.vendedor = vendedor;
    }

    public Destino getDestino() {
        return destino;
    }

    public void setDestino(Destino destino) {
        this.destino = destino;
    }

    public Vendedor getVendedor() {
        return vendedor;
    }

    public void setVendedor(Vendedor vendedor) {
        this.vendedor = vendedor;
    }
    
    public double calcularPrecioPasaje(){
        double precioPasaje=(getDestino().calcularCostoPasaje());
    
    return (precioPasaje+(precioPasaje*0.21)); // precio pasaje + iva
    
    }
    
    
    
}
