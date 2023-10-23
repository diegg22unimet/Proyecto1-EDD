/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EDD;

import javax.swing.JOptionPane;

public class Grafo {
    private int numVerts;
    private int MaxVerts;
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

    public int getMaxVerts() {
        return MaxVerts;
    }

    public void setMaxVerts(int MaxVerts) {
        this.MaxVerts = MaxVerts;
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
    
    //Elimina un vertice dado su nombre
    public void eliminarVertice(String nom) {
        int indice = numVertice(nom);
        if (indice == -1) {
            System.out.println("El vértice " + nom + " no existe.");
        }
        // Desplazar los vértices y la matriz de adyacencia hacia la izquierda
        for (int i = indice; i < numVerts - 1; i++) {
            verts[i] = verts[i + 1];
        }
        for (int i = 0; i < numVerts; i++) {
            for (int j = indice; j < numVerts - 1; j++) {
                matAd[i][j] = matAd[i][j + 1];
            }
        }
        for (int i = indice; i < numVerts - 1; i++) {
            for (int j = 0; j < numVerts; j++) {
                matAd[i][j] = matAd[i + 1][j];
            }
        }
        numVerts--;
    }
    
    //Método que crea un nuevo vértice con su respectiva adyacencia --PROBLEMA CON MaxVerts--
    public void crearVertice(Grafo graph, String nuevo_vertice, String vertice_adyacente) {
        if (numVerts >= MaxVerts) {
            // Redimensionar el grafo para aumentar su capacidad
            int nuevaCapacidad = MaxVerts + 1; // Aumentar la capacidad en este caso, puedes ajustarlo según tus necesidades
            Vertice[] nuevosVerts = new Vertice[nuevaCapacidad];
            int[][] nuevaMatAd = new int[nuevaCapacidad][nuevaCapacidad];

            // Copiar los vértices existentes y la matriz de adyacencia al nuevo arreglo y nueva matriz
            for (int i = 0; i < numVerts; i++) {
                nuevosVerts[i] = verts[i];
                System.arraycopy(matAd[i], 0, nuevaMatAd[i], 0, numVerts);  //error aquí
            }

            // Actualizar los arreglos y la capacidad del grafo
            verts = nuevosVerts;
            matAd = nuevaMatAd;
            MaxVerts = nuevaCapacidad;

            graph.setVerts(verts);
            graph.setMatAd(matAd);
            graph.setMaxVerts(MaxVerts);
        }

        // Crear el nuevo vértice y agregarlo al arreglo de vértices
        Vertice v = new Vertice(nuevo_vertice);
        verts[numVerts] = v;

        // Obtener el índice del vértice adyacente
        int indiceAdyacente = numVertice(vertice_adyacente);

        if (indiceAdyacente == -1) {
            System.out.println("El vértice adyacente " + vertice_adyacente + " no existe en el grafo.");
            return;
        }

        // Establecer la conexión entre el nuevo vértice y el vértice adyacente en la matriz de adyacencia
        matAd[numVerts][indiceAdyacente] = 1;

        graph.setNumVerts(numVerts + 1);
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
}
