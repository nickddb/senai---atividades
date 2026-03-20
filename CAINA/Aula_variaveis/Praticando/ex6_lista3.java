package Praticando;
import java.util.Scanner;

public class ex6_lista3{
    public static void main(String[] args) throws Exception{
        Scanner in = new Scanner(System.in);

        double n1 = in.nextDouble();
        double n2 = in.nextDouble();

        double media = n1 + n2/ 2;

        if (media >= 8.5){
            System.out.println("Conceito A");
        }
        else if (media < 8.5 && media >= 7){
            System.out.println("Conceito B");
        }
        else if(media < 7 && media >= 5){
            System.out.println("Conceito C");
        }
        else if(media < 5){
            System.out.println("Conceito D");
        }
    }
}
