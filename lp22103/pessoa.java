package aula2103;

import java.util.Objects;

public class Pessoa {
	private String nome;
	private Rg identidade;
	
	public Pessoa () {
		this.nome = "";
		this.identidade = null;
	}
	public Pessoa (String nome, Rg rg) {
		this.nome = nome;
		this.identidade = rg;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Rg getIdentidade() {
		return identidade;
	}
	public void setIdentidade(Rg identidade) {
		this.identidade = identidade;
	}
	
	public int hashCode() {
		return Objects.hash(identidade, nome);
	}

	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Pessoa other = (Pessoa) obj;
		return Objects.equals(identidade, other.identidade) && Objects.equals(nome, other.nome);
	}
	
	public String toString() {
		return "Pessoa [nome=" + nome + ", identidade=" + identidade + "]";
	}
	
	
}

