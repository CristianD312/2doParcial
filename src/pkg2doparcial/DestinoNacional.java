
package pkg2doparcial;


public class DestinoNacional extends Destino{
    
    public double precioxkm; 

    public DestinoNacional(double precioxkm, String nombre, double distancia, int idDestino) {
        super(nombre, distancia, idDestino);
        this.precioxkm = precioxkm;
    }
    

    @Override
    public double calcularCostoPasaje() {
        double costo = getDistancia() * precioxkm; // $25 por km para viajes nacionales
        return costo;
         
    }
    
}
