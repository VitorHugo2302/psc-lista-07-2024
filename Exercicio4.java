/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lista7daniel;

/**
 *
 * @author Vitor Hugo
 */

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Exercicio4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Double> vendasBrutas = new ArrayList<>();

        System.out.println("Digite as vendas brutas dos vendedores (-1 para encerrar):");

        double vendaBruta = 0;
        while (vendaBruta != -1) {
            vendaBruta = scanner.nextDouble();
            if (vendaBruta != -1) {
                vendasBrutas.add(vendaBruta);
            }
        }

        int[] contadores = new int[9];

        for (double venda : vendasBrutas) {
            double salario = 200 + (0.09 * venda);
            int indice = (int) (salario - 200) / 100;

            if (indice >= 0 && indice <= 8) {
                contadores[indice]++;
            } else {
                contadores[8]++;
            }
        }

        for (int i = 0; i < contadores.length; i++) {
            int inicioFaixa = 200 + (i * 100);
            int fimFaixa = inicioFaixa + 99;
            if (i == contadores.length - 1) {
                fimFaixa = 1000;
            }
            System.out.printf("$%d - $%d: %d vendedores\n", inicioFaixa, fimFaixa, contadores[i]);
        }

        scanner.close();
    }
}
