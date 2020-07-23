public class execinco {
    public static void main(String[] args){
       int aux = 0;
        for(int i=0; i< 10; i++){
            if (i % 3 == 0 || i % 5 == 0){
                System.out.printf("%d \n", i);
                  aux = aux +i;
            }
            
        }
        System.out.printf("A soma dos numeros divisiveis por 3 e 5 ate 1000: %d", aux);
    }

}