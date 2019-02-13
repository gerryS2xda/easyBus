package exam.ium.di.easybus;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;

import java.util.ArrayList;

public class RegistrationStudentActivity extends AppCompatActivity {

    private EditText mNome;
    private EditText mCognome;
    private EditText mEta;
    private EditText mUsername;
    private EditText mPassword;
    private RadioButton mSessoM;
    private RadioButton mSessoF;
    private ArrayList<String> valori;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reg_student);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        //inizializza gli oggetti
        valori = new ArrayList<String>();
        mNome = findViewById(R.id.edt_reg_name);
        mCognome = findViewById(R.id.edt_reg_cognome);
        mEta = findViewById(R.id.edt_reg_eta);
        mUsername = findViewById(R.id.edt_reg_username);
        mPassword = findViewById(R.id.reg_pwd);
        mSessoM = findViewById(R.id.radio_m);
        mSessoF = findViewById(R.id.radio_f);

        setReturnIntent();
    }

    public void procediRegistrationButton(View v){

        ArrayList<String> valori = new ArrayList<String>();

        String name = mNome.getText().toString();

        valori.add(name);
        String cognome = mCognome.getText().toString();

        valori.add(cognome);
        String eta = mEta.getText().toString();

        valori.add(eta);
        String username = mUsername.getText().toString();

        valori.add(username);
        String password = mPassword.getText().toString();

        valori.add(password);
        String sesso = "";

        if(mSessoF.isChecked()){
            sesso += "F";
            valori.add(sesso);
        }else if(mSessoM.isChecked()){
            sesso += "M";
            valori.add(sesso);
        }

        setReturnIntent();
    }

    public void setReturnIntent(){
        //costruisci il risultato
        Intent data = new Intent();
        if(valori.size() == 0) {
            data = null;
        }else{
            data.putStringArrayListExtra("NEW_STUD", valori);
        }

        setResult(RESULT_OK, data);
    }
}


