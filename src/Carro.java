public class Carro extends Transporte {
    private int kmPorViagem;
    private int carroKmPorLitro;
    private double precoDoCombustivel;
    private int qtdDias;

    public Carro(String placa, String modelo, int kmPorViagem, int carroKmPorLitro, double precoDoCombustivel, int qtdDias) {
        super(placa, modelo);
        this.kmPorViagem = kmPorViagem;
        this.carroKmPorLitro = carroKmPorLitro;
        this.precoDoCombustivel = precoDoCombustivel;
        this.qtdDias = qtdDias;
        super.setGastoMensal(calculaGastoMensal()); // seta o valor do calculo como o valor do gastoMensal
    }

    public int getKmPorViagem() {
        return kmPorViagem;
    }

    public int getCarroKmPorLitro() {
        return carroKmPorLitro;
    }

    public double getPrecoDoCombustivel() {
        return precoDoCombustivel;
    }

    public double calculaGastoMensal() {
        if (kmPorViagem < carroKmPorLitro) { // caso a distancia for menor que a quantidade gasta por litro
            return precoDoCombustivel;
        }
        int gastoLitroPorKm = kmPorViagem / carroKmPorLitro;
        double gastoCombustivel = precoDoCombustivel * gastoLitroPorKm;
        return gastoCombustivel * qtdDias;
    }


    @Override
    public void exibeDados() {
        super.exibeDados();
        System.out.println("Qual é o tipo de transporte? Carro.");
        System.out.println("---------------");
    }
}
