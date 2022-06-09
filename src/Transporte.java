public class Transporte {
    private String placa; // herança
    private String modelo; // herança
    private double gastoMensal;

    public Transporte(String placa, String modelo) {
        this.placa = placa;
        this.modelo = modelo;
        this.gastoMensal = 0;
    }

    public String getPlaca() {
        return placa;
    }

    public String getModelo() {
        return modelo;
    }

    public double getGastoMensal() {
        return gastoMensal;
    }

    public void setGastoMensal(double gastoMensal) {
        this.gastoMensal = gastoMensal;
    }

    public void exibeDados() {
        System.out.println("Placa do transporte: " + placa);
        System.out.println("Modelo do transporte: " + modelo);
        System.out.println("Valor de gasto mensal: R$" + gastoMensal);


    }

}