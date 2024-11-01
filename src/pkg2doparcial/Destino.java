
package pkg2doparcial;


public abstract class Destino {

    protected String nombre;
    protected double distancia; // en kilómetros
    protected int idDestino;
    protected int contadorVentas;

    public Destino(String nombre, double distancia, int idDestino, int contadorVentas) {
        this.nombre = nombre;
        this.distancia = distancia;
        this.idDestino = idDestino;
        this.contadorVentas = contadorVentas;
    }

    

    public String getNombre() {
        return nombre;
    }

    public double getDistancia() {
        return distancia;
    }

    public int getIdDestino() {
        return idDestino;
    }

    public int getContadorVentas() {
        return contadorVentas;
    }

    public void setContadorVentas(int contadorVentas) {
        this.contadorVentas = contadorVentas;
    }
    

    

    public abstract double calcularCostoPasaje();
    public void incrementarContadorVentas() {
        this.contadorVentas++;
    }
}
  
