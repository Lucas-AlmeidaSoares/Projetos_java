public class Atleta extends Pessoa {
    private String esportePraticado;

    public Atleta(String nome, double peso, double altura, String esportePraticado) {
        super(nome, peso, altura);
        this.esportePraticado = esportePraticado;
    }

    public String getEsportePraticado() {
        return esportePraticado;
    }

    public void setEsportePraticado(String esportePraticado) {
        this.esportePraticado = esportePraticado;
    }

    @Override
    public double calcularIMC() {
        double imcOriginal = super.calcularIMC();
        return imcOriginal * 0.95;
    }

    @Override
    public void mostrarDetalhe() {
        System.out.println("Nome da pessoa atleta: " + getNome());
        System.out.println("Peso da pessoa atleta: " + getPeso() );
        System.out.println("Altura da pessoa atleta: " + getAltura() );
        System.out.println("IMC da pessoa atleta (ajustado): " + calcularIMC());
        System.out.println("Esporte praticado: " + esportePraticado);
        System.out.println("----------");
    }
}
