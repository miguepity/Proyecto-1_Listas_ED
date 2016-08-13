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
public class Student {
    String numero_cuenta;
    String nombre;
    String carrera;
    Lista_Notas notas;

    public Student() {
    }

    public Student(String numero_cuenta, String nombre, String carrera, Lista_Notas notas) {
        this.numero_cuenta = numero_cuenta;
        this.nombre = nombre;
        this.carrera = carrera;
        this.notas = notas;
    }

    public String getNumero_cuenta() {
        return numero_cuenta;
    }

    public void setNumero_cuenta(String numero_cuenta) {
        this.numero_cuenta = numero_cuenta;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    public Lista_Notas getNotas() {
        return notas;
    }

    public void setNotas(Lista_Notas notas) {
        this.notas = notas;
    }

    @Override
    public String toString() {
        return "Student{" + "numero_cuenta=" + numero_cuenta + ", nombre=" + nombre + ", carrera=" + carrera + ", notas=" + notas.toString() + '}';
    }
}
