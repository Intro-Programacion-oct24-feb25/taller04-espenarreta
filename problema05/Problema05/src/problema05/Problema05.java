/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problema05;

import java.util.Scanner;
import java.util.Locale;

/**
 *
 * @author Usuario iTC
 */
public class Problema05 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);
        
        double netflix;
        double youtube;
        double dropbox;
        double spotify;
        double total_mensual;
        double descuento_netflix;
        double descuento_youtube;
        double descuento_dropbox;
        
        System.out.println("Ingrese el valor a pagar de Netflix");
        netflix = entrada.nextDouble();
        System.out.println("Ingrese el valor a pagar de Youtube Premiun");
        youtube = entrada.nextDouble();
        System.out.println("Ingrese el valor a pagar de Dropbox");
        dropbox = entrada.nextDouble();
        System.out.println("Ingrese el valor a pagar de Spotify");
        spotify = entrada.nextDouble();
        
        descuento_netflix = netflix * 0.77;                
        descuento_youtube = youtube * 0.77;
        descuento_dropbox = dropbox * 0.55;
        
        total_mensual = descuento_netflix + descuento_youtube + 
                descuento_dropbox + spotify;
        
        System.out.println("\nReporte:" + "\nValores iniciales:" + 
                "\nNetflix: $" + netflix + "\t\tDescuento: $" + descuento_netflix
                +"\nYoutube Premiun: $" + youtube + "\tDescuento: $" + 
                descuento_youtube + "\nDropbox: $" + dropbox + "\t\tDescuento: $"
                + descuento_dropbox + "\nSpotify: $" + spotify + 
                "\n\nEl total mensual a pagar es: $" + total_mensual);
    }
    
}
