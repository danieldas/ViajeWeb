package com.das.daniel.viajeweb.Modelo;

/**
 * Created by Daniel on 16/09/2017.
 */
public class Reserva {
    private String IdReserva;
    private String Nombre;
    private String Apellido;
    private String Ci;

    public Reserva(String idReserva, String nombre, String apellido, String ci) {
        IdReserva = idReserva;
        Nombre = nombre;
        Apellido = apellido;
        Ci = ci;
    }

    public Reserva() {
    }

    public String getIdReserva() {
        return IdReserva;
    }

    public void setIdReserva(String idReserva) {
        IdReserva = idReserva;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public String getApellido() {
        return Apellido;
    }

    public void setApellido(String apellido) {
        Apellido = apellido;
    }

    public String getCi() {
        return Ci;
    }

    public void setCi(String ci) {
        Ci = ci;
    }
}
