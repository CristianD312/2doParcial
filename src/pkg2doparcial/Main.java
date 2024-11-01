package pkg2doparcial;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        int precioKmNacional = 25;
        int precioKmInternacional = 50;
        int gestionPasaporte = 500;
        int contadorVentas = 0;
// Creación de destinos
        List<Destino> destinos = new ArrayList<>();
        destinos.add(new DestinoNacional(precioKmNacional, contadorVentas, "Buenos Aires", 400, 01));
        destinos.add(new DestinoNacional(precioKmNacional, contadorVentas, "Córdoba", 700, 02));
        destinos.add(new DestinoInternacional(precioKmInternacional, gestionPasaporte, false, "Miami", 7000, 04, contadorVentas));
        destinos.add(new DestinoInternacional(precioKmInternacional, gestionPasaporte, true, "Madrid", 11000, 05, contadorVentas));
        destinos.add(new DestinoInternacional(precioKmInternacional, gestionPasaporte, true, "Sídney", 15000, 06, contadorVentas));
        List<Vendedor> vendedores = new ArrayList<>();
        vendedores.add(new Vendedor(01, "Ana", 5000, 5));
        vendedores.add(new Vendedor(02, "Luis", 4500, 3));
        vendedores.add(new Vendedor(03, "María", 5500, 7));

        List<Agencia> rauchTurismo = new ArrayList<>();

        Agencia agencia1 = new Agencia(destinos.get(0), vendedores.get(0));
        rauchTurismo.add(agencia1);
        Agencia agencia2 = new Agencia(destinos.get(2), vendedores.get(0));
        rauchTurismo.add(agencia2);
        Agencia agencia3 = new Agencia(destinos.get(3), vendedores.get(0));
        rauchTurismo.add(agencia3);
        Agencia agencia4 = new Agencia(destinos.get(3), vendedores.get(0));
        rauchTurismo.add(agencia4);
        Agencia agencia5 = new Agencia(destinos.get(4), vendedores.get(0));
        rauchTurismo.add(agencia5);
        Agencia agencia6 = new Agencia(destinos.get(4), vendedores.get(0));
        rauchTurismo.add(agencia6);
        Agencia agencia7 = new Agencia(destinos.get(3), vendedores.get(0));
        rauchTurismo.add(agencia7);

        /* Codigo para realizar la accion de cual es el turismo mas vendido
        se realiza de dos maneras, la primera con una estructura for y una estructura while interior.
        se compara el nombre destino vendido con los nombres de la lista destino y en caso de coincidencia
        se aplica el metodo incrementarContadorVentas();
        
         */
        
       
        for (int i = 0; i < rauchTurismo.size(); i++) {
            buscarDestinoMasVendido1(destinos,rauchTurismo, i);
        }
        // la segunda forma es con dos for each.
        for (Agencia agencia : rauchTurismo) {
            buscarDestinoMasVendido2(destinos,agencia);
        }

        /* codigo para realizar: 
        - calcular el total del monto de ventas realizadas 
        - la busqueda del destino mas vendido 
         
         se declaran las variables a 0.
         */
        double totalVendido = 0;
        int DestinoMejorVendido = 0;
        String mejorDestino = null;
        for (Agencia agencia : rauchTurismo) {
            System.out.println("vendedor: " + agencia.getVendedor().getNombre() + " / Destino: " + agencia.getDestino().getNombre() + " / costo: $" + agencia.calcularPrecioPasaje());
            totalVendido = (totalVendido + agencia.calcularPrecioPasaje() );
            
            if (DestinoMejorVendido <= agencia.getDestino().getContadorVentas()) {
                DestinoMejorVendido = agencia.getDestino().getContadorVentas();
                mejorDestino = agencia.getDestino().getNombre();
            }

        }

        System.out.println("El total de pasajes vendidos es $" + totalVendido);
        System.out.println("El destino mas vendido es: " + mejorDestino);
        
        int idVendedorBuscado=0;
        boolean busqueda=true;
        int i=0;    
        while (busqueda && i<vendedores.size()) {
            if (vendedores.get(i).getIdVendedor()==idVendedorBuscado) {
                System.out.println("El nombre del vendedor es: "+rauchTurismo.get(i).getVendedor().getNombre());
            }
            i++;
            
        }

    }
    
    //Fuera del main se ingresaron estos metodos 
    
    public static void buscarDestinoMasVendido1(List<Destino> destinos,List<Agencia> rauchTurismo,int i){
    int j = 0;
            while (j < destinos.size()) {
                if (rauchTurismo.get(i).getDestino().getNombre().equals(destinos.get(j).getNombre())) {
                    rauchTurismo.get(i).getDestino().incrementarContadorVentas();
                    System.out.println("Cantidad ventas destino de: " + rauchTurismo.get(i).getDestino().getNombre() + " es: " + rauchTurismo.get(i).getDestino().contadorVentas);
                    break;
                }
                j++;
            }
    
    
    }
    
    //metodo 2 para buscar destino mas vendido.
    public static void buscarDestinoMasVendido2(List<Destino> destinos, Agencia agencia){
    
    for (Destino destino : destinos) {
                if (agencia.getDestino().getNombre().equals(destino.getNombre())) {
                    destino.incrementarContadorVentas();
                    System.out.println("Cantidad ventas destino de: " + destino.getNombre() + " es: " + destino.getContadorVentas());
                }
            }
    
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
