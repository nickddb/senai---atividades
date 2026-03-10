package Praticando;
import java.util.Scanner;

public class ex15_lista3{
    public static void main(String[] args) throws Exception{
        Scanner in = new Scanner(System.in);

        double n1 = in.nextDouble();
        double n2 = in.nextDouble();

        double media = n1 + n2/ 2;

        if (media > 50){
            System.out.println("APROVADO!");
        }
        else{
            System.out.println("REPROVADO!");
        }
    }
}
