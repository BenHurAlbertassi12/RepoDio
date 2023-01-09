package edu.dio.metodos;

import java.util.Scanner;

public class Calculate {
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int number1;
        int number2;
        String operator = "";

        System.out.println("Escolha o primeiro número: ");
        number1 = scan.nextInt();

        System.out.print("Escolha o operador: ");
        operator = scan.next();

        System.out.println("Escolha o segundo número: ");
        number2 = scan.nextInt();

        if (operator.equals("+")) {
            System.out.println("O Resultado da operação é: " + (number1 + number2));
        }

        if (operator.equals("-")) {
            System.out.println("O Resultado da operação é: " + (number1 - number2));
        }

        if (operator.equals("/")) {
            System.out.println("O Resultado da operação é: " + (number1 / number2));
        }

        if (operator.equals("*")) {
            System.out.println("O Resultado da operação é: " + (number1 * number2));
        }

    }

}
