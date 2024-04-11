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

public class Exercicio3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Double> notas = new ArrayList<>();
        
        System.out.println("Digite as notas (digite -1 para encerrar):");

        double nota = 0;
        while (nota != -1) {
            nota = scanner.nextDouble();
            if (nota != -1) {
                notas.add(nota);
            }
        }

        System.out.println("Quantidade de valores lidos: " + notas.size());

        System.out.print("Valores na ordem em que foram informados: ");
        for (double n : notas) {
            System.out.print(n + " ");
        }
        System.out.println();

        System.out.println("Valores na ordem inversa à que foram informados:");
        for (int i = notas.size() - 1; i >= 0; i--) {
            System.out.println(notas.get(i));
        }

        double soma = 0;
        for (double n : notas) {
            soma += n;
        }
        System.out.println("Soma dos valores: " + soma);

        double media = soma / notas.size();
        System.out.println("Média dos valores: " + media);

        int acimaDaMedia = 0;
        int abaixoDeSete = 0;
        for (double n : notas) {
            if (n > media) {
                acimaDaMedia++;
            }
            if (n < 7) {
                abaixoDeSete++;
            }
        }
        System.out.println("Quantidade de valores acima da média: " + acimaDaMedia);
        System.out.println("Quantidade de valores abaixo de sete: " + abaixoDeSete);

        System.out.println("Programa encerrado.");
        scanner.close();
    }
}
