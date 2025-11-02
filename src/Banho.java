public class Banho extends  Procedimento{
    private String shampoo;

    public Banho(String nomeFuncionario, String shampoo){
        super(nomeFuncionario);
        this.shampoo = shampoo;
    }

    public void imprimirProcedimento() {
        System.out.println("Procedimento: Banho " + nomeFuncionario + " | " + shampoo);
    }

    @Override
    public String toString() {
        return "Procedimento: Banho " + nomeFuncionario + " | " + shampoo;
    }
}
