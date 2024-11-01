/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problema03;

import java.util.Scanner;
import java.util.Locale;

/**
 *
 * @author Usuario iTC
 */
public class Problema03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);
        
        double costo_min;
        double mins_consumidos;
        double total_a_cancelar;
        String nombre_completo;
        String direccion;
        
        System.out.println("Ingrese su Nombre Completo");
        nombre_completo = entrada.nextLine();
        System.out.println("Ingrese su Dirección");
        direccion = entrada.nextLine();
        System.out.println("Ingrese el costo por minuto");
        costo_min = entrada.nextDouble();
        System.out.println("Ingrese los minutos consumidos en el mes");
        mins_consumidos = entrada.nextDouble();
        
        total_a_cancelar = costo_min * mins_consumidos;
                        
        System.out.println("\nReporte:" + "\nNombres completos: " + 
                nombre_completo + "\n\tDirección: " + direccion + 
                "\nCosto por minuto: $"+ costo_min + 
                "\n\tNúmero de minutos consumidos: " + mins_consumidos + 
                "\n\t\tValor a cancelar: $" + total_a_cancelar);
    }
    
}
