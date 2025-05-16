package edu.victor.modelos;

public class ItemFeira {

    private String nome;
    private int quantidade;
    private double precoUnitario;

// Getters e Setters
    
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public int getQuantidade() {
        return quantidade;
    }
    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }
    public double getPrecoUnitario() {
        return precoUnitario;
    }
    public void setPrecoUnitario(double precoUnitario) {
        this.precoUnitario = precoUnitario;
    }
   
    
    // Methods
    public double calcularGasto() {
        return (quantidade * precoUnitario);
    }

    // Construtores
    public ItemFeira(String nome, int quantidade, double precoUnitario) {
        this.nome = nome;
        this.quantidade = quantidade;
        this.precoUnitario = precoUnitario;
    }
}
