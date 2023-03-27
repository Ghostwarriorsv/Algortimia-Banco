/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author juanf
 */
class Ahorro {
    
    //Constante
    public final static double Porcentaje_Interes=0.6;
    
    //Atributos:
    
    private double  saldo;
    private double intereses;
    
    //Consctuctor pasivo 

    public Ahorro() {
    }
    // Consctuctor activo

    public Ahorro(double saldo, double intereses) {
        this.saldo = saldo;
        this.intereses = intereses;
    }
    
    //Get y set

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public double getIntereses() {
        return intereses;
    }

    public void setIntereses(double intereses) {
        this.intereses = intereses;
    }
    
    //to String

    @Override
    public String toString() {
        return "Ahorro{" + "saldo=" + saldo + ", intereses=" + intereses + '}';
    }
    
    //metodo de negocio:
    public void Consignar(double valor){
        this.saldo=this.saldo-valor;
    }
    
    // segundo metodo de negocio
    public double Calcinters(){
     this.intereses= this.saldo*Ahorro.Porcentaje_Interes;   
     return this.intereses;
    }
    // retirar ahorros:
    public double retirar(double valor){
        this.saldo=this.saldo-valor;
        return this.saldo;
    }
    
}
