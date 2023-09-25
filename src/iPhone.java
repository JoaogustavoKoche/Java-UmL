class iPhone implements ReprodutorMusical, AparelhoTelefonico, NavegadorInternet {
    // Implementações dos métodos das interfaces
    public void tocar() {
        System.out.println("Tocando...");
    }

    public void pausar() {
        System.out.println("Pausando...");
    }

    public void selecionarMusica() {
        System.out.println("Selecionado a musica");
    }

    public void ligar() {
        System.out.println("Ligando...");
    }

    public void atender() {
        System.out.println("Atendendo...");
    }

    public void iniciarCorreioVoz() {
        System.out.println("Iniciando Correio de voz");
    }

    public void exibirPagina() {
        System.out.println("Exibindo Pagina...");
    }

    public void adicionarNovaAba() {
        System.out.println("Adicionando uma nova Aba");
    }

    public void atualizarPagina() {
        System.out.println("Atualizando a pagina");
    }
}