
package pkg2doparcial;


public class Vendedor {
    private int idVendedor;
    private String nombre;
    protected double sueldoBase;
    protected int antiguedad; // en años

    public Vendedor(int idVendedor, String nombre, double sueldoBase, int antiguedad) {
        this.idVendedor = idVendedor;
        this.nombre = nombre;
        this.sueldoBase = sueldoBase;
        this.antiguedad = antiguedad;
    }

    public int getIdVendedor() {
        return idVendedor;
    }

    public void setIdVendedor(int idVendedor) {
        this.idVendedor = idVendedor;
    }

    public double getSueldoBase() {
        return sueldoBase;
    }

    public void setSueldoBase(double sueldoBase) {
        this.sueldoBase = sueldoBase;
    }

    public int getAntiguedad() {
        return antiguedad;
    }

    public void setAntiguedad(int antiguedad) {
        this.antiguedad = antiguedad;
    }
    
    
    public String getNombre() {
        return nombre;
    }

    public double calcularSueldo() {
       return (sueldoBase * (1 + (antiguedad * 0.01))); // Sueldo base + 1% por año de antigüedad
    }


}
    

