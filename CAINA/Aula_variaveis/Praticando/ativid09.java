package Praticando;

import java.util.Scanner;

public class ativid09 {
    public static void main(String[] args) {
        double km, milha;
        System.out.println("Digite o valor de km/h: ");

        Scanner in = new Scanner(System.in); 

        km = in.nextDouble();
        
        milha =  km * 0.6214 ;

        System.out.println("O valor em milhas é igual a " + milha);
    }
}
