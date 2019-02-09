package exam.ium.di.easybus;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

import exam.ium.di.easybus.AdapterForList.AdapterAvviso;
import exam.ium.di.easybus.AdapterForList.AdapterBiglietto;
import exam.ium.di.easybus.R;
import exam.ium.di.easybus.bean.Biglietto;
import exam.ium.di.easybus.populate.PopulateBiglietto;


public class BigliettoActivity extends AppCompatActivity {
    private ListView lista;
    PopulateBiglietto p=new PopulateBiglietto();
    Biglietto biglietto=new Biglietto();
    List<Biglietto> biglietti=new ArrayList<Biglietto>();

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_biglietti);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        lista=findViewById(R.id.lista_biglietti);
        biglietti=p.getLista();
        AdapterBiglietto adapterBiglietto = new AdapterBiglietto(biglietti, this);

        lista.setAdapter(adapterBiglietto);


    }
}
