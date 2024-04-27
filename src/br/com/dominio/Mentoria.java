package br.com.dominio;

import java.time.LocalDate;

public class Mentoria extends Conteudo {

    private LocalDate data;
    
	@Override
	public int calcularXp() {
		// TODO Auto-generated method stub
		return XP_PADRAO + 20;
	}

	public LocalDate getData() {
		return data;
	}

	public void setData(LocalDate data) {
		this.data = data;
	}

}
