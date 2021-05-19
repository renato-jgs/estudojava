package pessoa;

public class TestePessoa {
    public static void main (String[] args) {
        // testando geração de imposto utilizando herança
        PessoaGerente gerente1 = new PessoaGerente("Renato", EnumCargo.CARGO_GERENTE, 1000);
        System.out.println (gerente1.getImposto());

        // testando comparacao com equals modificado
        PessoaGerente gerente2 = new PessoaGerente("Renata", EnumCargo.CARGO_GERENTE, 1000);
        System.out.println(gerente1.equals(gerente2));
    }
}
