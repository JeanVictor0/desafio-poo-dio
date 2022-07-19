import java.time.LocalDate;

import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Mentoria;

public class Main {
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
		
		System.out.println(curso);
		System.out.println(curso0);
		System.out.println(mentoria);
	}
}
