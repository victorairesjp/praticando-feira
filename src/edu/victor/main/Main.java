package edu.victor.main;
import edu.victor.modelos.ItemFeira;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<ItemFeira> listaDeItens = new ArrayList<>();
        // Adicionando itens à lista (Nome, Quantidade, Preço Unitário)
        listaDeItens.add(new ItemFeira("Carne Moída", 1, 25));
        listaDeItens.add(new ItemFeira("Filezinho", 1, 18));
        listaDeItens.add(new ItemFeira("Salsicha", 10, 2));
        listaDeItens.add(new ItemFeira("Queijo Mussarela", 2, 8));
        listaDeItens.add(new ItemFeira("Presunto", 1, 8));
        listaDeItens.add(new ItemFeira("Manteiga", 1, 15));
        listaDeItens.add(new ItemFeira("Requeijão", 1, 15));
        listaDeItens.add(new ItemFeira("Açucar", 1, 5));
        listaDeItens.add(new ItemFeira("Arroz", 1, 8));
        listaDeItens.add(new ItemFeira("Macarrão", 1, 4));
        listaDeItens.add(new ItemFeira("Milho", 2, 5));
        listaDeItens.add(new ItemFeira("Molho de Tomate", 4, 3));
        listaDeItens.add(new ItemFeira("Azeite", 1, 30));
        listaDeItens.add(new ItemFeira("Batata Palha", 1, 5));
        listaDeItens.add(new ItemFeira("Creme de Leite", 3, 3));
        listaDeItens.add(new ItemFeira("Leite Condensado", 2, 4));
        listaDeItens.add(new ItemFeira("Pasta de Dente", 2, 8));
        listaDeItens.add(new ItemFeira("Colônia Johnson", 1, 10));
        listaDeItens.add(new ItemFeira("Água Sanitária", 1, 10));
        listaDeItens.add(new ItemFeira("Pano Multiuso", 1, 10));
        listaDeItens.add(new ItemFeira("Detergent", 2, 3));
        listaDeItens.add(new ItemFeira("Guardanapos", 1, 3));
        listaDeItens.add(new ItemFeira("Papel Toalha", 1, 5));
        listaDeItens.add(new ItemFeira("Papel Higiênico", 6, 2));
        listaDeItens.add(new ItemFeira("Sabonete Líquido para Roupa", 1, 10));
        listaDeItens.add(new ItemFeira("Bombril", 1, 5));
        listaDeItens.add(new ItemFeira("Pinho Sol", 1, 8));
        listaDeItens.add(new ItemFeira("Cominho", 1, 3));
        listaDeItens.add(new ItemFeira("Coloral", 1, 3));
        listaDeItens.add(new ItemFeira("Ovo", 30, 1));
        listaDeItens.add(new ItemFeira("Cebola", 3, 1));
        listaDeItens.add(new ItemFeira("Alho", 3, 1)); 
        listaDeItens.add(new ItemFeira("Tomate", 3, 1));
        listaDeItens.add(new ItemFeira("Cenoura", 2, 1));
        listaDeItens.add(new ItemFeira("Batata", 3, 1));
        listaDeItens.add(new ItemFeira("Cebolinha", 1, 3));
        listaDeItens.add(new ItemFeira("Uva", 1, 5));
        listaDeItens.add(new ItemFeira("Melão", 1, 5));

        // Exibindo os itens da lista
        System.out.println("Quantidade de Itens na Feira: " + listaDeItens.size() + " itens");

        for (ItemFeira item : listaDeItens) {
            System.out.println(item.getQuantidade() + " " + item.getNome() +  
                               ", Valor Total: R$ " + item.calcularGasto());
        }
        
        // Calcular valor total da feira
        double valorTotalFeira = 0;
        for (ItemFeira item : listaDeItens) {
            valorTotalFeira += item.calcularGasto();
        }
        System.out.println("Valor Total da Feira: R$ " + valorTotalFeira);
    }
}
