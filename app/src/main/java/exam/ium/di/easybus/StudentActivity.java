package exam.ium.di.easybus;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;

public class StudentActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_student);
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
}
