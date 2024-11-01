package pkg2doparcial;

public class DestinoNacional extends Destino {

    public double precioxkm;
   

    public DestinoNacional(double precioxkm, int contadorVentas, String nombre, double distancia, int idDestino) {
        super(nombre, distancia, idDestino,contadorVentas);
        this.precioxkm = precioxkm;
      
    }

    @Override
    public void incrementarContadorVentas() {
        this.contadorVentas++;
    }

    @Override
    public double calcularCostoPasaje() {
        double costo = getDistancia() * precioxkm; // $25 por km para viajes nacionales
        return costo;

    }

}
