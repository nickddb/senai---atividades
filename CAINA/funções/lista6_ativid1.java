import java.util.Scanner;

public class lista6_ativid1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        System.out.print("Entre com um número N: ");
        int num = in.nextInt();

        int resultado = somar(num);

        System.out.println("Soma de 1 até " + num + ": " + resultado);
        
    }

    public static int somar(int n) {
        int somando = 0;

        for (int i = 1; i <= n; i++) {
            somando += i; 
        }
        return somando; 
    }
}