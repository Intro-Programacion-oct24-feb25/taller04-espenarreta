/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problema01;

import java.util.Scanner;

/**
 *
 * @author Usuario iTC
 */
public class Problema01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        
        int base;
        int altura;
        int area;
        
        System.out.println("Ingrese la base del triángulo en cm");
        base = entrada.nextInt();
        System.out.println("Ingrese la altura del triángulo en cm");
        altura = entrada.nextInt();
        
        area = (base * altura)/2;
        System.out.println("\nEl area del triangulo es: " + area);
    }
    
}
