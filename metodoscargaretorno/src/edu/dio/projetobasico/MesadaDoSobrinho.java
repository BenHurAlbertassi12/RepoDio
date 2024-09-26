package edu.dio.projetobasico;

import java.util.Scanner;

public class MesadaDoSobrinho {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int tamanho = leitor.nextInt();

        String countBarra = "";
        for (int i = 0; i < tamanho; i++) {
            countBarra = countBarra + "/";
        }
        System.out.println(countBarra);
    }
}
