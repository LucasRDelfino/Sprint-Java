package Ferramentas;

public class AgulhaCirurgica extends FerramentaCirurgica{
	private String tipoAgulhaCirurgica;

	public AgulhaCirurgica(String tipoAgulhaCirurgica) {
		super("Agulha Cirurgica", false);
		this.tipoAgulhaCirurgica = tipoAgulhaCirurgica;
	}
	
	public String getTipoAgulhaCirurgica() {
		return tipoAgulhaCirurgica;
	}

	public void setTipoAgulhaCirurgica(String tipoAgulhaCirurgica) {
		this.tipoAgulhaCirurgica = tipoAgulhaCirurgica;
	}
	

	
}
