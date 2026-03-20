package Praticando;

import java.util.Scanner;

public class ativid19 {
    public static void main(String[] args) {
        double a, b, c, delta, x1, x2;
        System.out.println("Digite a, b e c separados por espaço: ");

        Scanner in = new Scanner(System.in); 

        a = in.nextDouble();
        b = in.nextDouble();
        c = in.nextDouble();

        System.out.printf("%.0fx² + %.0fx + %.0f = 0\n", a, b, c);

        System.out.printf("%.0fx + %.0f = 0\n", a , b);
        
        delta = Math.pow(b,2) -4*a*c;

        x1 = (-b + Math.sqrt(delta))/2*a;
        x2 = (-b - Math.sqrt(delta))/2*a;

        System.out.printf("\nX1 = %.1f\nX2 = %.1f", x1, x2);
        in.close();
    }
}