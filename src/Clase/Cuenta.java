/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clase;

/**
 *
 * @author felipe
 */
public class Cuenta {
    private String numCuenta;
    private String titular;
    private double saldo;
    private double interes;
    

    public Cuenta() {
    }

    public Cuenta(String numCuenta, String titular, double saldo, double interes) {
        this.numCuenta = numCuenta;
        this.titular = titular;
        this.saldo = saldo;
        this.interes = interes;
    }

    public String getNumCuenta() {
        return numCuenta;
    }

    public void setNumCuenta(String numCuenta) {
        this.numCuenta = numCuenta;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public double getInteres() {
        return interes;
    }

    public void setInteres(double interes) {
        this.interes = interes;
    }

    public String mostrarDatos(){
        return "Num Cuenta:\t"+this.numCuenta+"\nTitular:\t"+this.titular+"\nSaldo:\t\t$"
                +this.saldo+"\ntasa interes:\t"+this.interes+" %";
    }
    
    public void deposito(double dep){
        this.saldo = this.saldo + dep;
    }
    
    public void giro(double gir){
        this.saldo = this.saldo - gir;
    }
    
    public void estado(){
        if (this.saldo<0) {
            System.out.println("Su Cuenta esta en rojo\n"
                    + "Saldo = $"+this.saldo);
        }else{
            System.out.println("Su Cuenta esta en azul\n"
                    + "Saldo = $"+this.saldo);
        }
           
    }
    
    public void intGanado(){
        double inter = (this.saldo * this.interes)/100;
        double inGan = inter + this.saldo;
        System.out.println("El Interes Ganado es de $ "+inGan);
        
    }
    
    public void saldoUSD(){
        double usd = this.saldo / 677 ;
        System.out.println("Su Saldo en USD$ "+usd);
    }
    
   
}
