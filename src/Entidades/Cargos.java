/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidades;


public class Cargos {
    private int CARGO_ID;
    private String CARGO_NOMBRE;
    private String CARGO_SUELDO_MINIMO;
    private String CARGO_SUELDO_MAXIMO;

    public Cargos(int CARGO_ID, String CARGO_NOMBRE, String CARGO_SUELDO_MINIMO, String CARGO_SUELDO_MAXIMO) {
        this.CARGO_ID = CARGO_ID;
        this.CARGO_NOMBRE = CARGO_NOMBRE;
        this.CARGO_SUELDO_MINIMO = CARGO_SUELDO_MINIMO;
        this.CARGO_SUELDO_MAXIMO = CARGO_SUELDO_MAXIMO;
    }

    public int getCARGO_ID() {
        return CARGO_ID;
    }

    public String getCARGO_NOMBRE() {
        return CARGO_NOMBRE;
    }

    public String getCARGO_SUELDO_MINIMO() {
        return CARGO_SUELDO_MINIMO;
    }

    public String getCARGO_SUELDO_MAXIMO() {
        return CARGO_SUELDO_MAXIMO;
    }

    public void setCARGO_ID(int CARGO_ID) {
        this.CARGO_ID = CARGO_ID;
    }

    public void setCARGO_NOMBRE(String CARGO_NOMBRE) {
        this.CARGO_NOMBRE = CARGO_NOMBRE;
    }

    public void setCARGO_SUELDO_MINIMO(String CARGO_SUELDO_MINIMO) {
        this.CARGO_SUELDO_MINIMO = CARGO_SUELDO_MINIMO;
    }

    public void setCARGO_SUELDO_MAXIMO(String CARGO_SUELDO_MAXIMO) {
        this.CARGO_SUELDO_MAXIMO = CARGO_SUELDO_MAXIMO;
    }
    
}
