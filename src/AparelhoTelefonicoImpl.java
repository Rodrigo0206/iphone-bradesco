import java.util.HashMap;
import java.util.Map;

public class AparelhoTelefonicoImpl implements AparelhoTelefonico {
    private Map<String, String> contatos;

    public AparelhoTelefonicoImpl() {
        this.contatos = new HashMap<>();
    }

    @Override
    public void fazerChamada(String numero) {
        System.out.println("Chamando o número: " + numero);
    }

    @Override
    public void receberChamada(String numero) {
        System.out.println("Recebendo chamada de: " + numero);
    }

    @Override
    public void enviarSMS(String numero, String mensagem) {
        System.out.println("Enviando SMS para " + numero + ": " + mensagem);
    }

    @Override
    public void guardarContato(String nome, String numero) {
        contatos.put(nome, numero);
        System.out.println("Contato " + nome + " guardado com número " + numero);
    }

    @Override
    public void removerContato(String nome) {
        contatos.remove(nome);
        System.out.println("Contato " + nome + " removido.");
    }
}
