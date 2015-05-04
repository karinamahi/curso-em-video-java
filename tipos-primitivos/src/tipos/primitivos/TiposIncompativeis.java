/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tipos.primitivos;

/**
 *
 * @author Karina
 */
public class TiposIncompativeis {
    public static void main(String[] args) {
        //Inteiro para String
        int idade = 30;
        String valor = Integer.toString(idade);
        System.out.println(valor);
        
        //String para Inteiro
        String valor2 = "15";
        int idade2 = Integer.parseInt(valor2);
        System.out.println(idade2);
        
        // String para Float
        String valor3 = "70.6";
        float idade3 = Float.parseFloat(valor3);
        System.out.println(idade3);
        
    }
    
}


