import java.util.ArrayList;
import java.util.List;

public class ReprodutorMusicalImpl implements ReprodutorMusical {
    private List<String> musicas;

    public ReprodutorMusicalImpl() {
        this.musicas = new ArrayList<>();
    }

    @Override
    public void tocarMusica(String musica) {
        if (musicas.contains(musica)) {
            System.out.println("Tocando música: " + musica);
        } else {
            System.out.println("Música não encontrada.");
        }
    }

    @Override
    public void pausarMusica() {
        System.out.println("Música pausada.");
    }

    @Override
    public void pararMusica() {
        System.out.println("Música parada.");
    }

    @Override
    public void adicionarMusica(String musica) {
        musicas.add(musica);
        System.out.println("Música adicionada: " + musica);
    }

    @Override
    public void removerMusica(String musica) {
        musicas.remove(musica);
        System.out.println("Música removida: " + musica);
    }
}
