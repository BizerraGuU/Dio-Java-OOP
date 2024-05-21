package Funcs;

import Funcionalidades.Internet.copy.NavegadorInternet;
import Funcionalidades.ReprodutorMusical.copy.ReprodutorMusical;
import Funcionalidades.Telefone.copy.AparelhoTelefonico;

public abstract class Funcionalidades implements NavegadorInternet, AparelhoTelefonico, ReprodutorMusical {
	
	public void tocar() {
		System.out.println("Você está tocando uma música");
	}
	
	public void pausar() {
		System.out.println("Você pausou a música");
	}
	
	public void selecionarMusica(String musica) {
		System.out.println("Você selecionou a musica: " + musica);
	}
	
	public void ligar(String numero) {
		System.out.println("Você está ligando para o número: " + numero);
	}

	public void atender() {
		System.out.println("Você atendeu!");
	}
	
	public void inciarCorreioVoz() {
		System.out.println("Você iniciou um correio de voz!");
	}
	
	public void exibirPagina(String url) {
		System.out.println("Você acessou à URL: " + url);
	}
	
	public void adicionarNovaAba() {
		System.out.println("Você adicionou uma nova aba!");
	}
	
	public void atualizarPagina() {
		System.out.println("Você atualizou a pagina");
	}

}
