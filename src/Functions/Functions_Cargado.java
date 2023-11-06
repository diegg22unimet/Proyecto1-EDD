/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Functions;

import EDD.Grafo;
import EDD.ListaSimple;
import EDD.Vertice;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;

public class Functions_Cargado {

    //Funcion para saber si el txt donde se guarda la informacion del grafo esta vacio
    public String txt_IsEmpty() throws IOException {
        String txt = "";
        String path = "test\\Proyecto1_2324.txt";

        File file = new File(path);
        if (!file.exists()) {
            return null;
        } else {
            FileReader fr = new FileReader(file);
            BufferedReader br = new BufferedReader(fr);

            //Leer linea por linea y meter lo leido en la variable txt
            String line;
            while ((line = br.readLine()) != null) {
                if (!line.isEmpty()) {
                    txt += line + "\n";
                }
            }

            //Retornar null si no hay nada en el txt
            if (!"".equals(txt)) {
                br.close();
                return null;
            } else {
                br.close();
                return txt;
            }
        }
    }

    public Grafo cargar_txt(String txt) throws Exception {

        ListaSimple list_users = new ListaSimple();

        String txt_replace1 = txt.replaceFirst("usuarios", "Ω");
        String txt_replace2 = txt_replace1.replaceFirst("relaciones", "Ω");

        String[] users_relations = txt_replace2.split("Ω");
        //El primer usuario se encuentra en la posicion 1 del arreglo users
        String[] users = users_relations[1].split("\n");
        //Crear el grafo segun la cantidad de usuarios que tiene archivo
        Grafo graph = new Grafo(users.length);
        //Crear los vertices del Grafo el cual representa a los usuarios

        for (int i = 1; i < users.length; i++) {
            list_users.insertarAlFinal(users[i]);
        }

        for (int i = 0; i < list_users.getSize(); i++) {
            String user = (String) list_users.getValor(i);
            graph.nuevoVertice(user);
        }

        //La primer relacion se encuentra en la posicion 1 del arreglo users
        String[] relations = users_relations[2].split("\n");
        for (int i = 1; i < relations.length; i++) {
            String[] vertices_relacionados = relations[i].split(",");
            //list_users.
            for (int j = 0; j < 1; j++) {
                if (vertices_relacionados.length == 2) {
                    String vs1 = vertices_relacionados[0] + "\r";
                    String vs2 = vertices_relacionados[1].trim() + "\r";
                    graph.nuevoArco(graph.numVertice(vs1), graph.numVertice(vs2));
                }
            }
        }
        return graph;
    }
}
