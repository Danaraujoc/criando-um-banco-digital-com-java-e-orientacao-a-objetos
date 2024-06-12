import java.text.NumberFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public record Transacao(String tipo, double valor, LocalDateTime data) {

    @Override
    public String toString() {
        NumberFormat nf = NumberFormat.getCurrencyInstance(new Locale("pt", "Br"));
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");

        return "Transacao{" +
                "tipo='" + tipo + '\'' +
                ", valor= " + nf.format( valor) +
                ", data='" + data.format(dtf) + '\'' +
                '}';
    }
}