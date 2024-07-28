public class Main {

    public static void main(String[] args) {
        Cliente renan = new Cliente();
        renan.setNome("Renan");

        Conta cc = new ContaCorrente(renan);
        Conta poupanca = new ContaPoupanca(renan);

        cc.depositar(100000);
        cc.transferir(100, poupanca);

        cc.imprimirExtrato();
        poupanca.imprimirExtrato();
    }

}