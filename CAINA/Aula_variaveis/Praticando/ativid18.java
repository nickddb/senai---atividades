package Praticando;

import java.util.Scanner;

public class ativid18 {
    public static void main(String[] args) {
        double a, b, x;
        System.out.println("Digite o valor para a variável A: ");

        Scanner in = new Scanner(System.in); 

        a = in.nextDouble();

        System.out.println("Digite o valor para a variável B: ");

        b = in.nextDouble();
        
        x = -b/a;

        System.out.printf("%.0fx + %.0f = 0\n", a , b);
        System.out.printf("X = %.2f",x);
        in.close();
    }
}