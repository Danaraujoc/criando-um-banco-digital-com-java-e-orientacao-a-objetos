import java.util.ArrayList;
import java.util.List;

public class Banco {

    private String nome;
    private List<Conta> contas;

    public Banco(String nome, List<Conta> contas) {
        this.nome = nome;
        this.contas = contas;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<Conta> getContas() {
        return contas;
    }

    public void setContas(List<Conta> contas) {
        this.contas = contas;
    }

    public void adicionarConta(Conta conta) {
        contas.add(conta);
    }

    public void listarContas() {
        for (Conta conta : contas) {
            System.out.println(conta);
        }
    }

    public String buscarContaPorCliente(String nomeCliente) {
        for (Conta conta : contas) {
            if (conta.getCliente().getNome().equals(nomeCliente)) {
                return "Conta encontrada: \n" + conta.toString();
            }
        }
        return "Conta nao encontrada para o cliente: " + nomeCliente;
    }

}
