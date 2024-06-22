package Frutas;

//"Maçã"
public class Laranja extends Fruta{
	private String tipoLaranja;
	
	public Laranja(String tipoLaranja) {
		super("Laranja","Laranja", false, true, false);
		this.tipoLaranja = tipoLaranja;
		
	}
		
	public String getTipoLaranja() {
		return tipoLaranja;
	}
	public void setTipoLaranja(String tipoLaranja) {
		this.tipoLaranja = tipoLaranja;
	}

	
}
