package exam.ium.di.easybus;

import android.content.Context;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Spinner;
import android.widget.Toast;

import java.util.List;

import exam.ium.di.easybus.AdapterForList.AdapterAvviso;
import exam.ium.di.easybus.bean.Avviso;
import exam.ium.di.easybus.populate.PopulateAvviso;

public class VisualizzaAvvisiActivity extends AppCompatActivity {

    private Spinner spinner;
    private ListView lista;
    private AdapterAvviso adapterAvviso;
    private PopulateAvviso populateAvviso;
    private List<Avviso> avvisi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_visualizza_avvisi);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        populateAvviso= new PopulateAvviso();
        lista= findViewById(R.id.listaAvvisi);

        //spinner
        spinner = (Spinner) findViewById(R.id.aziende);
        // Create an ArrayAdapter using the string array and a default spinner layout
        final ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this,
                R.array.aziende, android.R.layout.simple_spinner_item);
        // Specify the layout to use when the list of choices appears
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        // Apply the adapter to the spinner
        spinner.setAdapter(adapter);

        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

                String azienda = parent.getItemAtPosition(position).toString();
                avvisi = populateAvviso.getByAzienda(azienda);
                //Log.d("MYGEBUD",""+avvisi.get(0));
                if(avvisi != null) {
                    adapterAvviso=new AdapterAvviso(getApplicationContext(),avvisi);
                    lista.setAdapter(adapterAvviso);
                }
                if(avvisi.size() ==0){
                    Avviso av=new Avviso();
                    av.setOggetto("Non ci sono avvisi");
                    avvisi.add(av);
                    adapterAvviso=new AdapterAvviso(getApplicationContext(),avvisi);
                    lista.setAdapter(adapterAvviso);
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });



        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }

}
