package petshop;

public class Vacina extends Procedimento {
    private String nomeVacina;
    private String validadeVacina;

    public Vacina(String nomeFuncionario, String validadeVacina, String nomeVacina){
        super(nomeFuncionario);
        this.validadeVacina = validadeVacina;
        this.nomeVacina = nomeVacina;
    }

    public void imprimirProcedimento() {
        System.out.println("    Procedimento: Vacina  | " + nomeFuncionario +
                " | " + nomeVacina + " | " + validadeVacina);
    }

    @Override
    public String toString() {
        return "Procedimento: Vacina  | " + nomeFuncionario +
                " | " + nomeVacina + " | " + validadeVacina;
    }
}
