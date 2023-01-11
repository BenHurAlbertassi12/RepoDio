package edu.dio.projetobasico;

import java.util.Scanner;

public class LojinhaDeDoces {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int doce = leitor.nextInt();

        // TODO: Crie a condição necessária para que cada cliente saiba quantos doces
        // vai obter de acordo com a entrada
        int qt_Doces = doce * 2;
        System.out.println("O cliente obteve " + qt_Doces + " doces");

    }
}
