package com.generarenteros.company;

import java.util.Scanner;

//Todo: Verificar la calculadora del IMC

/*
Peso          120 kg     = 120 kg = 44
Estatura²  1.65 x 1.65   2.7225
*/
public class Main {

    public static void main(String[] args) {
        // write your code here

        int peso = 0;
        double estatura = 0.0;
        double resultado;
        Scanner entrada = new Scanner(System.in);

        System.out.println("Ingresa tu Peso :\n");
        peso = entrada.nextInt();

        System.out.println("Ingresa tu Estatura :\n");
        estatura = entrada.nextDouble();

        double promedioEstatura = estatura * estatura;
        double promedioPeso = peso;

        resultado = promedioPeso / promedioEstatura;

        System.out.println("Este es el total : " + resultado);
    }
}
