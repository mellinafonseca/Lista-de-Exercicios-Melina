import java.util.Scanner;

public class exetres {
public static void main(String[] args){
    Scanner dados = new Scanner(System.in);
       System.out.println("Digite um numero  N ");
       int N = dados.nextInt();
        int aux = 0;
        for(int i=0; i<N; i++){
            if (i % 2 == 0){
                aux = aux + i;
            }
        }
        System.out.printf("A soma dos pares: %d", aux);
        dados.close();
}
}