/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio1;

import java.util.Scanner;
import Clase.Cuenta;

/**
 *
 * @author felipe
 */
public class Ejercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        Cuenta cuenta = new Cuenta();
        System.out.println("Ingrese numero de Cuenta:");
        cuenta.setNumCuenta(entrada.nextLine());
        System.out.println("Ingrese Titular de la Cuenta:");
        cuenta.setTitular(entrada.nextLine());
        System.out.println("Ingrese Saldo:");
        cuenta.setSaldo(entrada.nextDouble());
        entrada.skip("\n");
        System.out.println("Interes Anual:");
        cuenta.setInteres(entrada.nextDouble());
        System.out.println(cuenta.mostrarDatos());
        System.out.println("Cuenta Creada con Exito");
        System.out.println(".:: Realizar Depósito ::.\n"
                + "Ingrese monto a depositar");
        cuenta.deposito(entrada.nextDouble());
        System.out.println("Su Nuevo saldo es de $"+cuenta.getSaldo());
        System.out.println(".:: Realizar Giro ::.\n"
                + "Ingrese monto a girar");
        cuenta.giro(entrada.nextDouble());
        System.out.println("Su Nuevo saldo es de $"+cuenta.getSaldo());
        System.out.println("Consultando estado de cuenta...");
        cuenta.estado();
        System.out.println("Calculo del Interes Ganado...");
        cuenta.intGanado();
        System.out.println("Conversion del Saldo a USD...");
        cuenta.saldoUSD();
        System.out.println("Gracias!!");
        
    }
    
}
