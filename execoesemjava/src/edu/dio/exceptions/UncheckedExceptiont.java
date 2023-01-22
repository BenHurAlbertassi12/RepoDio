package edu.dio.exceptions;

import javax.swing.JOptionPane;

public class UncheckedExceptiont {
    /**
     * @param args
     */
    public static void main(String[] args) {

        boolean loop =  true;

        do {
        String a = JOptionPane.showInputDialog("Numerador: ");
        String b = JOptionPane.showInputDialog("Denominador: ");

        try{
   
            int resultado = dividir(Integer.parseInt(a), Integer.parseInt(b));
            System.out.println("Resultado: " + resultado);
            loop = false;
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null,
            "Entrada inválida, informe um número inteiro! " + e.getMessage());
            loop = false;
        } catch (ArithmeticException e) {
            JOptionPane.showMessageDialog(null,
            "Entrada inválida, informe um número maior que zero! " + e.getMessage());
            loop = false;
        } finally {

            System.out.println("Chegou no finally!");
            
        }
        } while (loop);
        System.out.println("O Código continua...");

    }
    public static int dividir(int a, int b) {
        return a / b; };
}
