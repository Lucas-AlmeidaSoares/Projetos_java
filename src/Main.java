public class Main {
    public static void main(String[] args) {
        Pessoa pessoaComum = new Pessoa("João", 70.0, 1.75);
        Pessoa atleta = new Atleta("Maria", 70.0, 1.75, "Corrida");

        pessoaComum.mostrarDetalhe();
        atleta.mostrarDetalhe();
    }
}
