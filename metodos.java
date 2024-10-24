
import java.util.Scanner;

public class metodos {


    public static boolean isPar(int numero) {
        return numero % 2 == 0;  
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        while (true) {
            System.out.print("Digite um número inpa 1 ou par 2 para sair): ");
            int numero = scanner.nextInt();  
            
       
            if (numero == 0) {
                System.out.println("Programa encerrado.");
                break;
            }
            

            boolean resultado = isPar(numero);  
            
            if (resultado) {
                System.out.println("número par");
            } else {
                System.out.println("número ímpar");
            }
        }
        
        scanner.close();
    }
}
