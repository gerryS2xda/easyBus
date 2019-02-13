package exam.ium.di.easybus;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import java.util.ArrayList;

import exam.ium.di.easybus.bean.Autista;
import exam.ium.di.easybus.bean.Impiegato;
import exam.ium.di.easybus.bean.Studente;
import exam.ium.di.easybus.populate.PopulateUserAccount;

public class MainActivity extends Activity {

    private PopulateUserAccount mUserPopulate;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome);

        //init variable
        mUserPopulate = new PopulateUserAccount();

        TextView mRegistrationLink = findViewById(R.id.regTxt_click);
        Utils.makeTextViewHyperlink(mRegistrationLink);
        mRegistrationLink.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(), RegistrationStudentActivity.class);
                i.setFlags(i.getFlags() | Intent.FLAG_ACTIVITY_NO_HISTORY);
                startActivityForResult(i, 75);
            }
        });

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

    public void openLoginDialog(View btn){
        LayoutInflater inflater = LayoutInflater.from(this);
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setTitle("Accedi");
        View v = inflater.inflate(R.layout.dialog_login, null);
        builder.setView(v);

        final EditText mUsername = v.findViewById(R.id.edt_username);
        final EditText mPwd = v.findViewById(R.id.edt_pwd);

        //add action Buttons
        builder.setPositiveButton("Accedi", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                autenticaAndSubmit(mUsername.getText().toString(), mPwd.getText().toString());
            }
        });

        builder.setNegativeButton("Annulla", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                dialog.dismiss();
            }
        });
        AlertDialog dialog = builder.create();
        dialog.show();
    }

    public void autenticaAndSubmit(String username, String pwd){
        boolean flag = false;
        Bundle b = new Bundle();
        int pos = 0;

        //check studente
        int i = 0;
        for(Studente s : mUserPopulate.getStudenti()){
            if(s.getUsername().equals(username) && s.getPassword().equals(pwd)){
                pos = i;
                flag = true;
                break;
            }
            i++;
        }

        if(!flag) { //non e' uno studente
            i = 0;
            for (Autista a : mUserPopulate.getAutisti()) {
                if (a.getUsername().equals(username) && a.getPassword().equals(pwd)) {
                    pos = i;
                    flag = true;
                    break;
                }
                i++;
            }
        }else{
            Intent intent = new Intent(getApplicationContext(), StudentActivity.class);
            intent.putExtra("STUD_LOGGED", pos);
            startActivity(intent);
            flag = false;
        }

        if(!flag){    //non e' un autista
            i = 0;
            for(Impiegato imp : mUserPopulate.getImpiegati()) {
                if (imp.getUsername().equals(username) && imp.getPassword().equals(pwd)) {
                    pos = i;
                    flag = true;
                    break;
                }
                i++;
            }
        }else{
            Intent intent = new Intent(getApplicationContext(), AutistaActivity.class);
            intent.putExtra("AUTISTA_LOGGED", pos);
            startActivity(intent);
            flag = false;
        }

        if(!flag){ //mostra alert di input inseriti non validi
            AlertDialog.Builder builder = new AlertDialog.Builder(this);
            builder.setTitle("Accedi");
            builder.setMessage("Username o password non validi!! Riprova");
            builder.setPositiveButton("Ok", null);
            AlertDialog dialog = builder.create();
            dialog.show();
        }else{
            Intent intent = new Intent(getApplicationContext(), ImpiegatoActivity.class);
            intent.putExtra("IMP_LOGGED", pos);
            startActivity(intent);
        }

    }

    public void onActivityResult(int requestCode, int resultCode, Intent data){
        if(requestCode != 75 && resultCode != Activity.RESULT_OK && data == null) return;
        ArrayList<String> valori = data.getStringArrayListExtra("NEW_STUD");
        Studente s = new Studente();
        s.setName(valori.get(0));
        s.setCognome(valori.get(1));
        s.setEta(Integer.parseInt(valori.get(2)));
        s.setUsername(valori.get(3));
        s.setPassword(valori.get(4));
        s.setSesso(valori.get(5));
        mUserPopulate.addStudente(s);
    }


}
