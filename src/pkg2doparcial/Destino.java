
package pkg2doparcial;


public abstract class Destino {

    protected String nombre;
    protected double distancia; // en kilómetros
    protected int idDestino;

    public Destino(String nombre, double distancia, int idDestino) {
        this.nombre = nombre;
        this.distancia = distancia;
        this.idDestino = idDestino;
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

    

    public abstract double calcularCostoPasaje();
    
}
