package Praticando;
import java.util.Scanner;

public class ex5_lista3{
    public static void main(String[] args) throws Exception{
        Scanner in = new Scanner(System.in);

        double n1 = in.nextDouble();
        double n2 = in.nextDouble();

        double media = n1 + n2/ 2;

        if (media >= 50){
            System.out.println("APROVADO!");
        }
        else{
            System.out.println("REPROVADO! Entre com a nota da recuperação");
            double n3 = in.nextDouble();
            double new_media = n1 + n2 + n3 / 3;
            if(new_media < 50)
                System.out.println("REPROVADO!");
            else
                System.out.println("APROVADO!");

            in.close();
        }
    }
}
