package exam.ium.di.easybus;

import android.content.Context;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Spinner;

import java.util.List;

import exam.ium.di.easybus.AdapterForList.AdapterAvviso;
import exam.ium.di.easybus.bean.Avviso;
import exam.ium.di.easybus.populate.PopulateAvviso;

public class VisualizzaAvvisiActivity extends AppCompatActivity {

    private Spinner spinner;
    private ListView lista;
    private AdapterAvviso adapterAvviso;
    private PopulateAvviso populateAvviso;
    private Context context=this;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_visualizza_avvisi);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

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
                List<Avviso> avvisi= populateAvviso.getByAzienda(azienda);
                lista.deferNotifyDataSetChanged();
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

        //lista view
        populateAvviso= new PopulateAvviso();
        lista= findViewById(R.id.listaAvvisi);
        adapterAvviso=new AdapterAvviso(this,populateAvviso.getByAzienda("AIR"));
        lista.setAdapter(adapterAvviso);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }

}
