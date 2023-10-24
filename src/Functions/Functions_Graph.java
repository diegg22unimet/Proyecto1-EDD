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
    public Grafo delete_user(Grafo grafo, String user) {
        int indice = grafo.numVertice(user);

        if (indice != -1) {
            Grafo nuevoGrafo = new Grafo(grafo.getNumVerts() - 1);
            nuevoGrafo.setMaxVerts(grafo.getMaxVerts());
            nuevoGrafo.setNumVerts(grafo.getNumVerts() - 1);
            nuevoGrafo.setVerts(new Vertice[nuevoGrafo.getNumVerts()]);
            nuevoGrafo.setMatAd(new int[nuevoGrafo.getNumVerts()][nuevoGrafo.getNumVerts()]);

            int nuevoIndice = 0;
            for (int i = 0; i < grafo.getNumVerts(); i++) {
                if (i != indice) {
                    nuevoGrafo.getVerts()[nuevoIndice] = grafo.getVerts()[i];
                    nuevoIndice++;
                }
            }

            for (int i = 0; i < nuevoGrafo.getNumVerts(); i++) {
                for (int j = 0; j < nuevoGrafo.getNumVerts(); j++) {
                    int valor = grafo.getMatAd()[i < indice ? i : i + 1][j < indice ? j : j + 1];
                    nuevoGrafo.getMatAd()[i][j] = valor;
                }
            }

            return nuevoGrafo;
        }

        return grafo;
    }
    
}
