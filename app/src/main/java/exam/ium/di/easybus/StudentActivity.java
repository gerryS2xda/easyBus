package exam.ium.di.easybus;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.TextView;

import java.util.List;

import exam.ium.di.easybus.bean.Studente;
import exam.ium.di.easybus.populate.PopulateUserAccount;

public class StudentActivity extends Activity {

    private Studente mStudentLogged;
    private PopulateUserAccount mUserPopulate;
    private TextView mNomeStudente;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_student);

        mUserPopulate = new PopulateUserAccount();
        Intent intent = getIntent();
        setStudentLogged(intent.getIntExtra("STUD_LOGGED", 0));

        mNomeStudente = findViewById(R.id.nome_studente);
        mNomeStudente.setText(mStudentLogged.getName());


    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.student_menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle item selection
        switch (item.getItemId()) {
            case R.id.dati_pers_item: break; //I miei dati
            case R.id.tratta_prefs: break; //Tratta preferita
            case R.id.bachAvvItemStud: break; //Vai alla bacheca avvisi
            case R.id.logout_stud: break; //Logout
            case R.id.exit_btn: break; //Esci dall'applicazione
            default:
                return super.onOptionsItemSelected(item);
        }
        return true;
    }

    public void setStudentLogged(int index){
        List<Studente> studenti = mUserPopulate.getStudenti();
        mStudentLogged = studenti.get(index);
    }
}
