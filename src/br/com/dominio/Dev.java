package br.com.dominio;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class Dev extends Pessoa {
	private int experiencia;
    private Set<Conteudo> conteudosInscritos = new LinkedHashSet<>();
    private Set<Conteudo> conteudosConcluidos = new LinkedHashSet<>();

	public Dev(String nome) {
		super(nome);
		this.experiencia = 0;
	}

    
    public void inscreverNoBootcamp(Bootcamp bootcamp) {
    	bootcamp.inscreverDev(this);
    }
    
    public void progredir(Conteudo conteudo) {
    	if(this.conteudosInscritos.contains(conteudo)) {
    		this.conteudosInscritos.remove(conteudo);
    		this.experiencia += conteudo.calcularXp();
    		this.conteudosConcluidos.add(conteudo);
    	}else {
    		throw new IllegalArgumentException("O dev não está inscrito em " + conteudo.getTitulo());
    	}
    }

    public int calcularTotalXp() {
    	return this.experiencia;
    }
    
    public String exibirCursos() {
    	if(this.conteudosConcluidos.isEmpty() && this.conteudosInscritos.isEmpty()) {
    		return "O dev não possui cursos.";
    	}
    	String cursosString = "Cursos inscritos: ";
    	Iterator<Conteudo> iterator = this.conteudosInscritos.iterator();
    	while(iterator.hasNext()) {
    		cursosString += iterator.next().getTitulo() + " ";
    	}
    	cursosString += "\nCursos concluídos: ";
    	iterator = this.conteudosConcluidos.iterator();
    	while(iterator.hasNext()) {
    		cursosString += iterator.next().getTitulo() + " ";
    	}
    	return cursosString;
    }
    public Set<Conteudo> getConteudosInscritos() {
        return conteudosInscritos;
    }


	public int getExperiencia() {
		return experiencia;
	}


	public void setExperiencia(int experiencia) {
		this.experiencia = experiencia;
	}


	public Set<Conteudo> getConteudosConcluidos() {
		return conteudosConcluidos;
	}


	public void setConteudosConcluidos(Set<Conteudo> conteudosConcluidos) {
		this.conteudosConcluidos = conteudosConcluidos;
	}


	public void setConteudosInscritos(Set<Conteudo> conteudosInscritos) {
		this.conteudosInscritos = conteudosInscritos;
	}
    
    
}
