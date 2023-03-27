/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author juanf
 */
class CDT {
    
    //constante:
    public final static double tasas_CDT=0.01;
    
    //Atributos:
    
    private double valordeapertura;
    private fecha fechadeapertura;
    private double valorliquidacion;
    private int meses;
    
    // Consctuctor activo y pasivo

    public CDT() {
        this.fechadeapertura= new fecha();
       
    }

    public CDT(double valordeapertura, fecha fechadeapertura, double valorliquidacion, int meses) {
        this.valordeapertura = valordeapertura;
        this.fechadeapertura = fechadeapertura;
        this.valorliquidacion = valorliquidacion;
        this.meses = meses;
    }
    
    // Get y set:

    public double getValordeapertura() {
        return valordeapertura;
    }

    public void setValordeapertura(double valordeapertura) {
        this.valordeapertura = valordeapertura;
    }

    public fecha getFechadeapertura() {
        return fechadeapertura;
    }

    public void setFechadeapertura(fecha fechadeapertura) {
        this.fechadeapertura = fechadeapertura;
    }

    public double getValorliquidacion() {
        return valorliquidacion;
    }

    public void setValorliquidacion(double valorliquidacion) {
        this.valorliquidacion = valorliquidacion;
    }

    public int getMeses() {
        return meses;
    }

    public void setMeses(int meses) {
        this.meses = meses;
    }
    
    // To string

    @Override
    public String toString() {
        return "CDT{" + "valordeapertura=" + valordeapertura + ", fechadeapertura=" + fechadeapertura + ", valorliquidacion=" + valorliquidacion + ", meses=" + meses + '}';
    }
    
    //Abrir CDT
    public void abrirCDT(fecha apertura,double valor ){
        this.fechadeapertura=apertura;
        this.valordeapertura=valor;
        
        //Liquidacion CDT
  
        public void liquidacionCDT(double valor,int meses,double intereses){
            
          intereses=meses*CDT.tasas_CDT*valor;
          this.valorliquidacion=intereses+valor;
      }
            
        
    
}
