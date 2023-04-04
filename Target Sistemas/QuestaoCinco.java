import java.util.Scanner;

public class QuestaoCinco {

    public static void main(String[] args) {

        String palavra, palavraInvertida = "";
        
        System.out.println("INVERTER STRING\n");        
        System.out.println("Digite uma palavra: ");

        Scanner sc = new Scanner(System.in);

        palavra = sc.nextLine();
        int tamanho = palavra.length();

        for(int i = 1; i <=tamanho;i++){
            palavraInvertida += palavra.charAt(tamanho - i);
        }
        System.out.println("A palavra invertida fica: " + palavraInvertida);
    }
}
