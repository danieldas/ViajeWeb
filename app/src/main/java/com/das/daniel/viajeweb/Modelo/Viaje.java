package com.das.daniel.viajeweb.Modelo;

/**
 * Created by Daniel on 16/09/2017.
 */
public class Viaje {
    private String codigo;
    private String destino;
    private String horario;
    private double precio;
    private String flota;
    private String imagen;

    public Viaje(String codigo, String destino, String horario, double precio, String flota, String imagen) {
        this.codigo = codigo;
        this.destino = destino;
        this.horario = horario;
        this.precio = precio;
        this.flota = flota;
        this.imagen=imagen;
    }

    public Viaje() {
    }

    public String getImagen() {
        return imagen;
    }

    public void setImagen(String imagen) {
        this.imagen = imagen;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getFlota() {
        return flota;
    }

    public void setFlota(String flota) {
        this.flota = flota;
    }
}
