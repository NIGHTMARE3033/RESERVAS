/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Datos;

/**
 *
 * @author Patricio Arce
 */
public class Pacientes {
    
    private String rut;
    private String digitoVer;
    private String nombres;
    private String apellidos;
    private int telefono;
    private String hora;
    private String especialidad;
    private String nombreDoc;
    private String fechaReserva;
    

   
     public Pacientes() {
        this.rut = "";
        this.digitoVer = "";
        this.nombres = "";
        this.apellidos = "";
        this.telefono = 0;
        this.hora = "";
        this.especialidad = "";
        this.nombreDoc = "";
        this.fechaReserva="";
     }

    public Pacientes(String rut, String digitoVer, String nombres, int telefono, String hora, String especialidad, String nombreDoc, String fechaReserva) {
        this.rut = rut;
        this.digitoVer = digitoVer;
        this.nombres = nombres;
        this.telefono = telefono;
        this.hora = hora;
        this.especialidad = especialidad;
        this.nombreDoc = nombreDoc;
        this.fechaReserva = fechaReserva;
    }

    /**
     * @return the rut
     */
    public String getRut() {
        return rut;
    }

    /**
     * @param rut the rut to set
     */
    public void setRut(String rut) {
        this.rut = rut;
    }

    /**
     * @return the digitoVer
     */
    public String getDigitoVer() {
        return digitoVer;
    }

    /**
     * @param digitoVer the digitoVer to set
     */
    public void setDigitoVer(String digitoVer) {
        this.digitoVer = digitoVer;
    }

    /**
     * @return the nombres
     */
    public String getNombres() {
        return nombres;
    }

    /**
     * @param nombres the nombres to set
     */
    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    /**
     * @return the apellidos
     */
    public String getApellidos() {
        return apellidos;
    }

    /**
     * @param apellidos the apellidos to set
     */
    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    /**
     * @return the telefono
     */
    public int getTelefono() {
        return telefono;
    }

    /**
     * @param telefono the telefono to set
     */
    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    /**
     * @return the hora
     */
    public String getHora() {
        return hora;
    }

    /**
     * @param hora the hora to set
     */
    public void setHora(String hora) {
        this.hora = hora;
    }

    /**
     * @return the especialidad
     */
    public String getEspecialidad() {
        return especialidad;
    }

    /**
     * @param especialidad the especialidad to set
     */
    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    /**
     * @return the nombreDoc
     */
    public String getNombreDoc() {
        return nombreDoc;
    }

    /**
     * @param nombreDoc the nombreDoc to set
     */
    public void setNombreDoc(String nombreDoc) {
        this.nombreDoc = nombreDoc;
    }

    /**
     * @return the fechaReserva
     */
    public String getFechaReserva() {
        return fechaReserva;
    }

    /**
     * @param fechaReserva the fechaReserva to set
     */
    public void setFechaReserva(String fechaReserva) {
        this.fechaReserva = fechaReserva;
    }

}