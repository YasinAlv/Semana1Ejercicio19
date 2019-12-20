/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicios19;

import java.util.Scanner;

/**
 *
 * @author Laboratorio
 */
public class Ejercicios19 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner Teclado = new Scanner(System.in);
        int Num;

        System.out.println("Digite un número: ");
        Num = Teclado.nextInt();
        
        int Cantidad = Integer.toString(Num).length();
        System.out.println("La Cantidad de digitos es de: "+Cantidad);
    }
    
}
