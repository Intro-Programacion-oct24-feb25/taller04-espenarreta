/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problema02;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author Usuario iTC
 */
public class Problema02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);
        
        double gasto1;
        double gasto2;
        double gasto3;
        double gastoTotal;
        String hijo1;
        String hijo2;
        String hijo3;
        
        System.out.println("Ingrese el nombre del primer hijo");
        hijo1 = entrada.nextLine();
        System.out.println("Ingrese el gasto del primer hijo");
        gasto1 = entrada.nextDouble();
        System.out.println("Ingrese el nombre del segundo hijo");
        entrada.nextLine();
        hijo2 = entrada.nextLine();
        System.out.println("Ingrese el gasto del segundo hijo");
        gasto2 = entrada.nextDouble();
        System.out.println("Ingrese el nombre del tercer hijo");
        entrada.nextLine();
        hijo3 = entrada.nextLine();
        System.out.println("Ingrese el gasto del tercer hijo");
        gasto3 = entrada.nextDouble();
                               
        gastoTotal = gasto1 + gasto2 + gasto3;
        
        System.out.println("---------------------");
        System.out.println(hijo1 + ": $" + gasto1);
        System.out.println(hijo2 + ": $" + gasto2);
        System.out.println(hijo3 + ": $" + gasto3);
        System.out.println("---------------------");
        
        System.out.println("El gasto total es: $" + gastoTotal);
    }
    
}
