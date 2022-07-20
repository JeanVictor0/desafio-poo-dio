package br.com.dio.desafio.dominio;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class Bootcamp {
	private String nome;
	private String descricao;
	private final LocalDate data = LocalDate.now();
	private final LocalDate dataFinal = data.plusDays(75);
	private Set<Dev> devsInscritos = new HashSet<>();
	private Set<Conteudo> conteudos = new LinkedHashSet<>();
	
	
}