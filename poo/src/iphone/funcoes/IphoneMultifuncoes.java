package iphone.funcoes;
import iphone.funcoes.internet.NavegadorInternet;
import iphone.funcoes.telefone.AparelhoTelefonico;
import iphone.funcoes.musica.ReprodutorMusical;


public class IphoneMultifuncoes implements AparelhoTelefonico, NavegadorInternet, ReprodutorMusical {
	public void ligar(String numero) {
		System.out.println("Ligando para o numero " + numero);
	}
	public void atender() {
		System.out.println("Atentendo ligacao");
	}
	public void iniciarCorreioVoz() {
		System.out.println("Iniciando correio de voz");
	}
	public void exibirPagina(String url) {
		System.out.println("Exibindo pagina " + url);
	}
	public void adicionarNovaPagina() {
		System.out.println("Adicionando nova pagina web");
	}
	public void atualizarPagina() {
		System.out.println("Atualizando pagina web");
	}
	public void tocar() {
		System.out.println("Tocando musica");
	}
	public void pausar() {
		System.out.println("Pausando musica");
	}
	public void selecionandoMusica(String musica) {
		System.out.println("Selecionando musica " + musica);	
	}
	

}
