/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author juanf
 */
class fecha {
    
    //Atributos:
    private int dia;
    private int mes;
    private int anho;
    
    // consctuctor pasivo

    public fecha() {
    }
    // Consctructor con todo

    public fecha(int dia, int mes, int anho) {
        this.dia = dia;
        this.mes = mes;
        this.anho = anho;
    }
    
    //Get y setter

    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public int getAnho() {
        return anho;
    }

    public void setAnho(int anho) {
        this.anho = anho;
    }
    
    // To String

    @Override
    public String toString() {
        return "fecha{" + "dia=" + dia + ", mes=" + mes + ", anho=" + anho + '}';
    }
    
    
}
