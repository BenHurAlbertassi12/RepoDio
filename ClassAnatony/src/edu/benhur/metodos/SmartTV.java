package edu.benhur.metodos;

public class SmartTV {
    boolean ligado = false;
    int canal = 1;
    int volume = 25;

    public void ligar() {
        ligado = true;
    }

    public void desligar() {
        ligado = true;
    }

    public void aumentarVolume() {
        volume++;
    }

    public void reduzirVolume() {
        volume--;
    }
    
    public void subirCanal() {
        canal++;
    }

    public void diminuirCanal() {
        canal--;
    }
    public void mudarCanal(int novoCanal) {
        canal = novoCanal;
    }

}
