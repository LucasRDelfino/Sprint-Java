package Ferramentas;

public class Pinça extends FerramentaCirurgica{
	private String tipoPinça;
	
	public Pinça(String tipoPinça) {
		super("Bisturi", false);
		this.tipoPinça = tipoPinça;
	}
	
	public String getTipoPinça() {
		return tipoPinça;
	}

	public void setTipoPinça(String tipoPinça) {
		this.tipoPinça = tipoPinça;
	}
	
}
