public interface AparelhoTelefonico {
    void fazerChamada(String numero);
    void receberChamada(String numero);
    void enviarSMS(String numero, String mensagem);
    void guardarContato(String nome, String numero);
    void removerContato(String nome);
}
