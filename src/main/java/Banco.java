/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author juanf
 */
public class Banco {
    
    //Atributos:
    
    private String Nombre;
    private String Correo;
    private String Nit;
    private cuenta primera;
    private cuenta segunda;
    
    // Constructor activo y pasivo

    public Banco() {
        this.primera= new cuenta();
        this.segunda= new cuenta();
    }

    public Banco(String Nombre, String Correo, String Nit, cuenta primera) {
        this.Nombre = Nombre;
        this.Correo = Correo;
        this.Nit = Nit;
        this.primera = primera;
    }
    
    // Get y set

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getCorreo() {
        return Correo;
    }

    public void setCorreo(String Correo) {
        this.Correo = Correo;
    }

    public String getNit() {
        return Nit;
    }

    public void setNit(String Nit) {
        this.Nit = Nit;
    }

    public cuenta getPrimera() {
        return primera;
    }

    public void setPrimera(cuenta primera) {
        this.primera = primera;
    }
    
    // To string

    @Override
    public String toString() {
        return "Banco{" + "Nombre=" + Nombre + ", Correo=" + Correo + ", Nit=" + Nit + ", primera=" + primera + '}';
    }

   
    
   
}
