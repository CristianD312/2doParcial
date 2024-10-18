/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg2doparcial;

import com.sun.source.tree.ReturnTree;

/**
 *
 * @author Familia
 */
public class Destino {

    private String nombre;
    private double distancia; // en kilómetros
    private int idDestino;

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

    

    public double calcularCostoPasaje() {

        return 0;
    }
}
