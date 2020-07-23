import java.util.Scanner;
public class exequatro {
    public static void main(String[] args){
        Scanner mdc = new Scanner(System.in);
        System.out.println("INFORME UM NUMERO");
        int n1 = mdc.nextInt();

        System.out.println("INFORME OUTRO NUMERO");
        int n2 = mdc.nextInt();
        int i;
        int aux = 1;

        if (n1 > n2){
            for ( i=1; i< n1; i++){
            if(n1 % i ==0 && n2 % i ==0){
                aux = aux * i;
            }
            
        }System.out.printf("Maximo divisor comum: %d", aux);

     } else if (n2 > n1){
            for ( i=1; i< n2; i++){
                if(n1 % i ==0 && n2 % i ==0){
                    aux = aux * i;
                }
                
            }System.out.printf("Maximo divisor comum: %d", aux);
        }
        else {
            for ( i=1; i< n1; i++){
                if(n1 % i ==0 && n2 % i ==0){
                    aux = aux * i;
        }
        
        }System.out.printf("Maximo divisor comum: %d", aux);

    


        }
    }
}