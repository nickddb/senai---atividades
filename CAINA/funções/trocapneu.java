public class trocapneu{
    public static void main(String[] args) throws Exception{
        System.out.println("Pegar o macaco");
        System.out.println("Posicionar o macaco");
        System.out.println("Pegar a chave de roda");
        retirarParafuso(1);
        retirarParafuso(2);
        retirarParafuso(3);
        retirarParafuso(4);
        System.out.println("Levantar o carro");

        for(int i=1; i<=4; i++){
            retirarParafuso(i);
        }
    }

    static void retirarParafuso(int numParafuso){
        System.out.println("Posicionar a chave" + numParafuso);
        System.out.println("Rotacioná-la sentido anti-horário");
        System.out.println("Retirar chave");
    }
}