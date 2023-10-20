package Exercicio_Herença;

import java.util.Scanner;

public class Midia {
    private String nome;
    private int codigo;
    private double preço;

    public Midia(){
        
    }
    
    public Midia(String nome, int codigo, double preço) {
        this.nome = nome;
        this.codigo = codigo;
        this.preço = preço;
    }

    public String getNome() {
        return nome;
    }

    public int getCodigo() {
        return codigo;
    }

    public double getPreço() {
        return preço;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public void setPreço(double preço) {
        this.preço = preço;
    }
    
    public String getDetalhes(){
        
        return "Nome: " + getNome() + 
               " Codigo: " + getCodigo() + 
               " Preço: " + getPreço();
    }
    
    public void imprimeDados(){
        System.out.println("Nome: " + getNome());
        System.out.println("Codigo: " + getCodigo());
        System.out.println("Preço: " + getPreço());
    }
    
    public void inserirDados(){
        Scanner lerteclado = new Scanner(System.in);
        String nomeDigitado;
        int codigoDigitado;
        double preçoDigitado;
        
        System.out.println("Digite o nome: ");
        nomeDigitado = lerteclado.next();
        System.out.println("Digite o código: ");
        codigoDigitado = lerteclado.nextInt();
        System.out.println("Digite o preço: ");
        preçoDigitado = lerteclado.nextDouble();
        
        setNome(nomeDigitado);
        setCodigo(codigoDigitado);
       
 setPreço(preçoDigitado);
    }
}
