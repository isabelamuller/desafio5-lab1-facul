public class Teste {
    public static void main(String[] args) {

        Transporte van = new VanEscolar();
        van.exibeDados();

        Transporte carro = new Carro();
        carro.exibeDados();

        Transporte onibus = new Onibus();
        onibus.exibeDados();
    }
}
