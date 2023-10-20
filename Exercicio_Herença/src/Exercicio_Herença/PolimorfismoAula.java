/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Exercicio_Herença;
import java.util.ArrayList;
import java.util.Scanner;

public class PolimorfismoAula {

    public static void main(String[] args) {
        ArrayList<Midia> lista = new ArrayList<>();
        Scanner leitor = new Scanner(System.in);

        int opcao = 0;

        do {
            System.out.println("INSIRA UMA OPÇÃO");
            System.out.println("1. CADASTRAR UM LP");
            System.out.println("2. CADASTRAR UMA FITA");
            System.out.println("999. SAIR DO PROGRAMA");

            opcao = leitor.nextInt(); // Leitura da opção

            if (opcao == 1) {
                System.out.println("Digite o número de músicas do LP:");
                int numMusicas = leitor.nextInt();
                System.out.println("Digite o nome do LP:");
                String nome = leitor.next();
                System.out.println("Digite o código do LP:");
                int codigo = leitor.nextInt();
                System.out.println("Digite o preço do LP:");
                double preco = leitor.nextDouble();
                Disco novoItem = new Disco(numMusicas, nome, codigo, preco);
                lista.add(novoItem);
            } else if (opcao == 2) {
                System.out.println("Digite o número de faixas da fita cassete:");
                int numFaixas = leitor.nextInt();
                System.out.println("Digite o nome da fita cassete:");
                String nome = leitor.next();
                System.out.println("Digite o código da fita cassete:");
                int codigo = leitor.nextInt();
                System.out.println("Digite o preço da fita cassete:");
                double preco = leitor.nextDouble();
                Fitacassete novoItem = new Fitacassete(numFaixas, nome, codigo, preco);
                lista.add(novoItem);
            } else if (opcao == 999) {
                System.out.println("Fim da aplicação...");
            } else {
                System.out.println("Opção inválida. Tente novamente.");
            }
        } while (opcao != 999);

        leitor.close();
    }
}
