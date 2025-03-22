import java.util.HashSet;
import java.util.Set;

public class NavegadorInternetImpl implements NavegadorInternet {
    private Set<String> favoritos;

    public NavegadorInternetImpl() {
        this.favoritos = new HashSet<>();
    }

    @Override
    public void abrirPagina(String url) {
        System.out.println("Abrindo página: " + url);
    }

    @Override
    public void fecharPagina() {
        System.out.println("Página fechada.");
    }

    @Override
    public void salvarFavorito(String url) {
        favoritos.add(url);
        System.out.println("Página salva como favorita: " + url);
    }

    @Override
    public void removerFavorito(String url) {
        favoritos.remove(url);
        System.out.println("Página removida dos favoritos: " + url);
    }
}
