import java.util.Scanner;

public class desafio2 {
    public static void main(String[] args) throws Exception{
        Scanner in = new Scanner(System.in);

        int num;
        System.out.println("Entre com um número: ");
        num = in.nextInt();

        System.out.println(num + "!= " + fatorial(num ));
        in.close();

    }

    static int fatorial(int num_fatorial){

        if(num_fatorial == 1)
            return 1;
        return num_fatorial * fatorial(num_fatorial-1);
        //int fatorial = 1;
        //while(num_fatorial > 1){
        //    fatorial *= num_fatorial;
        //    num_fatorial--;
        //}
        //return fatorial;
    }
}
