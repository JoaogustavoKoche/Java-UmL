public class Main {
    public static void main(String[] args) {
        iPhone myPhone = new iPhone();

        System.out.println("Funcoes do Reprodutor Musical");
        // Demonstrando funções de Reprodutor Musical
        myPhone.selecionarMusica();
        myPhone.tocar();
        myPhone.pausar();

        System.out.println("");

        // Demonstrando funções de Aparelho Telefônico
        System.out.println("Funcoes do aparelho telefonico");
        myPhone.ligar();
        myPhone.atender();
        myPhone.iniciarCorreioVoz();
        System.out.println("");

        System.out.println("Funcoes do Navegador de internet");
        // Demonstrando funções de Navegador na Internet
        myPhone.exibirPagina();
        myPhone.adicionarNovaAba();
        myPhone.atualizarPagina();
    }
}