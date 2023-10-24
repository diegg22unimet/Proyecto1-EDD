/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Functions;

import EDD.Grafo;
import EDD.Vertice;

public class Functions_Graph {
    //Aqui van las funciones que tienen que ver con el grafo
    
    //Funcion para añadir un usuario al grafo
    public Grafo add_user(Grafo grafo, String user) {
        // Crear un nuevo grafo con capacidad ampliada
        Grafo nuevoGrafo = new Grafo(grafo.getNumVerts() + 1);
        nuevoGrafo.setNumVerts(grafo.getNumVerts() + 1);
        nuevoGrafo.setVerts(new Vertice[nuevoGrafo.getNumVerts()]);
        nuevoGrafo.setMatAd(new int[nuevoGrafo.getNumVerts()][nuevoGrafo.getNumVerts()]);

        // Copiar los vértices existentes y la matriz de adyacencia del grafo original al nuevo grafo
        for (int i = 0; i < grafo.getNumVerts(); i++) {
            nuevoGrafo.getVerts()[i] = grafo.getVerts()[i];
            for (int j = 0; j < grafo.getNumVerts(); j++) {
                nuevoGrafo.getMatAd()[i][j] = grafo.getMatAd()[i][j];
            }
        }

        // Agregar el nuevo vértice
        int nuevoVerticeNum = grafo.getNumVerts(); // Obtener el número del nuevo vértice
        nuevoGrafo.getVerts()[nuevoVerticeNum] = new Vertice(user);
        nuevoGrafo.getVerts()[nuevoVerticeNum].setNumVertice(nuevoVerticeNum);

        return nuevoGrafo;
    }
    
    //Funcion para eliminar un usuario del grafo
    public void delete_user(Grafo grafo, String user){
    
    }
    
}
