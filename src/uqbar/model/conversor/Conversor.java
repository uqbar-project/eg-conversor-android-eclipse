package uqbar.model.conversor;


public class Conversor  {
	private double millas;
	private double kilometros;

	// ********************************************************
	// ** Acciones
	// ********************************************************

	public void convertir() {
		this.kilometros = this.millas * 1.60934;
	}

	// ********************************************************
	// ** Atributos
	// ********************************************************

	public double getMillas() {
		return this.millas;
	}

	public void setMillas(final double millas) {
		this.validar(millas);
		this.millas = millas;
	}

	protected void validar(final double millas) {
		if(millas <0){
			throw new RuntimeException("No se puede convertir valores negativos");
		}
	}

	public double getKilometros() {
		return this.kilometros;
	}

	public void setKilometros(final double kilometros) {
		this.kilometros = kilometros;
	}

}
