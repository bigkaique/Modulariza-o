import java.util.Scanner;

public class metadoFatorial {

    
    public static int calcularFatorial(int numero) {
        int fatorial = 1;  
        for (int i = 1; i <= numero; i++) {
            fatorial *= i;  
        }
        return fatorial; 
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
      
        System.out.print("Digite um número para calcular o fatorial: ");
        int numero = scanner.nextInt();
        
        
        int resultado = calcularFatorial(numero);
        System.out.println("O fatorial de " + numero + " é: " + resultado);
        
        scanner.close();  
    }
}


