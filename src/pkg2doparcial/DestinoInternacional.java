package pkg2doparcial;

public class DestinoInternacional extends Destino {

    private int precioxkm; // Impuesto adicional en $
    private int gestionPasaporte;
    private boolean solicitudPasaporte;


    public DestinoInternacional(int precioxkm, int gestionPasaporte, boolean solicitudPasaporte, String nombre, double distancia, int idDestino, int contadorVentas) {
        super(nombre, distancia, idDestino, contadorVentas);
        this.precioxkm = precioxkm;
        this.gestionPasaporte = gestionPasaporte;
        this.solicitudPasaporte = solicitudPasaporte;
 
    }

    public int getPrecioxkm() {
        return precioxkm;
    }

    public void setPrecioxkm(int precioxkm) {
        this.precioxkm = precioxkm;
    }

      public double getImpuesto() {
        return precioxkm;
    }

    public void setImpuesto(int impuesto) {
        this.precioxkm = impuesto;
    }

    public int getGestionPasaporte() {
        return gestionPasaporte;
    }

    public void setGestionPasaporte(int gestionPasaporte) {
        this.gestionPasaporte = gestionPasaporte;
    }

    public boolean isSolicitudPasaporte() {
        return solicitudPasaporte;
    }

    public void setSolicitudPasaporte(boolean solicitudPasaporte) {
        this.solicitudPasaporte = solicitudPasaporte;
    }

    @Override
    public void incrementarContadorVentas() {
        this.contadorVentas++;
    }

    @Override
    public double calcularCostoPasaje() {
        if (solicitudPasaporte) {
            return (gestionPasaporte + (precioxkm * getDistancia()));
        }
        return (precioxkm * getDistancia());

    }

}
