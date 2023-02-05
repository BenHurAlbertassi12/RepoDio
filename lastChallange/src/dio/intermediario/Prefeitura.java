package dio.intermediario;

import java.util.Scanner;

public class Prefeitura {
    
    public static void main(String[] args) {
        try (Scanner leitor = new Scanner(System.in)) {
            int vel = leitor.nextInt();
            int multas = leitor.nextInt();
            boolean limVel = vel <= 80;
            if(limVel == false){
              multas++;
            }
            if(multas >= 3){
              System.out.println(multas + " multas. " + "Levou pontos na carteira");
            }else{
              System.out.println(multas + " multas. " + "Nao levou pontos na carteira");
            }
        }

    }
}
