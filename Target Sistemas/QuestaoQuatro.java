import java.util.Scanner;

public class QuestaoQuatro{

    public static void main(String[] args) {
        Double sp = 67836.43;
        Double rj = 36678.66;
        Double mg = 29229.88;
        Double es = 27165.48;
        Double outros = 19849.53;
        Double total = sp + rj + mg + es + outros;
         System.out.println("PERCENTUAL FATURAMENTO\n ");
        System.out.printf("SP = %.2f%% do Total\n", sp/total*100);
        System.out.printf("RJ = %.2f%% do Total\n", rj/total*100);
        System.out.printf("MG = %.2f%% do Total\n", mg/total*100);
        System.out.printf("ES = %.2f%% do Total\n", es/total*100);
        System.out.printf("Outros = %.2f%% do Total\n", outros/total*100);

    }
}
