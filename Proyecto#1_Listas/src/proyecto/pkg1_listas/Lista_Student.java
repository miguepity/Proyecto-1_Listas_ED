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
public class Lista_Student {

    Nodo_Student head;
    int size = 0;

    public Lista_Student() {
        head = new Nodo_Student();
    }

    public boolean insert(Student student, int pos) {
        if(pos<0 || pos>size){
            return false;
        }
        Nodo_Student neo= new Nodo_Student(student);
        if(size==0){
            head=neo;
        }else if(pos==0){
            neo.next=head;
            head = neo;
        }else{
            Nodo_Student temp = head;
            for (int i = 0; i < pos-1; i++) {
                temp= temp.next;
            }
            neo.next=temp.next;
            temp.next=neo;
        }
        size++;
        return true;
        
    }

    public void setHead(Nodo_Student head) {
        this.head = head;
    }

    public Student get(int pos) {
        Nodo_Student temp = head;
        Student student = temp.getStudent();
        for (int i = 0; i < pos; i++) {
            temp = temp.getNext();

            student = temp.getStudent();
        }
        return student;
    }

    public void delete(int pos) {
        Nodo_Student temp = head;
        for (int i = 1; i < pos - 1; i++) {
            temp = temp.getNext();
        }
        Nodo_Student temp2 = temp.getNext();
        temp.setNext(temp2.getNext());
    }

    public Student first() {
        return head.getStudent();
    }

    public void Print_Lista() {
        Nodo_Student temp = head;
        int cont = 0;
        while (temp != null) {
            if (cont == 0) {
                System.out.print("[H]");
            }
            if (temp.getNext() != null) {
                System.out.print("[" + temp.getStudent() + "] - ");
                cont++;
            } else {
                System.out.print("[" + temp.getStudent() + "]");
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
