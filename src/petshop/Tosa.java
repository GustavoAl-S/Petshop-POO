package petshop;

public class Tosa extends Procedimento {
    private String tipoTosa;

    public Tosa(String nomeFuncionario, String tipoTosa){
        super(nomeFuncionario);
        this.tipoTosa = tipoTosa;
    }

    public void imprimirProcedimento() {
        System.out.println("petshop.Procedimento: petshop.Tosa " + nomeFuncionario + " | " + tipoTosa);
    }

    @Override
    public String toString() {
        return "petshop.Procedimento: petshop.Tosa " + nomeFuncionario + " | " + tipoTosa;
    }
}
