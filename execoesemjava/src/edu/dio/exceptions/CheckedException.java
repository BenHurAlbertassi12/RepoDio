package edu.dio.exceptions;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.OutputStreamWriter;

import javax.swing.JOptionPane;

public class CheckedException {
    public static void main(String[] args) {
        String nomeDoArquivo = "tolkien.txt";
        try {
            imprimirArquivoNoConsole(nomeDoArquivo);
        }catch(FileNotFoundException e){
            JOptionPane.showMessageDialog(
                null, "Revise o nome do arquivo " + e.getCause());
            e.printStackTrace();
        
        } catch (IOException e) {
            JOptionPane.showMessageDialog(
                null, "Erro inesperado, entre em contato com o suporte " + e.getCause());
            e.printStackTrace();
        }
        System.out.println("Com exception ou não, o programa continua...");
    }
    
    private static void imprimirArquivoNoConsole(String nomeDoArquivo) throws IOException {

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
