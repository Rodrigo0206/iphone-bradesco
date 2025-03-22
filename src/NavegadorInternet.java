public interface NavegadorInternet {
    void abrirPagina(String url);
    void fecharPagina();
    void salvarFavorito(String url);
    void removerFavorito(String url);
}
