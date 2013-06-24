package uqbar.ui.conversor.activity;

import uqbar.android.mvc.binding.ModelBinder;
import uqbar.model.conversor.Conversor;
import uqbar.model.conversor.ConversorAppicationModel;
import android.app.Activity;
import android.os.Bundle;

public class ConversorActivity extends Activity {
	
	private ConversorAppicationModel model = new ConversorAppicationModel(new Conversor());
	private ModelBinder binder;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_conversor);
        
		this.binder = new ModelBinder(this, model)
			.property(R.id.conversor_millas, "millas") //
			.property(R.id.conversor_kilometros, "kilometros") //
			.action(R.id.conversor_convertir, "convertir") //
			.when(ConversorAppicationModel.Events.CONVERTIR, "actializarResultado") //
			.updateView();
    }
    
    
    public void actializarResultado(){
    	binder.updateView();
    }

}
