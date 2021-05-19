package pessoa;

public class PessoaGerente extends Pessoa {
    private double imposto;

    public PessoaGerente(String nome, EnumCargo cargo, double salario) {
        super(nome, cargo, salario);
        this.imposto = this.calcularImposto();
    }

    public double getImposto() {return this.calcularImposto(); }

    private double calcularImposto() { return this.getSalario() * 0.01; }
}
