public class iPhone {
    ReprodutorMusical reprodutorMusical;
    AparelhoTelefonico aparelhoTelefonico;
    private NavegadorInternet navegadorInternet;

    public iPhone() {
        this.reprodutorMusical = new ReprodutorMusicalImpl();
        this.aparelhoTelefonico = new AparelhoTelefonicoImpl();
        this.navegadorInternet = new NavegadorInternetImpl();
    }

    public void usarReprodutorMusical(String musica) {
        reprodutorMusical.tocarMusica(musica);
    }

    public void usarAparelhoTelefonico(String numero) {
        aparelhoTelefonico.fazerChamada(numero);
    }

    public void usarNavegadorInternet(String url) {
        navegadorInternet.abrirPagina(url);
    }

    // Métodos para interação com os componentes do iPhone (por exemplo, adicionar música, salvar favoritos, etc.)
    public void adicionarMusica(String musica) {
        reprodutorMusical.adicionarMusica(musica);
    }

    public void guardarContato(String nome, String numero) {
        aparelhoTelefonico.guardarContato(nome, numero);
    }

    public void salvarFavorito(String url) {
        navegadorInternet.salvarFavorito(url);
    }
}
