package pkg2doparcial;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        int precioKmNacional = 25;
        int precioKmInternacional = 50;
        int gestionPasaporte = 500;
// Creación de destinos
        List<Destino> destinos = new ArrayList<>();
        destinos.add(new DestinoNacional(precioKmNacional, "Buenos Aires", 400, 01));
        destinos.add(new DestinoNacional(precioKmNacional, "Córdoba", 700, 02));
        destinos.add(new DestinoInternacional(precioKmInternacional, gestionPasaporte, false, "Miami", 7000, 04));
        destinos.add(new DestinoInternacional(precioKmInternacional, gestionPasaporte, true, "Madrid", 11000, 05));
        destinos.add(new DestinoInternacional(precioKmInternacional, gestionPasaporte, true, "Sídney", 15000, 06));
        List<Vendedor> vendedores = new ArrayList<>();
        vendedores.add(new Vendedor(01,"Ana", 5000, 5));
        vendedores.add(new Vendedor(02,"Luis", 4500, 3));
        vendedores.add(new Vendedor(03,"María", 5500, 7));
        
        Agencia age = new Agencia(destinos.get(0), vendedores.get(0));
        
        System.out.println(age.getVendedor().getNombre()+"vendió :"+age.getDestino().getNombre()+"costo: $"+age.calcularPrecioPasaje());
        
        List<Agencia>rauchTurismo = new ArrayList<>();
        
        for (int i = 0; i < 7; i++) {
           rauchTurismo.add(new Agencia (destinos.get(numeroAleatorioEntre(0, destinos.size())), vendedores.get(numeroAleatorioEntre(0, vendedores.size())))); 
        }
        
        //rauchTurismo.add(new Agencia (destinos.get(numeroAleatorioEntre(0, 6)), vendedores.get(numeroAleatorioEntre(0, 2))));
        double totalVendido=0;
        for (Agencia agencia : rauchTurismo) {
            System.out.println("vendedor: "+agencia.getVendedor().getNombre()+" / Destino: "+agencia.getDestino().getNombre()+" / costo: $"+agencia.calcularPrecioPasaje());
            totalVendido=totalVendido+agencia.calcularPrecioPasaje();
        }
        
        System.out.println("El total de pasajes vendidos es $"+totalVendido);

    }
    public static int numeroAleatorioEntre(int min, int max) {
        return (int) (Math.random() * (max - min )) + min;
    }
    /*
    A TENER EN CUENTA
    - REVISAR EL CODIGO SI NO HAY NINGUNA SITUACION DONDE NO CUMPLA CON LOS 4 PILARES
      DE LA P.O.O. (METODOS ABSTRACTOS, POLIMORFISMO, ENCAPSULAMIENTO, HERENCIA).
    - SI EXISTE ALGUN METODO QUE PUEDA SER OPTIMIZADO O CAMBIADO, HAGANLO.
    - SE PUEDE UTILIZAR UNA CLASE ABSTRACTA EN ESTE CODIGO? EXPLICA PORQUE
    - SE UTILIZA EL POLIMORFIMO? JUSTIFICALO.
    - PARA COMPLETAR EL CODIGO DEBEMOS
        A) REALIZAR AL MENOS 7 VENTAS. (SE RECOMIENDA EL USO DE ACOPLAMIENTO)
        B) UNA VEZ REALIZADA LAS VENTAS, SE DEBE GENERAR UN ALGORITMO DE BUSQUEDA PARA VENDEDORES.
        C) SE DEBE MOSTRAR POR PANTALLA EL TOTAL DE VENTAS Y CUAL ES EL DESTINO MAS VENDIDO.

    
    
    
    */
    
    

}
