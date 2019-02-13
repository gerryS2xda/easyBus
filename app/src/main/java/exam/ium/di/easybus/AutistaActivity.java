package exam.ium.di.easybus;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.TextView;

import java.util.List;

import exam.ium.di.easybus.bean.Autista;
import exam.ium.di.easybus.populate.PopulateUserAccount;

public class AutistaActivity extends Activity {

    private Autista mAutistaLogged;
    private PopulateUserAccount mUserPopulate;
    private TextView mNomeAutista;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_autista);

        mUserPopulate = new PopulateUserAccount();
        Intent intent = getIntent();
        setAutistaLogged(intent.getIntExtra("AUTISTA_LOGGED", 0));

        mNomeAutista = findViewById(R.id.nomeAutista);
        mNomeAutista.setText(mAutistaLogged.getName());
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.autista_menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle item selection
        switch (item.getItemId()) {
            case R.id.dati_pers_item: break; //I miei dati
            case R.id.bachAvvItemStud: break; //Vai alla bacheca avvisi
            case R.id.logout_stud: break; //Logout
            case R.id.exit_btn: break; //Esci dall'applicazione
            default:
                return super.onOptionsItemSelected(item);
        }
        return true;
    }

    public void setAutistaLogged(int index){
        List<Autista> autisti = mUserPopulate.getAutisti();
        mAutistaLogged = autisti.get(index);
    }
}
