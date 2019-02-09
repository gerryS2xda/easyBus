package exam.ium.di.easybus;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

import exam.ium.di.easybus.populate.PopulateSegnalazione;

public class SegnalazioneActivity extends AppCompatActivity {

    private EditText oggetto;
    private Spinner spinner;
    private EditText descrizione;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_segnalazione);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        //spinner
        spinner = (Spinner) findViewById(R.id.tipo);
        // Create an ArrayAdapter using the string array and a default spinner layout
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this,
                R.array.tipo_segnalazione, android.R.layout.simple_spinner_item);
        // Specify the layout to use when the list of choices appears
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        // Apply the adapter to the spinner
        spinner.setAdapter(adapter);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }

    public void invia(View view) {
        oggetto=view.findViewById(R.id.oggetto);
        String tipo=(String) spinner.getSelectedItem();
        descrizione= view.findViewById(R.id.descrizione);
        String og=oggetto.getText().toString();
        String desc=descrizione.getText().toString();

        PopulateSegnalazione populateSegnalazione=new PopulateSegnalazione();
        populateSegnalazione.add(og,desc,tipo);//manca mittente e destinatario

        oggetto.setText("");
        descrizione.setText("");

        Toast.makeText(this, "Segnalazione inviata", Toast.LENGTH_SHORT).show();
    }
}
