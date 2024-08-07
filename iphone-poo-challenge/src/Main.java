public class Main {
    public static void main(String[] args) {
        iPhone meuIphone = new iPhone();

        // Testando Reprodutor Musical
        meuIphone.getReprodutorMusical().selecionarMusica("Deus da Força");
        meuIphone.getReprodutorMusical().tocar();        
        meuIphone.getReprodutorMusical().pausar();

        // Testando Aparelho Telefônico
        meuIphone.getAparelhoTelefonico().ligar("+55 (21) 97805-5874");
        meuIphone.getAparelhoTelefonico().atender();
        meuIphone.getAparelhoTelefonico().iniciarCorreioVoz();

        // Testando Navegador Internet
        meuIphone.getNavegadorInternet().exibirPagina("www.google.com");
        meuIphone.getNavegadorInternet().adicionarNovaAba();
        meuIphone.getNavegadorInternet().atualizarPagina();
    }
}
