package exam.ium.di.easybus;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;

public class WelcomeActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome);
    }

    //utilizzo di un menu per evitare di usare i pulsanti di Visualizza orari e bacheca avviso
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.welcome_menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle item selection
        switch (item.getItemId()) {
            case R.id.bachAvvItem: break; //Vai alla bacheca avvisi
            case R.id.exit_btn: break; //Esci dall'applicazione
            default:
                return super.onOptionsItemSelected(item);
        }
        return true;
    }
}
