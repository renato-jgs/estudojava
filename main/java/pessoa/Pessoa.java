package pessoa;

public abstract class Pessoa {
    private String nome;
    private EnumCargo cargo;
    private double salario;

    public Pessoa (String nome, EnumCargo cargo, double salario) {
        this.nome = nome;
        this.cargo = cargo;
        this.salario = salario;
    }

    public String getNome(){ return nome; }
    public void setNome(String nome){ this.nome = nome; }

    public EnumCargo getCargo(){ return cargo; }
    public void setCargo(EnumCargo cargo) { this.cargo = cargo; }

    public double getSalario(){ return salario; }
    public void setSalario(double salario) { this.salario = salario; }

    // sobrescrevendo metodo equals para comparar objetos dessa classe
    @Override
    public boolean equals (Object obj) {
        if (obj == null) {
            return false;
        }

        Pessoa comparavel;

        if (obj instanceof Pessoa) {
            comparavel = (Pessoa) obj;
        } else {
            return false;
        }

        if (comparavel.nome == this.nome && comparavel.cargo == this.cargo && comparavel.salario == this.salario) {
            return true;
        }

        return false;

    }
}
