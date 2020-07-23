import java.util.Scanner;
class exeum{
    public static void main(String[]args){
        
        int res=1;
        Scanner dados = new Scanner(System.in);
        System.out.println("Digite um numero  x ");
        int x = dados.nextInt();
        System.out.println("Digite um numero  n ");
        int n = dados.nextInt();
        
        for(int i=0; i<n; i++){
        
            res = x * res;
    

        }

        System.out.printf("%d" , res);

    }
    }


