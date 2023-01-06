package edu.benhur.variaveiseoperadores;

public class TiposVariaveis {
public static void main(String[] args) {
        
    double salarioMinimo = 2500;
    System.out.println(salarioMinimo);

    short numeroCurto = 1;
    int numeroNormal = numeroCurto;

    short numeroCurto2 = (short) numeroNormal;
    System.out.println(numeroCurto2);

    int numero = 5;

    numero = 10;

    System.out.print(numero);


}
}