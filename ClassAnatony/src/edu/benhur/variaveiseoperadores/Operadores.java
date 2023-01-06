package edu.benhur.variaveiseoperadores;

public class Operadores {
    public static void main(String[] args) {
        String nomeCompleto = "Linguagem" + " " + "JAVA";
        System.out.println(nomeCompleto);

        String concatenacao = "?";

        concatenacao = 1 + 1 + 1 + "1";
        System.out.println(concatenacao);

        concatenacao = 1 + "1" + 1 + 1;
        System.out.println(concatenacao);

        concatenacao = 1 + "1" + 1 + "1";
        System.out.println(concatenacao);

        concatenacao = "1" + 1 + 1 + 1;
        System.out.println(concatenacao);

        concatenacao = "1" + (1 + 1 + 1);
        System.out.println(concatenacao);

        int numero = 5;
        System.out.println(-numero);
        System.out.println(numero);

        numero = -numero;
        System.out.println(numero);

        numero = numero * -1;
        System.out.println(numero);

        // repetição
        int numeroRepeticao = 5;

        numeroRepeticao++;
        System.out.println(numeroRepeticao);

        numeroRepeticao--;
        System.out.println(numeroRepeticao);

        //boolean
        boolean variavel = true;
        System.out.println(!variavel);

        variavel = !variavel;
        System.out.println(!variavel);

        //ternario

        int a, b;
        a = 5;
        b = 6;

        String resultado = "";
        if (a == b)
            resultado = "Verdadeiro";
        else
            resultado = "Falso";

        System.out.println(resultado);
        
        int c, d;
        c = 5;
        d = 6;
        
        int resultado2 = c == d ? 1 : 0;
        System.out.println(resultado2);
    }

}
