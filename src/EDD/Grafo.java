/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EDD;

import javax.swing.JOptionPane;

public class Grafo {
    private int numVerts;
    private Vertice [] verts;
    private int [][] matAd;
    
    //Constructor
    public Grafo(int mx){
        matAd = new int[mx][mx];
        verts = new Vertice[mx];
        for (int i = 0; i < mx; i++) {
            for (int j = 0; i < mx; i++) {
                matAd[i][j] = 0;
            }
        }
        numVerts = 0;
    }
    
    //Getters and Setters
    public int getNumVerts() {
        return numVerts;
    }

    public void setNumVerts(int numVerts) {
        this.numVerts = numVerts;
    }

    public Vertice[] getVerts() {
        return verts;
    }

    public void setVerts(Vertice[] verts) {
        this.verts = verts;
    }

    public int[][] getMatAd() {
        return matAd;
    }

    public void setMatAd(int[][] matAd) {
        this.matAd = matAd;
    }
    
    //Otros Metodos
    
    //Crear un nuevo vertice
    public void nuevoVertice(String nom) {
        boolean esta = numVertice(nom) >= 0;
        if (!esta) {
            Vertice v = new Vertice(nom);
            v.asigVertice(numVerts);
            verts[numVerts++] = v;
        }
    }
    
    //Método  para encontrar el numero del vertice dado un vertice
    public int numVertice(String vs) {
        Vertice v = new Vertice(vs);
        boolean encontrado = false;
        int i = 0;
        for (; (i < numVerts) && !encontrado;) {
            encontrado = verts[i].equals(v);
            if (!encontrado) {
                i++;
            }
        }
        return (i < numVerts) ? i : -1;
    }
    
    public void nuevoArco(int va, int vb) throws Exception {
        if (va  < 0 || vb < 0) {
            throw new Exception("Vértice no existe");
        }
        matAd[va][vb] = 1;
    }
    
    //Mostrar si dos Vertices son Adyacentes
    public boolean adyacente(int va, int vb) throws Exception {
        if (va  < 0 || vb < 0) {
            throw new Exception("Vértice no existe");
        }
        return matAd[va][vb] == 1;
    }
  
    //Metodo para obtener los vertices que no han sido visitados
    public int VerticesNoVisitados(int vert){
        
        for (int j = 0; j < getNumVerts(); j++) {
            if(matAd[vert][j]!=0 && !verts[j].isFueVisitado()){
                return j;
            }  
        }
        return -1;
    }
    
    //Mostrar los vertices de un grafo
    public String showElements(){
        String info = "";
        for (int i = 0; i < verts.length; i++) {
            Vertice current_vertex = verts[i];
            info += current_vertex.toString();
        }
        return info;
    }
    
    //Imprime por pantalla la matriz de adyacencia
    public void showMatAd() {
        for (int i = 0; i < numVerts; i++) {
            for (int j = 0; j < numVerts; j++) {
                System.out.print(matAd[i][j] + " ");
            }
            System.out.println();
        }
    }
    
    //Agrega un nuevo usuario al grafo pasando por parametro su nombre
    public void addUser(String name) {
        int[][] nuevaMatrizAdyacencia = new int[getNumVerts() + 1][getNumVerts() + 1];
        for (int i = 0; i < getNumVerts(); i++) {
            for (int j = 0; j < getNumVerts(); j++) {
                nuevaMatrizAdyacencia[i][j] = getMatAd()[i][j];
            }
        }
        Vertice[] nuevosVertices = new Vertice[getNumVerts() + 1];
        for (int i = 0; i < getNumVerts(); i++) {
            nuevosVertices[i] = getVerts()[i];
        }
        Vertice nuevoVertice = new Vertice(name, getNumVerts());
        nuevosVertices[getNumVerts()] = nuevoVertice;
        setNumVerts(getNumVerts() + 1);
        setMatAd(nuevaMatrizAdyacencia);
        setVerts(nuevosVertices);
    }
    
    //Elimina un usuario del grafo pasando por parametro el numero de su vertice
    public void deleteUser(int index) {
        if (index < 0 || index >= getNumVerts()) {
            System.out.println("Índice de vértice inválido");
        }
        int[][] nuevaMatrizAdyacencia = new int[getNumVerts() - 1][getNumVerts() - 1];
        int filaDestino = 0;
        int columnaDestino;
        for (int filaOrigen = 0; filaOrigen < getNumVerts(); filaOrigen++) {
            if (filaOrigen == index) {
                continue;
            }
            columnaDestino = 0;
            for (int columnaOrigen = 0; columnaOrigen < getNumVerts(); columnaOrigen++) {
                if (columnaOrigen == index) {
                    continue;
                }
                nuevaMatrizAdyacencia[filaDestino][columnaDestino] = getMatAd()[filaOrigen][columnaOrigen];
                columnaDestino++;
            }
            filaDestino++;
        }
        Vertice[] nuevosVertices = new Vertice[getNumVerts() - 1];
        int indiceDestino = 0;
        for (int indiceOrigen = 0; indiceOrigen < getNumVerts(); indiceOrigen++) {
            if (indiceOrigen == index) {
                continue;
            }
            nuevosVertices[indiceDestino] = getVerts()[indiceOrigen];
            indiceDestino++;
        }
        setNumVerts(getNumVerts() - 1);
        setMatAd(nuevaMatrizAdyacencia);
        setVerts(nuevosVertices);
    }
    
}
