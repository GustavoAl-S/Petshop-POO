package petshop;

import java.util.ArrayList;

public class Animal{
    private ArrayList<Procedimento> procedimentos = new ArrayList<Procedimento>();
    private String nome;
    private String raca;
    private String tipo;

    public Animal(String nome, String tipo, String raca){
        this.nome = nome;
        this.tipo = tipo;
        this.raca = raca;
    }

    public void addProcedimento(Procedimento procedimento){
        procedimentos.add(procedimento);
    }

    public ArrayList<Procedimento> retornProcedimento(){
        return procedimentos;
    }

    public String getNome() {
        return nome;
    }

    public String getRaca() {
        return raca;
    }

    public String getTipo() {
        return tipo;
    }

    //public ArrayList<Procedimento> getProcedimentos() { return procedimentos; }

    @Override
    public String toString(){
        return "Animal: " + this.nome + " | " + this.raca + " | " + this.tipo;
    }
}
