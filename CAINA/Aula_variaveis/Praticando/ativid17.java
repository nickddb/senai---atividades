package Praticando;

import java.util.Scanner;

public class ativid17 {
    public static void main(String[] args) {
        double vel_ini, acel, temp, velocidade;
        System.out.println("Digite a velocidade inicial: ");

        Scanner in = new Scanner(System.in); 

        vel_ini = in.nextDouble();

        System.out.println("Digite a aceleração: ");

        acel = in.nextDouble();

        System.out.println("Digite o tempo do percurso (em segundos): ");

        temp = in.nextDouble();
        
        velocidade = vel_ini + acel * temp;
        System.out.printf("A velocidade é igual a %.2f m/s", velocidade);
    }
}