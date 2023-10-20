package Exercicio_Herença;

import Exercicio_Herença.Midia;
import java.util.Scanner;

public class Disco extends Midia{
    private int numeroMusicas;

    public Disco() {
    }

    public Disco(int numeroMusicas, String nome, int codigo, double preço) {
        super(nome, codigo, preço);
        this.numeroMusicas = numeroMusicas;
    }

    public int getNumeroMusicas() {
        return numeroMusicas;
    }

    public void setNumeroMusicas(int numeroMusicas) {
        this.numeroMusicas = numeroMusicas;
    }
    
    @Override
    public String getDetalhes(){
        return "Nome: " + getNome() + 
               " Codigo: " + getCodigo() + 
               " Preço: " + getPreço() + 
               " Número de músicas: " + getNumeroMusicas();
    }
    public void setMusicas(int numeroMusicas){
        setNumeroMusicas(numeroMusicas);
    }
    
    @Override
    public void inserirDados(){
        super.inserirDados();
        Scanner lerteclado = new Scanner(System.in);
        int quantidadeMusicasDigitadas;
        System.out.println("Digite a quantidade de músicas: ");
        quantidadeMusicasDigitadas = lerteclado.nextInt();
        
        setMusicas(quantidadeMusicasDigitadas);
    }
}