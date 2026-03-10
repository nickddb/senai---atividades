package Praticando;
import java.util.Scanner;

public class ex1_lista3{
    public static void main(String[] args) throws Exception{
        Scanner in = new Scanner(System.in);

        double num = in.nextDouble();

        if (num > 0){
            System.out.println("A raiz quadrada de " + num + " é " + Math.sqrt(num));
        }
        else{
            System.out.println("Valor inválido!");
        }
    }
}
