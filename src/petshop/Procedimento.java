package petshop;

public class Procedimento {
    protected String nomeFuncionario;

    public Procedimento(String nomeFuncionario) {
        this.nomeFuncionario = nomeFuncionario;
    }

    public void imprimirProcedimento(){
    }

    public String getNomeFuncionario() {
        return nomeFuncionario;
    }

    public void setNomeFuncionario(String nomeFuncionario) {
        this.nomeFuncionario = nomeFuncionario;
    }
}
