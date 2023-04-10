import java.util.Scanner;
import java.lang.Math;

import java.util.Scanner;
import java.lang.Math;

public class App {
    public static void main(String[] args) {
//Faça um Programa para uma loja de tintas. O programa deverá pedir o tamanho em metros quadrados da área a ser pintada. Considere que a cobertura da tinta é de 1 litro para cada 6 metros quadrados e que a tinta é vendida em latas de 18 litros, que custam R$ 80,00 ou em galões de 3,6 litros, que custam R$ 25,00.
//Informe ao usuário as quantidades de tinta a serem compradas e os respectivos preços em 3 situações:
//comprar apenas latas de 18 litros;
//comprar apenas galões de 3,6 litros;
//misturar latas e galões, de forma que o desperdício de tinta seja menor. Acrescente 10% de folga e sempre arredonde os valores para cima, isto é, considere latas cheias.

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o tamanho em metros quadrados da área a ser pintada: ");
        double metros_quadrados = sc.nextDouble();

        double litros_necessarios = metros_quadrados / 6.0;
        litros_necessarios *= 1.1;

        int latas_necessarias = (int) Math.ceil(litros_necessarios / 18.0);
        double preco_latas = latas_necessarias * 80.0;

        int galoes_necessarios = (int) Math.ceil(litros_necessarios / 3.6);
        double preco_galoes = galoes_necessarios * 25.0;

        int latas = (int) (litros_necessarios / 18.0);
        double litros_restantes = litros_necessarios % 18.0;
        int galoes = (int) Math.ceil(litros_restantes / 3.6);
        double preco_misturado = latas * 80.0 + galoes * 25.0;

        System.out.println("\nOpção 1: Comprar apenas latas de 18 litros");
        System.out.println("Quantidade de latas necessárias: " + latas_necessarias);
        System.out.println("Preço total: R$ " + preco_latas);

        System.out.println("\nOpção 2: Comprar apenas galões de 3,6 litros");
        System.out.println("Quantidade de galões necessários: " + galoes_necessarios);
        System.out.println("Preço total: R$ " + preco_galoes);

        System.out.println("\nOpção 3: Misturar latas e galões");
        System.out.println("Quantidade de latas necessárias: " + latas);
        System.out.println("Quantidade de galões necessários: " + galoes);
        System.out.println("Preço total: R$ " + preco_misturado);

        sc.close();
    }
}