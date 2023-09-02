package aula2103;

import java.util.Objects;

public class Aluno extends Pessoa {
	
	private String prontuario;
	
	public Aluno () {
		super ();
		this.prontuario = "";
	}
	
	public Aluno (String nome, Rg rg, String prontuario) {
		super (nome, rg);
		this.prontuario = prontuario;
	}

	public String getProntuario() {
		return prontuario;
	}

	public void setProntuario(String prontuario) {
		this.prontuario = prontuario;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + Objects.hash(prontuario);
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		Aluno other = (Aluno) obj;
		return Objects.equals(prontuario, other.prontuario);
	}

	@Override
	public String toString() {
		return super.toString() + "Aluno [prontuario=" + prontuario + "]";
	}
	
	
}

