package edu.benhur.exerciciosdefluxo;

import java.util.Scanner;

public class Ex4 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int quantidadeNumeros = 0;
        int numero = 0;

        int quantPares = 0;
        int quantImpares = 0;

        System.out.println("Quantos numeros você deseja? ");
        quantidadeNumeros = scan.nextInt();

        int count = 0;
        do{
            System.out.println("Numero: ");
            numero = scan.nextInt();

            if(numero % 2 == 0)
                quantPares++;
            else
                quantImpares++;

            count = count + 1;
        } while (count < quantidadeNumeros);
        
        System.out.println("Quantidade de Pares" + quantPares);
        System.out.println("Quantidade de Impaares" + quantImpares);


    }
}