/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto.pkg1_listas;

/**
 *
 * @author Miguel A. Ardon E
 */
public class Nodo_Notas {

    private int value;
    Nodo_Notas next;

    public Nodo_Notas(int value) {
        this.value = value;
    }

    public Nodo_Notas() {

    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public Nodo_Notas getNext() {
        return next;
    }

    public void setNext(Nodo_Notas next) {
        this.next = next;
    }
}
