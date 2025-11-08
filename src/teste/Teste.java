package teste;

import petshop.*;

import java.util.ArrayList;

public class Teste {

    public static void imprimirClientes(ArrayList<Cliente> clientes){

        for (Cliente cliente : clientes){
            System.out.println();
            System.out.println(cliente);

            for ( Animal a : cliente.returnAnimais()){
                System.out.println(a);

                for (Procedimento procedimento : a.retornProcedimento()) {
                    procedimento.imprimirProcedimento();
                }
            }
        }
    }


    public static void main(String[] args) {

        ArrayList<Cliente> clientes = new ArrayList<Cliente>();

        Cliente c1 = new Cliente("66 98744-5474", "Joao Silva",
                " Rua Mato Grosso, 15, Rondonopolis");

        Cliente c2 = new Cliente("66 3235-9879", "Mariana Ferraz",
                "Av. Brasil, 400 – Rondonopolis");

        Cliente c3 = new Cliente("", "Gabriela Brito",
                "Rua Dom Pedro, 2344 – Rondonopolis");

        clientes.add(c1);
        clientes.add(c2);
        clientes.add(c3);


        //Animais do cliente 1
        Animal a1 = new Animal("Rex","Cachorro","Pastor Alemao");
        Animal a2 = new Animal("Bidu","Cachorro","Schaunzer");
        c1.addAnimal(a1);
        c1.addAnimal(a2);

        // Animais do cliente 2
        Animal a3 = new Animal("Pingo","Gato","Persa");
        Animal a4 = new Animal("Tigo","Cachorro","Shitzu");
        c2.addAnimal(a3);
        c2.addAnimal(a4);

        // Animal do cliente 3
        Animal a5 = new Animal("Binga","Cachorro","Poodle");
        c3.addAnimal(a5);


        // Procedimento do a1, vulgo Rex
        Vacina v1 = new Vacina("Fatima","12/08/2017", "Anti Rabica");
        Banho b1 = new Banho("Rodrigo","Anti rugas"); // Rapaz que dog chique, usando um anti rugas
        Banho b2 = new Banho("Rodrigo","Anti Carrapatos");
        a1.addProcedimento(v1);
        a1.addProcedimento(b1);
        a1.addProcedimento(b2);


        // Procedimento do Animal 2, vulgo Bidu ou a2
        Vacina v2 = new Vacina("Fatima", "08/12/2018", "Anti carrapato");
        a2.addProcedimento(v2);


        // Procedimento Animal 3
        Banho b3 = new Banho("Rodrigo", "Anti pulgas");
        a3.addProcedimento(b3);


        // Procedimento Animal 4
        Tosa t1 = new Tosa("Marcela", "Higiene Persa");
        Vacina v3 = new Vacina("Fatima", "01/01/2018", "Anti Rabica");
        a4.addProcedimento(t1);
        a4.addProcedimento(v3);


        // Procedimento Animal 5
        Banho b4 = new Banho("Rodrigo", "Anti Pulgas");
        Vacina v4 = new Vacina("Fátima", "12/08/2017", "Anti Rábica");
        Tosa t2 = new Tosa("Marcela", "Geral");
        a5.addProcedimento(b4);
        a5.addProcedimento(v4);
        a5.addProcedimento(t2);

        imprimirClientes(clientes);
    }
}
