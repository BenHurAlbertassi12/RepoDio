package edu.benhur.exerciciosdefluxo;

import java.util.Scanner;

/*
Faça um programa que leia 5 números
e informe o maior número
e a média desses números.
*/

public class Ex3 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int numero;
        int count = 0;
        int maior = 0;

        int soma = 0;

        do{
        System.out.println("Numero: ");
        numero = scan.nextInt();

        if (numero > maior)
            maior = numero;
        
        count = count + 1;
        
        soma = soma + numero;

    } while (count < 5);
        
    System.out.println("Maior: " + maior);
    System.out.println("Media: " + soma/5);
    System.out.println("Chegamos ao fim");
    }
}