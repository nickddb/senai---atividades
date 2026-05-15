import java.io.IOException;
import java.util.Scanner;
public class beecrwd {

    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(System.in);
        
        dddzinho(in.nextInt());
    }
        static void dddzinho(int numero){
            switch (numero){
                case 61: 
                    System.out.println("Brasilia"); 
                    return;

                case 71: 
                    System.out.println("Salvador"); 
                    return;
                    
                case 11: 
                    System.out.println("Sao Paulo"); 
                    return;
                    
                case 21: 
                    System.out.println("Rio de Janeiro");
                    return; 
                    
                case 32: 
                    System.out.println("Juiz de Fora"); 
                    return;
                    
                case 19: 
                    System.out.println("Campinas"); 
                    return;
                
                case 27: 
                    System.out.println("Vitoria"); 
                    return;
                    
                case 31: 
                    System.out.println("Belo Horizonte"); 
                    return;
                    
                default:
                    System.out.println("DDD nao cadastrado"); 
                    return;
            }
        }
    }