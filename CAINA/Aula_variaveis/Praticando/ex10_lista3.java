package Praticando;
import java.util.Scanner;

public class ex10_lista3{
    public static void main(String[] args) throws Exception{
        Scanner in = new Scanner(System.in);
        System.out.println("Digite 3 valores seprados por espaço: ");

        double a = in.nextDouble();
        double b = in.nextDouble();
        double c = in.nextDouble();

        if (a<(b+c) && a>Math.abs(b-c) && b<(a+c) && b>Math.abs(a-c) && c<(a+b) && c>Math.abs(a-b)){
            if(a == b && b==c){
                System.out.println("Equilátero");
            }
            else if(a==b || a==c || b==c){
                System.out.println("Isóceles");
            }
            else{
                System.out.println("Escaleno");
            }
        }
        else{
            System.out.println("Os valores não formam um triângulo");
        }
        in.close();
    }
}
