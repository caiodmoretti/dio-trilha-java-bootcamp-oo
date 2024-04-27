package br.com.dominio;

import java.time.LocalDate;

public class Teste {

	public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("Curso Java OO");
        curso1.setDescricao("Descri��o do Curso Java OO");
        curso1.setCargaHoraria(10);

        Curso curso2 = new Curso();
        curso2.setTitulo("Curso MySql");
        curso2.setDescricao("Descri��o do Curso MySql");
        curso2.setCargaHoraria(15);
        
        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria de progress�o de carreira");
        mentoria.setDescricao("Descri��o Mentoria de progrress�o de carreira");
        mentoria.setData(LocalDate.now());
        
        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descri��o do Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);
        
        Dev devPaul = new Dev("Paul");
        devPaul.inscreverNoBootcamp(bootcamp);
        System.out.println("Experi�ncia do Dev Paul: " + devPaul.calcularTotalXp());
        System.out.println(devPaul.exibirCursos());
        devPaul.progredir(curso1);
        devPaul.progredir(curso2);
        devPaul.progredir(mentoria);
        System.out.println(devPaul.exibirCursos());
        System.out.println("Experi�ncia do Dev Paul: " + devPaul.calcularTotalXp());

 
	}

}
