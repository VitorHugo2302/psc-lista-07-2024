/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lista7daniel;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Vitor Hugo
 */
public class Exercicio1 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        List<Double> temperaturas = new ArrayList<>();
        String[] meses = {"Janeiro", "Fevereiro", "Março", "Abril", "Maio", "Junho", "Julho", "Agosto", "Setembro", "Outubro", "Novembro", "Dezembro"};

        for (int i = 0; i < meses.length; i++) {
            System.out.print("Digite a temperatura média de " + meses[i] + ": ");
            double temperatura = entrada.nextDouble();
            temperaturas.add(temperatura);
        }

        double soma = 0;
        for (double temperatura : temperaturas) {
            soma += temperatura;
        }

        double mediaAnual = soma / temperaturas.size();

        System.out.println("Média anual das temperaturas: " + mediaAnual);

        System.out.println("Temperaturas acima da média anual:");
        for (int i = 0; i < temperaturas.size(); i++) {
            if (temperaturas.get(i) > mediaAnual) {
                System.out.println(meses[i] + ": " + temperaturas.get(i));
            }
        }

        entrada.close();
    }
}
