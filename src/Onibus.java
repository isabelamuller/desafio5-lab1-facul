public class Onibus extends Transporte {
    private double valorPassagem;
    private int qtdDias;

    public Onibus(String placa, String modelo, double valorPassagem, int qtdDias) {
        super(placa, modelo);
        this.valorPassagem = valorPassagem;
        this.qtdDias = qtdDias;
        super.setGastoMensal(calculaGastoMensal()); // seta o valor do calculo como o valor do gastoMensal
    }

    public double getValorPassagem() {
        return valorPassagem;
    }

    public double calculaGastoMensal() {
        return (valorPassagem * 2) * qtdDias; // 2 pois ida e volta
    }

    @Override
    public void exibeDados() {
        super.exibeDados();
        System.out.println("Qual é o tipo de transporte? Ônibus.");
        System.out.println("---------------");
    }
}