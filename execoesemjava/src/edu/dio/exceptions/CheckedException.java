package edu.dio.exceptions;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.OutputStreamWriter;

public class CheckedException {
    public static void main(String[] args) {
        String nomeDoArquivo = "tolkien";
        imprimirArquivoNoConsole(nomeDoArquivo);
        System.out.println("Com exception ou não, o programa continua...");
    }
    
    private static void imprimirArquivoNoConsole(String nomeDoArquivo) {

        File file = new File(nomeDoArquivo);

        BufferedReader br = new BufferedReader(new FileReader(file.getName()));
        String line = br.readLine();

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        do {
            bw.write(line);
            bw.newLine();
            line=br.readLine();
        } while (line != null);
        bw.flush();
        br.close();
    }
}
