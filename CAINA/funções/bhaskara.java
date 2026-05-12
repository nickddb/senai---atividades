import java.util.Scanner;

public class bhaskara {
    public static void main(String[] args) throws Exception{
        double a,b,c,delta,x1,x2;
        
        Scanner in = new Scanner(System.in);

        System.out.println("Forneça os valores a, b e c separados por espaço");
        a = in.nextDouble();
        b = in.nextDouble();
        c = in.nextDouble();

        delta = calcularDelta(a,b,c);

        if(delta<0){
            System.out.println("A equação NÃO possui raíz");
            return;
        }
        x1 = (-b + Math.sqrt(delta))/(2*a);
        x2 = (-b - Math.sqrt(delta))/(2*a);

        System.out.printf("As raízes de %.1fx² + %.1fx + %.1f = 0 são:", a, b, c);
        System.out.printf("x1 = %.1f e x2 = %.1f\n", x1, x2);
    }

    static double calcularDelta(double a, double b, double c){
        return Math.pow(b,2)-4*a*c;
    }
}
