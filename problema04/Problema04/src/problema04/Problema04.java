/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problema04;

import java.util.Scanner;
import java.util.Locale;

/**
 *
 * @author Usuario iTC
 */
public class Problema04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);
        
        String nombre_completo;
        double cpu;
        double teclado;
        double raton;
        double pantalla;
        double total_a_cancelar;
        
        System.out.println("Ingrese su Nombre completo");
        nombre_completo = entrada.nextLine();
        System.out.println("Ingrese el costo del CPU");
        cpu = entrada.nextDouble();
        System.out.println("Ingrese el costo del Teclado");
        teclado = entrada.nextDouble();
        System.out.println("Ingrese el costo del Ratón");
        raton = entrada.nextDouble();
        System.out.println("Ingrese el costo de al Pantalla");
        pantalla = entrada.nextDouble();
        
        total_a_cancelar = cpu + teclado + raton + pantalla;
        
        System.out.println("\nReporte:" + "\nNombres del cliente: " + 
                nombre_completo + "\nValores iniciales:" + "\nCPU: $" + cpu +
                "\nTeclado: $" + teclado + "\nRatón: $" + raton +
                "\nPantalla: $" + pantalla + "\n\nValor a cancaelar: $" + 
                total_a_cancelar);
        
    }
    
}
