import java.util.Scanner;

public class desafio1 {
    public static void main(String[] args) throws Exception{
        Scanner in = new Scanner(System.in);
        
        System.out.println("Entre com um número: ");

        if (par(in.nextInt())){
            System.out.println("Par");
            return;
        }

        else
            System.out.println("ímpar");

    }
    static boolean par(int num){
        if (num % 2 == 0)
            return true;
        return false;
    }
}
