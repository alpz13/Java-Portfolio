/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algorithms;

/**
 *
 * @author alex
 */

import java.util.*;
public class Algorithms {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Declaramos el tamaño del arreglo.
        int tamano = 10;
        
        //Declaramos el arreglo de caracteres, con un tamaño en especifico.
        char Array[] = new char[tamano];
        
        //llenamos el arreglo con #
        for(int i = 0; i < Array.length ; i ++){
            Array[i] = '#';
        }
        
        //ponemos la posicion cero con *
        Array[0] = '*';
        
        //Declaramos la clase para poder leer el teclado, tenemos que importar la clase
        Scanner in = new Scanner(System.in);
        //leemos el proximo numero entero y lo asignamosd a la variable input;
        int input = in.nextInt();
        
        //iniciamos un cotandor para saber donde se puso el asterisco
        int contador = 0;
        
        //checamos que sea positvo o negativo para saber hacia donde mover.
        if(input < 0){
            //se mueve ala izq
            if(input <= tamano){
                Array[contador]= '#';
                Array[0] = '*';
                contador = 0;
            } else {
               //ciclo para mover el asterisco hacia la izq
            }
        }
        if(input > 0){
            //se mueve a la derecha
            if(input >= tamano){
                Array[contador] = '#';
                Array[Array.length - 1] = '*';
                contador = Array.length;
            }else {
                //Ciclo para mover el asterisco a la derecha.
            }
        }
        
    }
    
}
