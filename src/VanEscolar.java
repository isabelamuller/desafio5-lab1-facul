public class VanEscolar extends Transporte {
    private double valorMensalidade;
    private int diasSemana;

    public VanEscolar(String placa, String modelo, double valorMensalidade, int diasSemana) {
        super(placa, modelo);
        this.valorMensalidade = valorMensalidade;
        this.diasSemana = diasSemana;
        super.setGastoMensal(calculaGastoMensal()); // seta o valor do calculo como o valor do gastoMensal

    }

    public double calculaGastoMensal() {
        return valorMensalidade * diasSemana;
    }

    @Override
    public void exibeDados() {
        super.exibeDados();
        System.out.println("Qual é o tipo de transporte? Van Escolar.");
        System.out.println("---------------");
    }

}