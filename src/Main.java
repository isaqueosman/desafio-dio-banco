public class Main {

    public static void main(String[] args) {
        Cliente isaque = new Cliente();
        isaque.setNome("Isaque");

        IConta cc = new ContaCorrente(isaque);
        IConta poupanca = new ContaPoupanca(isaque);

        cc.depositar(100);
        cc.transferir(100, poupanca);

        cc.imprimirExtrato();
        poupanca.imprimirExtrato();
    }
}
