/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EDD;

import java.util.Arrays;

public class Vertice {
    private String name;
    private int numVertice;
    private boolean fueVisitado;
    
    //Constructors
    public Vertice(String name, int num_vertice) {
        this.name = name;
        this.numVertice = num_vertice;
        this.fueVisitado = false;
    }
    
    public Vertice(String name) {
        this.name = name;
        this.numVertice = -1;
        this.fueVisitado = false;
    }
    
    //Getters and Setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumVertice() {
        return numVertice;
    }

    public void setNumVertice(int numVertice) {
        this.numVertice = numVertice;
    }
 
    public boolean equals(Vertice n) {
        return name.equals(n.name);
    }
    
    public void asigVertice(int n){
        numVertice = n;
    }
    
    public boolean isFueVisitado() {
        return fueVisitado;
    }

    public void setFueVisitado(boolean fueVisitado) {
        this.fueVisitado = fueVisitado;
    }
    
    //Print for Vertice

    @Override
    public String toString() {
        return "Vertice{" + "name=" + name + ", numVertice=" + numVertice + ", fueVisitado=" + fueVisitado + '}';
    }
    
}
