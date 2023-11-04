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
    
    //Agrega un nuevo usuario
    public void addUser(String name) {
        // Crear una nueva matriz de adyacencia con un vértice adicional
        int[][] nuevaMatrizAdyacencia = new int[getNumVerts() + 1][getNumVerts() + 1];

        // Copiar los valores de la matriz de adyacencia existente a la nueva matriz
        for (int i = 0; i < getNumVerts(); i++) {
            for (int j = 0; j < getNumVerts(); j++) {
                nuevaMatrizAdyacencia[i][j] = getMatAd()[i][j];
            }
        }

        // Crear un nuevo arreglo de vértices con un vértice adicional
        Vertice[] nuevosVertices = new Vertice[getNumVerts() + 1];

        // Copiar los vértices existentes al nuevo arreglo
        for (int i = 0; i < getNumVerts(); i++) {
            nuevosVertices[i] = getVerts()[i];
        }

        // Crear el nuevo vértice con el nombre especificado y agregarlo al arreglo
        Vertice nuevoVertice = new Vertice(name, getNumVerts());
//        int nuevoVerticeNum = getNumVerts(); // Obtener el número del nuevo vértice
        nuevosVertices[getNumVerts()] = nuevoVertice;
//        getVerts()[nuevoVerticeNum].setNumVertice(nuevoVerticeNum);

        // Actualizar los atributos del grafo utilizando setters
        setNumVerts(getNumVerts() + 1);
        setMatAd(nuevaMatrizAdyacencia);
        setVerts(nuevosVertices);
    }
    
    public void deleteUser(int index) {
        // Verificar si el índice del vértice a eliminar es válido
        if (index < 0 || index >= getNumVerts()) {
            System.out.println("Índice de vértice inválido");
            return;
        }

        // Crear una nueva matriz de adyacencia con un vértice menos
        int[][] nuevaMatrizAdyacencia = new int[getNumVerts() - 1][getNumVerts() - 1];

        // Copiar los valores de la matriz de adyacencia existente a la nueva matriz, omitiendo la fila y columna correspondientes al vértice a eliminar
        int filaDestino = 0;
        int columnaDestino;
        for (int filaOrigen = 0; filaOrigen < getNumVerts(); filaOrigen++) {
            if (filaOrigen == index) {
                continue; // Saltar la fila correspondiente al vértice a eliminar
            }
            columnaDestino = 0;
            for (int columnaOrigen = 0; columnaOrigen < getNumVerts(); columnaOrigen++) {
                if (columnaOrigen == index) {
                    continue; // Saltar la columna correspondiente al vértice a eliminar
                }
                nuevaMatrizAdyacencia[filaDestino][columnaDestino] = getMatAd()[filaOrigen][columnaOrigen];
                columnaDestino++;
            }
            filaDestino++;
        }

        // Crear un nuevo arreglo de vértices con un vértice menos
        Vertice[] nuevosVertices = new Vertice[getNumVerts() - 1];

        // Copiar los vértices existentes al nuevo arreglo, omitiendo el vértice a eliminar
        int indiceDestino = 0;
        for (int indiceOrigen = 0; indiceOrigen < getNumVerts(); indiceOrigen++) {
            if (indiceOrigen == index) {
                continue; // Saltar el vértice a eliminar
            }
            nuevosVertices[indiceDestino] = getVerts()[indiceOrigen];
            indiceDestino++;
        }

        // Actualizar los atributos del grafo utilizando setters
        setNumVerts(getNumVerts() - 1);
        setMatAd(nuevaMatrizAdyacencia);
        setVerts(nuevosVertices);
    }
    
}
