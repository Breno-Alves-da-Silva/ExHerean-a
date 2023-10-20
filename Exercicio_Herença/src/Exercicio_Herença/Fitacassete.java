package Exercicio_Herença;

import java.util.Scanner;

public class Fitacassete extends Midia {
    private int numFaixas;

    public Fitacassete() {
    }

    public Fitacassete(int numFaixas, String nome, int codigo, double preço) {
        super(nome, codigo, preço);
        this.numFaixas = numFaixas;
    }

    public int getNumFaixas() {
        return numFaixas;
    }

    public void setNumFaixas(int numFaixas) {
        this.numFaixas = numFaixas;
    }
    
    @Override
    public String getDetalhes(){
        return "Nome: " + getNome() + 
               " Codigo: " + getCodigo() + 
               " Preço: " + getPreço() + 
               " Número de faixas: " + getNumFaixas();
    }
    
    public void setFaixas(int numeroFaixas){
        setNumFaixas(numeroFaixas);
    }
    
    @Override
    public void inserirDados(){
        super.inserirDados();
        Scanner lerteclado = new Scanner(System.in);
        int quantidadeFaixasDigitadas;
        System.out.println("Digite a quantidade de faixas: ");
        quantidadeFaixasDigitadas = lerteclado.nextInt();
        
        setFaixas(quantidadeFaixasDigitadas);
    }
}


