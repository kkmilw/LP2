
public class Carro {
	private String marca;
	private String modelo;
	private String cor;
	
	public Carro() {
		this.marca = "";
		this.modelo = "";
		this.cor = "";
	}
	
	public Carro(String modelo, String marca, String cor) {
		this.marca = marca;
		this.modelo = modelo;
		this.cor = cor;
	}
	
	public Carro (String marca) {
		this.marca = marca;
		this.modelo = "";
		this.cor = "";
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}
	
	public String toString() {
		return "modelo: " + this.modelo + "marca: " + this.marca + "cor: " + this.cor;
	}
	
	public boolean equals(Object obj) {
		if(this==obj)
			return true;
		if(obj==null)
			return false;
		if(getClass() != obj.getClass())
			return false;
		
		Carro other = (Carro) obj;
		
		if(this.modelo == null) {
			if(other.modelo != null)
				return false;
		}else if(! this.modelo.equals(other.modelo))
			return false;

		
		if(this.marca == null) {
			if(other.marca != null)
				return false;
		}else if (! this.marca.equals(other.marca))
			return false;

		
		if(this.cor == null) {
			if(other.cor != null)
				return false;
		}else if (! this.cor.equals(other.cor))
			return false;
		
		
		return true;
		
	}
	
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((modelo == null)? 0: modelo.hashCode());
		result = prime * result + ((marca == null)? 0: marca.hashCode());
		result = prime * result + ((cor == null)? 0: cor.hashCode());
		return result;
	
	}

}
	

