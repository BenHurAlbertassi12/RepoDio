package edu.benhur.metodos;

public class Usuario {
    public static void main(String[] args) throws Exception {
        SmartTV smartTv = new SmartTV();

        System.out.println("Tv Ligada = " +smartTv.ligado);
        System.out.println("Canal Atual: " +smartTv.canal);
        System.out.println("Volume Atual: " + smartTv.volume);
        
        smartTv.ligar();
        System.out.println("Novo Status => Tv Ligada = " + smartTv.ligado);
        
        smartTv.desligar();
        System.out.println("Novo Status => Tv Ligada = " + smartTv.ligado);
        
        smartTv.aumentarVolume();
        System.out.println("Novo Status => Volume Atual: = " + smartTv.volume);
        
        smartTv.reduzirVolume();
        System.out.println("Novo Status => Volume Atual: = " + smartTv.volume);
        
        smartTv.mudarCanal(13);
        System.out.println("Novo Status => Volume Atual: = " + smartTv.canal);
    }
}
