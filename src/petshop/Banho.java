package petshop;

public class Banho extends Procedimento {
    private String shampoo;

    public Banho(String nomeFuncionario, String shampoo){
        super(nomeFuncionario);
        this.shampoo = shampoo;
    }

    public void imprimirProcedimento() {
        System.out.println("petshop.Procedimento: petshop.Banho " + nomeFuncionario + " | " + shampoo);
    }

    @Override
    public String toString() {
        return "petshop.Procedimento: petshop.Banho " + nomeFuncionario + " | " + shampoo;
    }
}
