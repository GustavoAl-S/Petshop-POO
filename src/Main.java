//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Animal a1 = new Animal("Bidu", "Cachorro", "Vira-Lata");
        Vacina v1 = new Vacina("Joao", "17/12/2027",
                "Raiva");
        Cliente c1 = new Cliente("4002 - 8922","Joao", "Rua A, Casa 1");

        a1.addProcedimento(v1);
        c1.addAnimal(a1);

        var r2 = c1.retornaAnimal("Bidu");
        System.out.println(r2);

        var r1 = a1.retornProcedimento();
        System.out.println(r1);
    }
}