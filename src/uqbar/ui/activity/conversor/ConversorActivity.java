package uqbar.ui.activity.conversor;

import uqbar.model.conversor.Conversor;
import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.TextView;

public class ConversorActivity extends Activity implements OnClickListener{
	
	private Conversor conversor = new Conversor();

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_conversor);
        
        findViewById(R.id.conversor_convertir).setOnClickListener(this);
    }

	public void onClick(View view) {
		String millas = ((TextView) findViewById(R.id.conversor_millas)).getText().toString();
		conversor.setMillas(Double.valueOf(millas));
		conversor.convertir();
		((TextView) findViewById(R.id.conversor_kilometros)).setText(String.valueOf(conversor.getKilometros()));
	}

}
