package Praticando;
import java.util.Scanner;

public class ex11_lista3{
    public static void main(String[] args) throws Exception{
        Scanner in = new Scanner(System.in);
        System.out.println("Digite 3 valores seprados por espaço: ");

        double result;
        
        double n1 = in.nextDouble();
        double n2 = in.nextDouble();

        System.out.println("Escolha uma opção:");
        System.out.println("1- Soma \n2- Subtração \n3- Multiplicação \n4- Divisão");

        int option = in.nextInt();
        in.close();

        switch (option) {
            case 1: result = n1 + n2;
                System.out.println(n1 + " + " + n2 + " = " + result);
                break;
        
            case 2: result = n1 - n2;
                System.out.println(n1 + " - " + n2 + " = " + result);
                break;
            
            case 3: result = n1 * n2;
                System.out.println(n1 + " * " + n2 + " = " + result);
                break;

            case 4: if(n2==0)
                System.out.println("Erro de divisão por 0");
                else{
                    result = n1 / n2;
                    System.out.println(n1 + " / " + n2 + " = " + result);
                }
                break;
            default:
                System.out.println("Opção inválida");
        }
    }
}