package br.com.dominio;

public class Curso extends Conteudo {

    private int cargaHoraria;
    
	@Override
	public int calcularXp() {
		return XP_PADRAO * cargaHoraria;
	}
    public int getCargaHoraria() {
        return cargaHoraria;
    }

    public void setCargaHoraria(int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }
}
