package edu.benhur.lists;

import java.util.*;

class ExemploList {
    public static void main(String[] args) {

        System.out.println("Crie uma lista e adicione as sete notas: ");

        List<Double> notas = new ArrayList<Double>();
        notas.add(7.0);
        notas.add(8.5);
        notas.add(9.3);
        notas.add(5.0);
        notas.add(7.0);
        notas.add(0.0);
        notas.add(3.6);
        System.out.println(notas.toString());

        System.out.println("exiba a posição da nota 5: " + notas.indexOf(5d));

        System.out.println("Adcione a na lista a nota 8.0 na posição 4: ");
        notas.add(4, 8d);
        System.out.println(notas);

        System.out.println("Substituta a nota 5 pela nota 6: ");
        notas.set(3, 6.0);
        System.out.println(notas);

        System.out.println("Confira se a nota 5.0 esta na lista: " + notas.contains(5d));

        System.out.println("Exiba todas as notas na ordem em que foram infomados: ");
        for (Double nota : notas)
            System.out.println(nota);
            
            
        System.out.println("Exiba a terceira nota adcionada: " + notas.get(2));
        System.out.println(notas.toString());
        
        System.out.println("Exiba a menor nota: " + Collections.min(notas));
        
        System.out.println("Exiba a maior nota: " + Collections.max(notas));


    }
}