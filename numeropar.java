import java.util.Scanner;

public class numeropar {
    
    public static void main(String[] args){
          int resposta;

         System.out.println("Bem-vindo(a)");
         System.out.println("Digite um numero e daremos o resultado impar ou par:");
         
         Scanner s = new Scanner(System.in);
         resposta = s.nextInt();
         
         if(resposta %2 == 0){
            System.out.println("Par!");
         }
         else{
            System.out.println("Impar!");
         }
         
    }
}
