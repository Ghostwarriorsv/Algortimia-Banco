/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author juanf
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Banco miBanco=new Banco();
        
        miBanco.setNombre("Bancocomunal");
        miBanco.setCorreo("Comunalbanc@gmail.com");
        miBanco.setNit("76399176");
        System.out.println("Datos del banco: "+miBanco.toString());
        
        // Creacion de cuenta:
        Ahorro ahorro1=new Ahorro(0,0);
        Corriente corriente1=new Corriente(0);
        CDT cdt1=new CDT(10000, new fecha(15,07,2021), 0, 12);
        // crear cuenta:
        cuenta miCuenta=new cuenta("Marco Antonio Valero", "Marcvalero75@gmail.com", "178922894", ahorro1, cdt1, corriente1, 0);
        // Asociacion con el ente bancario:
        
        miBanco.setPrimera(miCuenta);
        
        System.out.println("Datos de su cuenta: "+miBanco.toString());
        
        // Invertir en ahorro
        System.out.println("su saldo incial fue de : "+ahorro1);
        ahorro1.Consignar(50000);
        System.out.println("Usted a consginado a su cuenta de ahorro alrededor de : "+ahorro1);
        //intereses
        System.out.println("los intereses de su cuenta de ahorro es de: "+ahorro1.Calcinters());
        //retiro
       
        System.out.println("Usted ha retirado alrededor de: "+ahorro1.retirar(10000));
        System.out.println("Su cuenta de ahorro actual es de: "+ahorro1.toString());
        
        //Apertura del CDT
        
        System.out.println("Abrir CDT");
        
        CDT miCDT=new CDT();
        miCDT.abrirCDT(new fecha(22,03,2023), 550000);
        System.out.println("Su valor de sus CDT es de: "+miCDT.toString());
        
       
    }
    
}
