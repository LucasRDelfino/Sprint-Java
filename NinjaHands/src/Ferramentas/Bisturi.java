package Ferramentas;

public class Bisturi extends FerramentaCirurgica{
	private String tipoBisturi;

	public Bisturi(String tipoBisturi) {
		super("Bisturi", false);
		this.tipoBisturi = tipoBisturi;
	}
	
	public String getTipoBisturi() {
		return tipoBisturi;
	}

	public void setTipoBisturi(String tipoBisturi) {
		this.tipoBisturi = tipoBisturi;
	}

}
