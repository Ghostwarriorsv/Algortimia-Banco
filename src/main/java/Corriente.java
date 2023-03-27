/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author juanf
 */
class Corriente {
    
    //Atributos:
    
    private double saldo;
    
    // consctuctor pasivo y activo

    public Corriente() {
    }

    public Corriente(double saldo) {
        this.saldo = saldo;
    }
    
    // get y set

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    
    //To string

    @Override
    public String toString() {
        return "Corriente{" + "saldo=" + saldo + '}';
    }
    
}
