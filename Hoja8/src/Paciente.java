/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author RodolfoC
 */
public class Paciente implements Comparable<Paciente>{
    
    // Se declaran las variables
    private String nombre;
    private String descripcion;
    private String prioridad;

    // Constructor
    public Paciente(String nombre, String descripcion, String prioridad) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.prioridad = prioridad;
    }
    
    
    // Getters y Setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getPrioridad() {
        return prioridad;
    }

    public void setPrioridad(String prioridad) {
        this.prioridad = prioridad;
    }

    @Override
    public String toString() {
        return "Nombre: " + nombre + ", Descripcion: " + descripcion + ", Prioridad: " + prioridad;
    }
    
    //Se hace override a la funcion compareTo de Comparable
    @Override
    public int compareTo(Paciente pacienteT) {
	String temp=((Paciente)pacienteT).getPrioridad();
	return prioridad.compareTo(temp);
    }
    
}
