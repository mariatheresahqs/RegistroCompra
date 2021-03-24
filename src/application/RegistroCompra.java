package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Produto;

public class RegistroCompra {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        int valorTemp;

        System.out.print("------------------------------------------------------------------\n");
        System.out.print("Digite o nome do produto: ");
        String nome = sc.nextLine();
        
        System.out.print("Digite o preço do produto: ");
        double preco = sc.nextDouble();

        System.out.print("Digite a quantidade que deseja comprar: ");
        int quantidade = sc.nextInt();
        Produto prodEscolhido = new Produto(nome, preco, quantidade);


        // INFORMACOES DE COMPRA
        System.out.println("Registro de compra:\n" + prodEscolhido);
        System.out.print("------------------------------------------------------------------\n");

        // ADICAO DE PRODUTOS A COMPRA
        System.out.print("Digite a quantidade de produtos que você quer adicionar a compra: ");
        valorTemp = sc.nextInt();
        prodEscolhido.adicionarProduto(valorTemp);
        // INFORMACOES DE COMPRA
        System.out.println("Registro de compra:\n" + prodEscolhido);
        System.out.print("------------------------------------------------------------------\n");


        // ADICAO DE PRODUTOS A COMPRA
        System.out.print("Digite a quantidade de produtos que você quer retirar da compra: ");
        valorTemp = sc.nextInt();
        prodEscolhido.retirarProduto(valorTemp);
        System.out.print("------------------------------------------------------------------\n");

        // INFORMACOES DE COMPRA
        System.out.println("Registro de compra:\n" + prodEscolhido);
        System.out.print("------------------------------------------------------------------\n");

        sc.close();
    }
}
