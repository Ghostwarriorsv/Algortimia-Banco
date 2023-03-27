/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author juanf
 */
class cuenta {
    
    //Atributos:
    private String Cliente;
    private String Correo;
    private String Cedula;
    private Ahorro ahorro;
    private CDT cdt;
    private Corriente corriente;
    private int MesesSimulacion;
    
    // Constructor activo y pasivo

    public cuenta() {
        this.ahorro=new Ahorro();
        this.corriente=new Corriente();
        this.cdt=new CDT();
                
                
    }

    public cuenta(String Cliente, String Correo, String Cedula, Ahorro ahorro, CDT cdt, Corriente corriente, int MesesSimulacion) {
        this.Cliente = Cliente;
        this.Correo = Correo;
        this.Cedula = Cedula;
        this.ahorro = ahorro;
        this.cdt = cdt;
        this.corriente = corriente;
        this.MesesSimulacion = MesesSimulacion;
    }

   

    // Get y set
    
     public int getMesesSimulacion() {
        return MesesSimulacion;
    }
     
    public void setMesesSimulacion(int MesesSimulacion) {
        this.MesesSimulacion = MesesSimulacion;
    }

    public String getCliente() {
        return Cliente;
    }

    public void setCliente(String Cliente) {
        this.Cliente = Cliente;
    }

    public String getCorreo() {
        return Correo;
    }

    public void setCorreo(String Correo) {
        this.Correo = Correo;
    }

    public String getCedula() {
        return Cedula;
    }

    public void setCedula(String Cedula) {
        this.Cedula = Cedula;
    }

    public Ahorro getAhorro() {
        return ahorro;
    }

    public void setAhorro(Ahorro ahorro) {
        this.ahorro = ahorro;
    }

    public CDT getCdt() {
        return cdt;
    }

    public void setCdt(CDT cdt) {
        this.cdt = cdt;
    }

    public Corriente getCorriente() {
        return corriente;
    }

    public void setCorriente(Corriente corriente) {
        this.corriente = corriente;
    }
    
    // To string

    @Override
    public String toString() {
        return "cuenta{" + "Cliente=" + Cliente + ", Correo=" + Correo + ", \n Cedula=" + Cedula + ",\n ahorro=" + ahorro + ",\n cdt=" + cdt + ", \n corriente=" + corriente + ", \n MesesSimulacion=" + MesesSimulacion + '}';
    }
  
    
    
    
    
    
    
}
