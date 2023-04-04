package br.edu.iftm.faturamento;

import java.io.FileReader;
import java.io.IOException;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class Main {

    public static void main(String[] args) {

        // Lê o arquivo JSON
        JSONParser parser = new JSONParser();
        try {
//            Object obj =
            JSONArray faturamentoDiario = (JSONArray) parser.parse(new FileReader("dados.json"));
            
//            System.out.println(obj);
            System.out.println(faturamentoDiario);

            // Calcula o menor e o maior valor de faturamento diário
            double menorValor = Double.MAX_VALUE;
            double maiorValor = Double.MIN_VALUE;
            for (Object o : faturamentoDiario) {
               JSONObject objeto = (JSONObject) o;
                Double valor = (Double) objeto.get("valor");
                if (valor < menorValor) {
                    menorValor = valor;
                }
                if (valor > maiorValor) {
                    maiorValor = valor;
                }
            }
            System.out.println("Menor valor de faturamento diário: " + menorValor);
            System.out.println("Maior valor de faturamento diário: " + maiorValor);

            // Calcula a média mensal
            double media = 0.0;
            int numDias = 0;
            for (Object o : faturamentoDiario) {
                 JSONObject objeto = (JSONObject) o;
                Double valor = (Double) objeto.get("valor");
                if (valor > 0) {
                    media += valor;
                    numDias++;
                }
            }
            media /= numDias;
            System.out.println("Média mensal de faturamento diário: " + media);

            // Calcula o número de dias com faturamento acima da média
            int diasAcimaMedia = 0;
            for (Object o : faturamentoDiario) {
                JSONObject objeto = (JSONObject) o;
                Double valor = (Double) objeto.get("valor");
                if (valor > media) {
                    diasAcimaMedia++;
                }
            }
            System.out.println("Número de dias com faturamento diário acima da média: " + diasAcimaMedia);

        } catch (IOException | ParseException e ) {
            e.printStackTrace();
        }
    }
}
