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
public class Lista_Notas {

    Nodo_Notas head;
    int size;

    public Lista_Notas() {
        head = new Nodo_Notas();
    }

    public boolean insert(int notas, int pos) {
        if(pos<0 || pos>size){
            return false;
        }
        Nodo_Notas neo= new Nodo_Notas(notas);
        if(size==0){
            head=neo;
        }else if(pos==0){
            neo.next=head;
            head = neo;
        }else{
            Nodo_Notas temp = head;
            for (int i = 0; i < pos-1; i++) {
                temp= temp.next;
            }
            neo.next=temp.next;
            temp.next=neo;
        }
        size++;
        return true;        
    }

    public void setHead(Nodo_Notas head) {
        this.head = head;
    }

    public int get(int pos) {
        Nodo_Notas temp = head;
        int value = temp.getValue();
        for (int i = 0; i < pos; i++) {
            temp = temp.getNext();

            value = temp.getValue();
        }
        return value;
    }

    public void delete(int pos) {
        Nodo_Notas temp = head;
        for (int i = 1; i < pos - 1; i++) {
            temp = temp.getNext();
        }
        Nodo_Notas temp2 = temp.getNext();
        temp.setNext(temp2.getNext());
    }

    public int first() {
        return head.getValue();
    }

    public void Print_Lista() {
        Nodo_Notas temp = head;
        int cont = 0;
        while (temp != null) {
            if (cont == 0) {
                System.out.print("[H]");
            }
            if (temp.getNext() != null) {
                System.out.print("[" + temp.getValue() + "] - ");
                cont++;
            } else {
                System.out.print("[" + temp.getValue() + "]");
                cont++;
            }
            temp = temp.next;
        }
        System.out.println("");
    }

    public int getSize() {
        return size;
    }
}
