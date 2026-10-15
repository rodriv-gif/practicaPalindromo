/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package recursividad;

/**
 *
 * @author ligoh
 */
public class Palindromo {
    //este es el metodo publico que recibe la palabra
    public boolean esPalindromo(String palabra){
        
        // Validar si la cadena es nula o está vacía
        if (palabra == null || palabra.trim().isEmpty()) {
            return false;
        }

        // Convertir todas las letras a minúsculas
        palabra = palabra.toLowerCase();

        // Eliminar los espacios de la frase
        palabra = palabra.replace(" ", "");

        return comprobar(palabra, 0, palabra.length() - 1);
    }
    
    //este es el metodo privado donde se compara la palabra y determinar si es un palindromo
    private boolean comprobar(String palabra, int inicio, int fin){
        
        
        //1. caso base donde verificamos Si los índices se cruzan o llegan al centro y posteriormente returnar true
        if(inicio >= fin){
            return true;
        }
         //2. caso base donde verifica si las letras no coinciden y returna false
        if(palabra.charAt(inicio) != palabra.charAt(fin)){   //charAt se usa para obtener los caracteres para posteriormente verificar si son diferentes
            return false;
        }
        
        // Llamada recursiva: que avanza hacia el centro
        return comprobar(palabra, inicio + 1, fin - 1);
    }
}
