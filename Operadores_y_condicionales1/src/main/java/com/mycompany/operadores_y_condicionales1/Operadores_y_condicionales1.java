/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.operadores_y_condicionales1;

/**
 *
 * @author betit
 */
public class Operadores_y_condicionales1 {

    public static void main(String[] args) {
//valor del dolar actual
        double VUSD = 18.37;
//Valor del iva
        double iva = 0.16;
//Valor de dolar a convertir
        int USD = 2;
//Operacion de dolar a pesos
        double USDMXN = VUSD * USD;
//Operacion al aplicar iva
        double ivapli = iva * USDMXN;
//Imprime cuanto vale el dolar a pesos
        System.out.println("$1 Dolar equivale a: $" + VUSD + " pesos");
//Indica cuantos dolares hay y los convierte a pesos
        System.out.println("Se registro $ " + USD + " dolares que equivale a: $ " + USDMXN + " pesos");
//Si el valor de pesos es mayor a 2000 se aplicara el iva del 16%
        if (USDMXN > 2000.00){
//Imprime el valor total con el iva aplicado
            System.out.println("Se aplicó un impuesto del 16% el valor total es: $ " + (ivapli + USDMXN) + " pesos");
        }
    }
}
