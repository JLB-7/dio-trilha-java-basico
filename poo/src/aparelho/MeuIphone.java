package aparelho;

import iphone.funcoes.internet.NavegadorInternet;
import iphone.funcoes.telefone.AparelhoTelefonico;
import iphone.funcoes.musica.ReprodutorMusical;

import iphone.funcoes.IphoneMultifuncoes;

public class MeuIphone {
	public static void main(String[] args) {
		IphoneMultifuncoes im = new IphoneMultifuncoes();
		NavegadorInternet NavegadorInternet = im;
		AparelhoTelefonico AparelhoTelefonico = im;
		ReprodutorMusical ReprodutorMusical = im;

		NavegadorInternet.exibirPagina("Apple.com");
		NavegadorInternet.adicionarNovaPagina();
		NavegadorInternet.atualizarPagina();
		
		AparelhoTelefonico.ligar("XX 98XXX-XXXX");
		AparelhoTelefonico.atender();
		AparelhoTelefonico.iniciarCorreioVoz();
		
		ReprodutorMusical.selecionandoMusica("Gone, Gone, Gone - Phillip Phillips");
		ReprodutorMusical.tocar();
		ReprodutorMusical.pausar();
	}
}