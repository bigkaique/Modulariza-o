
public class metadodiasemanais {

   
    public static String exibirDiaSemana(int numero) {
        switch (numero) {
            case 1:
                return "domingo";
            case 2:
                return "segunda";
            case 3:
                return "terça";
            case 4:
                return "quarta";
            case 5:
                return "quinta";
            case 6:
                return "sexta";
            case 7:
                return "sábado";
            default:
                return "Dia da semana inválido";
        }
    }

    public static void main(String[] args) {
        
        System.out.println(exibirDiaSemana(1));  
        System.out.println(exibirDiaSemana(2));  
        System.out.println(exibirDiaSemana(3));  
        System.out.println(exibirDiaSemana(8));  
    }
}
