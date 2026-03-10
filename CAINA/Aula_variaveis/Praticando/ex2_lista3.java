package Praticando;
import java.util.Scanner;

public class ex2_lista3{
    public static void main(String[] args) throws Exception{
        Scanner in = new Scanner(System.in);

        int num = in.nextInt();
        int num2 = in.nextInt();

        if (num > num2){
            System.out.println(num + " é maior que o número "+ num2);
        }
        else if(num2 > num){
            System.out.println(num2 + " é maior que o número "+ num);
        }
        else{
            System.out.println("Ambos os números são iguais");
        }
    }
}
