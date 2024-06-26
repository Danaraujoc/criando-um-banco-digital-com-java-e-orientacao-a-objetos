import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Banco banco = new Banco("Meu Banco Digital", new ArrayList<>());

        Cliente cliente1 = new Cliente("Alice");
        Conta cc1 = new ContaCorrente(cliente1, "1234");
        if (cc1.autenticar("1234")) {
            cc1.depositar(1000);
            cc1.sacar(500);
        }
        banco.adicionarConta(cc1);
        cc1.imprimirExtrato();

        Cliente cliente2 = new Cliente("Bob");
        Conta cp1 = new ContaPoupanca(cliente2, "5678");
        if (cp1.autenticar("5678")) {
            cp1.depositar(2000);
            cp1.transferir(300, cc1);
        }
        banco.adicionarConta(cp1);
        cp1.imprimirExtrato();

        banco.listarContas();

        // Busca de conta por cliente
        System.out.println(banco.buscarContaPorCliente("Alice"));
        System.out.println(banco.buscarContaPorCliente("Daniel"));
    }
}
