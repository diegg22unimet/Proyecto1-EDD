/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EDD;

import javax.swing.JOptionPane;

public class ListaSimple {

    private Nodo pFirst; //nodo apuntador al primero
    private int size; //tamaño de la lista

    //Constructor de la clase Lista
    public ListaSimple() {
        this.pFirst = null;
        this.size = 0;
    }

    //Metodos get y set para los atrubutos
    public Nodo getpFirst() {
        return pFirst;
    }

    public void setpFirst(Nodo pFirst) {
        this.pFirst = pFirst;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    //Primitivas
    //Funcion para verificar si la lista es vacia
    public boolean EsVacio() {
        return this.pFirst == null;
    }

    //Metodo que vacia la lista
    public void vaciar() {
        this.pFirst = null;
        this.size = 0;
    }

    //Metodo para insertar al final
    public void insertarAlFinal(Object dato) {

        // Define un nuevo nodo.
        Nodo nuevo = new Nodo();
        // Agrega al valor al nodo.
        nuevo.setDato(dato);

        if (EsVacio()) {
            pFirst = nuevo;
        } else {

            Nodo aux = pFirst;

            while (aux.getPnext() != null) {
                aux = aux.getPnext();
            }

            aux.setPnext(nuevo);
        }
        size++;
    }

    //Metodo para insertar al inicio
    public void InsertarInicio(Object dato) {

        Nodo pNew = new Nodo();
        pNew.setPnext(pNew);

        if (EsVacio()) {

            pFirst = pNew;

        } else {
            pNew.setPnext(pFirst);
            pFirst = pNew;
        }
        size++;
    }

    //Funcion para eliminar al inicio
    public boolean Eliminar_Inicio() {
        if (!EsVacio()) {
            pFirst = pFirst.getPnext();
            size--;
            return true;
        } else {
            return false;
        }
    }

    public void mostrar1() {
        if (!EsVacio()) {
//            String expresion = this.Transformar();
            Nodo aux = pFirst;
            String expresion = "Lista:\n\n";
            for (int i = 0; i < size; i++) {
                expresion = expresion + i + ". " + aux.getDato().toString() + "\n\n";
                aux = aux.getPnext();
            }
            JOptionPane.showMessageDialog(null, expresion);

        } else {
            JOptionPane.showMessageDialog(null, "La lista esta vacia");
        }
    }

    //Funcion para retornar el dato en una posicion determinada de la lista
    public Object getValor(int posicion) {

        if (posicion >= 0 && posicion < size) {

            if (posicion == 0) {
                return pFirst.getDato();
            } else {
                Nodo aux = pFirst;
                for (int i = 0; i < posicion; i++) {
                    aux = aux.getPnext();
                }
                return aux.getDato();
            }
        }
        return null;

    }

}
