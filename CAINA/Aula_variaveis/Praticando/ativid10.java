package Praticando;

import java.util.Scanner;

public class ativid10 {
    public static void main(String[] args) {
        double km, milha;
        System.out.println("Digite o valor de milhas: ");

        Scanner in = new Scanner(System.in); 

        milha = in.nextDouble();
        
        km =  milha / 0.6214 ;

        System.out.println("O valor em quilômetros é igual a " + km);
    }
}
