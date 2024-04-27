package br.com.dominio;

import java.time.LocalDate;

public class Teste {

	public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("Curso Java OO");
        curso1.setDescricao("Descrição do Curso Java OO");
        curso1.setCargaHoraria(10);

        Curso curso2 = new Curso();
        curso2.setTitulo("Curso MySql");
        curso2.setDescricao("Descrição do Curso MySql");
        curso2.setCargaHoraria(15);
        
        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria de progressão de carreira");
        mentoria.setDescricao("Descrição Mentoria de progrressão de carreira");
        mentoria.setData(LocalDate.now());
        
        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição do Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);
        
        Dev devPaul = new Dev("Paul");
        devPaul.inscreverNoBootcamp(bootcamp);
        System.out.println("Experiência do Dev Paul: " + devPaul.calcularTotalXp());
        System.out.println(devPaul.exibirCursos());
        devPaul.progredir(curso1);
        devPaul.progredir(curso2);
        devPaul.progredir(mentoria);
        System.out.println(devPaul.exibirCursos());
        System.out.println("Experiência do Dev Paul: " + devPaul.calcularTotalXp());

 
	}

}
