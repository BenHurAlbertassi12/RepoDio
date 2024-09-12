package edu.dio.metodos;

import java.util.Scanner;

public class Emprestimo {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int numParcel = 0;
        double value = 0;
        double taxa2 = 0.3;
        double taxa3 = 0.45;
        double finalEmp = 0;

        System.out.println("Escolha o número de parcelas:");
        numParcel = scan.nextInt();

        System.out.println("Escolha o valor:");
        value = scan.nextInt();

        if (numParcel <= 2) {
            finalEmp = value +(value * taxa2);
            System.out.println("Valor final do empréstimo para 2 parcelas: R$ " + finalEmp);
        } else {
            finalEmp = value +(value * taxa3);
            System.out.println("Valor final do empréstimo para 3 ou mais parcelas: R$ " + finalEmp);

        }
    }
}
