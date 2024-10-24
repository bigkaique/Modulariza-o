public class VetorOperacoes {

    
    public static int maiorValor(int[] vetor) {
        int max = vetor[0];  
        for (int i = 1; i < vetor.length; i++) {
            if (vetor[i] > max) {
                max = vetor[i];  
            }
        }
        return max;
    }
    
    public static int menorValor(int[] vetor) {
        int min = vetor[0]; 
        for (int i = 1; i < vetor.length; i++) {
            if (vetor[i] < min) {
                min = vetor[i];  
            }
        }
        return min;
    }

    public static double mediaMaxMin(int[] vetor) {
        int max = maiorValor(vetor);  
        int min = menorValor(vetor);  
        return (max + min) / 2.0;     
    }

    public static void main(String[] args) {
        int[] vetor = {10, 3, 8, 15, 7};  
        
        System.out.println("Maior valor: " + maiorValor(vetor));
        System.out.println("Menor valor: " + menorValor(vetor));
        System.out.println("Média (max + min) / 2: " + mediaMaxMin(vetor));
    }
}

