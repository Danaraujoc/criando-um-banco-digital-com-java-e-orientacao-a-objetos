import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public abstract class Conta implements IConta {

    private static final int AGENCIA_PADRAO = 1;
    private static int SEQUENCIAL = 1;

    protected int agencia;
    protected int numero;
    protected double saldo;
    protected Cliente cliente;
    protected String senha;
    protected List<Transacao> transacoes;


    public Conta(Cliente cliente, String senha) {
        this.agencia = AGENCIA_PADRAO;
        this.numero = SEQUENCIAL++;
        this.cliente = cliente;
        this.senha = senha;
        this.transacoes = new ArrayList<>();
    }

    @Override
    public boolean autenticar(String senha) {
        return this.senha.equals(senha);
    }

    @Override
    public void sacar(double valor) {
        saldo -= valor;
        transacoes.add(new Transacao("Saque", valor, LocalDateTime.now()));

    }

    @Override
    public void depositar(double valor) {
        saldo += valor;
        transacoes.add(new Transacao("Deposito", valor, LocalDateTime.now()));

    }

    @Override
    public void transferir(double valor, Conta contaDestino) {
        this.sacar(valor);
        contaDestino.depositar(valor);
        transacoes.add(new Transacao("Transferencia", valor, LocalDateTime.now()));
    }

    protected void imprimirInfosComuns() {
        System.out.printf("Titular: %s%n", this.cliente.getNome());
        System.out.printf("Agencia: %d%n", this.agencia);
        System.out.printf("Numero: %d%n", this.numero);
        System.out.printf("Saldo: %.2f%n", this.saldo);
        System.out.println("Historico de Transacoes:");
        for (Transacao transacao : transacoes) {
            System.out.println(transacao);
        }
    }

    public int getAgencia() {
        return agencia;
    }

    public int getNumero() {
        return numero;
    }

    public double getSaldo() {
        return saldo;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public List<Transacao> getTransacoes() {
        return transacoes;
    }


}
