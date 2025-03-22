public class Main {
    public static void main(String[] args) {

        // Cria o objeto iPhone
        iPhone iphone = new iPhone();

        // Testando o Reprodutor Musical
        iphone.adicionarMusica("Imagine - John Lennon");
        iphone.usarReprodutorMusical("Imagine - John Lennon");
        iphone.reprodutorMusical.pausarMusica();

        // Testando o Aparelho Telefônico
        iphone.guardarContato("Maria", "123456789");
        iphone.usarAparelhoTelefonico("123456789");
        iphone.aparelhoTelefonico.enviarSMS("123456789", "Oi, tudo bem?");

        // Testando o Navegador Internet
        iphone.salvarFavorito("http://www.apple.com");
        iphone.usarNavegadorInternet("http://www.apple.com");

    }
}