package aula2103;

import java.time.LocalDate;
import java.util.Objects;

public class Rg {
	
	private String numero;
	private LocalDate nascimento;
	
	public Rg () {
		this.numero = "";
		this.nascimento = LocalDate.now();
	}
	
	public Rg(String numero, Integer dia, Integer mes, Integer ano) {
		this.numero = numero;
		this.nascimento = LocalDate.of(ano, mes, dia);	
		}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public LocalDate getNascimento() {
		return nascimento;
	}

	public void setNascimento(LocalDate nascimento) {
		this.nascimento = nascimento;
	}

	public int hashCode() {
		return Objects.hash(nascimento, numero);
	}

	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Rg other = (Rg) obj;
		return Objects.equals(nascimento, other.nascimento) && Objects.equals(numero, other.numero);
	}

	public String toString() {
		return "Rg [numero=" + numero + ", nascimento=" + nascimento + "]";
	}
	
	
}

