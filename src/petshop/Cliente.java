package petshop;

import java.util.ArrayList;

public class Cliente {
    private ArrayList<Animal> animais = new ArrayList<>();
    private String endereco;
    private String nome;
    private String telefone;

    public Cliente(String telefone, String nome, String endereco) {
        this.telefone = telefone;
        this.nome = nome;
        this.endereco = endereco;
    }

    public void addAnimal(Animal animal){
        animais.add(animal);
    }

    public Animal retornaAnimal(String nome){

        for (int i = 0; i < animais.size(); i++) {
            Animal a = animais.get(i);

            if (a.getNome().equals(nome)){
                return a;
            }
        }
        return null;
    }

    public ArrayList<Animal> returnAnimais(){
        return animais;
    }

    public String getTelefone() {
        return telefone;
    }

    public String getNome() {
        return nome;
    }

    public String getEndereco() {
        return endereco;
    }


    @Override
    public String toString() {
        return "petshop.Cliente: João Silva | " + endereco + " | " + telefone;
    }
}
