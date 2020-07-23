import java.util.Scanner;
public class exedois{
    public static void main (String[] args){

        Scanner dados = new Scanner(System.in);
        System.out.println("Digite um numero ");
        int fat = dados.nextInt();

        //int fat = 1;
        for(int i=1; i<fat; i++){
            fat =  fat * i;
            System.out.println("Fatorial de " + i + " ! = " + fat);
        }
    }
}