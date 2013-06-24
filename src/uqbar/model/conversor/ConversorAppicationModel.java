package uqbar.model.conversor;

import uqbar.android.mvc.binding.BusinessEvent;
import uqbar.android.mvc.binding.ObservableObject;

public class ConversorAppicationModel extends ObservableObject {
	
	private final Conversor model;

	public enum Events implements BusinessEvent {
		CONVERTIR
	}
	
	public ConversorAppicationModel(Conversor conversor) {
		this.model = conversor;
	}
	
	public void convertir(){
		this.model.convertir();
		fireEvent(Events.CONVERTIR);
	}

	public Conversor getModel() {
		return model;
	}
	
	public String getMillas(){
		return String.valueOf(this.model.getMillas());
	}
	
	public void setMillas(String millas){
		this.model.setMillas(Double.parseDouble(millas));
	}
	
	public String getKilometros(){
		return String.valueOf(this.model.getKilometros());
	}
	
	public void setKilometros(String kilometros){
		this.model.setKilometros(Double.parseDouble(kilometros));
	}

}
