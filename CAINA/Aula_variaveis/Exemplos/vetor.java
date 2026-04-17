package Exemplos;

class vetor {
    public static void main(String[] args) throws Exception {
        int [] numbers = {1,2,3,5,7,13}; // com inicialização, armazena quantidade limitada (6 valores)

        for(int i=0; i<numbers.length; i++){
            System.out.print(numbers[i]);
        }
        System.out.println();
        
        System.out.println(numbers.length);



        int [] numbers2 = new int[10]; // sem inicialização, armazena até 10 valores!

        for(int num:numbers2){
            System.out.print(num + " ");
        }

        System.out.println(numbers2.length);

        for(int i=numbers.length-1; i>=0; i--){
            System.out.print(numbers[i] + " ");
        }
    }
}
