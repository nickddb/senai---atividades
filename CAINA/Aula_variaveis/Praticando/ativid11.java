package Praticando;

import java.util.Scanner;

public class ativid11 {
    public static void main(String[] args) {
        double temp, faren;
        System.out.println("Digite a temperatura (em celsius): ");

        Scanner in = new Scanner(System.in); 

        temp = in.nextDouble();
        
        faren =  (temp * 1.8) + 32 ;

        System.out.println("A temperatura em farenheit é " + faren + "°F");
    }
}
