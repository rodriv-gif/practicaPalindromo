/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package recursividad;
import java.util.Scanner;
/**
 *
 * @author ligoh
 */
public class pruebasPalindromo {
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        Palindromo prueba = new Palindromo();
        
        System.out.println("Ingresa una palabra");
        String palabra = entrada.nextLine();
        
        //mandamos a comprobar 
        if (prueba.esPalindromo(palabra)) {
            System.out.println("La palabra " + palabra + " es un palindromo.");
        } else {
            System.out.println("La palabra " + palabra + " no es un palindromo.");
        }
    }
}
