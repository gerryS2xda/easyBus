package exam.ium.di.easybus;

import android.annotation.SuppressLint;
import android.app.Dialog;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

import exam.ium.di.easybus.AdapterForList.AdapterBiglietto;
import exam.ium.di.easybus.bean.Biglietto;
import exam.ium.di.easybus.bean.Studente;
import exam.ium.di.easybus.populate.PopulateBiglietto;

public class BigliettoActivity extends AppCompatActivity {

    private ListView lista;
    private PopulateBiglietto p=new PopulateBiglietto();
    private Biglietto biglietto=new Biglietto();
    private List<Biglietto> biglietti=new ArrayList<Biglietto>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_biglietto);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        lista=findViewById(R.id.lista_biglietti);
        biglietti=p.popolaBiglietti(new Studente());
        AdapterBiglietto adapterBiglietto = new AdapterBiglietto(biglietti, this);

        lista.setAdapter(adapterBiglietto);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);


    }

    public void convalida(View view) throws InterruptedException {

        //dialog qrcode
        final Dialog dialog = new Dialog(this);

        dialog.setContentView(R.layout.layout_dialog);
//        dialog.setTitle("poggia il dispositivo sullo scanner...");
        ImageView image = (ImageView) dialog.findViewById(R.id.image);

        dialog.show();
        Toast.makeText(this,"poggia il dispositivo sullo scanner...",Toast.LENGTH_LONG).show();

    }

}
