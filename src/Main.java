import java.time.LocalDate;

import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;

public class Main{
	public static void main(String[] args) {
		Curso curso = new Curso();
		Curso curso0 = new Curso();
		
		curso0.setTitulo("Curso js");
		curso0.setDescricao("Descricao curso js");
		curso0.setCargaHoraria(4);
		
		curso.setTitulo("Curso java");
		curso.setDescricao("Descricao curso java");
		curso.setCargaHoraria(8);
		
		Mentoria mentoria = new Mentoria();
		mentoria.setTitulo("Mentoria de java");
		mentoria.setDescricao("Descricao mentoria java");
		mentoria.setData(LocalDate.now());
		
		Bootcamp bootcamp = new Bootcamp();
		bootcamp.setNome("Bootcamp Java Developer");
		bootcamp.setDescricao("Descricao bootcamp Java Developer");
		bootcamp.getConteudos().add(curso);
		bootcamp.getConteudos().add(curso0);
		bootcamp.getConteudos().add(mentoria);
		
		Dev devCamila = new Dev();
		devCamila.setNome("Camila");
		devCamila.inscreverBootcamp(bootcamp);
		
		System.out.println("Conteudos incritos " + devCamila.getConteudosInscritos());
		devCamila.progredir();
		System.out.println("Conteudos concluidos " + devCamila.getConteudosConcluidos());
		System.out.println("Conteudos incritos " + devCamila.getConteudosInscritos());
		System.out.println("XP: " + devCamila.calcularXp());
		
		System.out.println();
		
		Dev devJoao = new Dev();
		devJoao.setNome("Joao");
		devJoao.inscreverBootcamp(bootcamp);
		
		System.out.println("Conteudos incritos " + devJoao.getConteudosInscritos());
		devJoao.progredir();
		System.out.println("Conteudos concluidos " + devJoao.getConteudosConcluidos());
		System.out.println("Conteudos incritos " + devJoao.getConteudosInscritos());
		System.out.println("XP: " + devJoao.calcularXp());
	}


}
