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
public class Nodo_Student {

    private Student student;
    Nodo_Student next;

    public Nodo_Student(Student student) {
        this.student = student;
    }

    public Nodo_Student() {

    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public Nodo_Student getNext() {
        return next;
    }

    public void setNext(Nodo_Student next) {
        this.next = next;
    }

}
