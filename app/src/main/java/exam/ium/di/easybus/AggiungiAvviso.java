package exam.ium.di.easybus;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import exam.ium.di.easybus.bean.Avviso;
import exam.ium.di.easybus.populate.PopulateAvviso;

public class AggiungiAvviso extends AppCompatActivity {

    private EditText titolo;
    private EditText descrizione;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_aggiungi_avviso);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);


        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }

    public void pubblica(View view) {
        titolo = view.findViewById(R.id.titolo);
        descrizione = view.findViewById(R.id.descrizione);
        PopulateAvviso avvisi = new PopulateAvviso();
        avvisi.add((String) titolo.getText().toString(),(String) descrizione.getText().toString());
        //svuoto i campi
        titolo.setText("");
        descrizione.setText("");

        Toast.makeText(this, "Avviso pubblicato", Toast.LENGTH_SHORT).show();
    }
}
