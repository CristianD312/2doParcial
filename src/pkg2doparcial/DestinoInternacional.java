package pkg2doparcial;

public class DestinoInternacional extends Destino {

    private int precioxkm; // Impuesto adicional en $
    private int gestionPasaporte;
    private boolean solicitudPasaporte;

    public DestinoInternacional(int precioxkm, int gestionPasaporte, boolean solicitudPasaporte, String nombre, double distancia, int idDestino) {
        super(nombre, distancia, idDestino);
        this.precioxkm = precioxkm;
        this.gestionPasaporte = gestionPasaporte;
        this.solicitudPasaporte = solicitudPasaporte;
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
    public double calcularCostoPasaje() {
        if (solicitudPasaporte) {
            return (gestionPasaporte + (precioxkm * getDistancia()));
        }
        return (precioxkm * getDistancia());

    }

}
