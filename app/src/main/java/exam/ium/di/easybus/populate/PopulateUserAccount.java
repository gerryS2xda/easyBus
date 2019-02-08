package exam.ium.di.easybus.populate;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import java.util.Random;
import exam.ium.di.easybus.bean.CreditCard;
import exam.ium.di.easybus.bean.Studente;
import exam.ium.di.easybus.bean.Autista;
import exam.ium.di.easybus.bean.Impiegato;

public class PopulateUserAccount {

    public PopulateUserAccount(){
        //vuoto -- possibile utilizzo di un attributo type per il tipo di utente
    }

    //riempi automaticamente una lista di studenti (5)
    public List<Studente> populateStudent(){
        List<Studente> studenti = new ArrayList<Studente>();
        studenti.add(new Studente("Gerardo", "Laucella", "M", 22, "gerrys2xda", "123asd", createCreditCardRandom()));
        studenti.add(new Studente("Rocco", "Lo Conte", "M", 22, "rloConte22", "123asd", createCreditCardRandom()));
        studenti.add(new Studente("Laura", "Rossi", "F", 19, "lauraF19", "123asd", createCreditCardRandom()));
        studenti.add(new Studente("Nicola", "Di Bello", "M", 21, "nicoDiB21", "123asd", createCreditCardRandom()));
        studenti.add(new Studente("Chiara", "De Luca", "F", 20, "chdeluca20", "123asd", createCreditCardRandom()));
        studenti.add(new Studente("Gennaro", "Teodoro", "M", 20, "gennTeodoro20", "123asd", createCreditCardRandom()));
        studenti.add(new Studente("Francesco", "Maddaloni", "M", 20, "frankMad20", "123asd", createCreditCardRandom()));
        studenti.add(new Studente("Gianluca", "Di Lillo", "M", 21, "gianDiLillo21", "123asd", createCreditCardRandom()));
        return studenti;
    }

    //riempi automaticamente una lista di autisti (2)
    public List<Autista> populateAutisti(){
        List<Autista> autisti = new ArrayList<Autista>();
        autisti.add(new Autista("Andrea", "Laucella", "M", 49, "andrLauc72", "123asd", generateMatricola()));
        autisti.add(new Autista("Giuseppe", "Paolisi", "M", 38, "gpaolisi", "123asd", generateMatricola()));
        return autisti;
    }

    //riempi automaticamente una lista di impiegati (2)
    public List<Impiegato> populateImpiegati(){
        List<Impiegato> impiegati = new ArrayList<Impiegato>();
        impiegati.add(new Impiegato("Giacomo", "Ressa", "M", 38, "giacRessa38", "123asd", generateMatricola()));
        impiegati.add(new Impiegato("Antonio", "Cerasuolo", "M", 34, "antoCeras22", "123asd", generateMatricola()));
        return impiegati;
    }

    public CreditCard createCreditCardRandom(){
        CreditCard card = new CreditCard();
        Random r = new Random();
        //crea automaticamente il codice (es. 122-504-535-123)
        String code = "";
        for(int i = 0; i < 4; i++){
            code += "" + r.nextInt(999);
            code += "-";
        }
        code = code.substring(0, code.length() - 1); //rimuovi ultima '-'
        card.setCodice(code);

        //crea automaticamente il CVV (es. 1-2-3)
        String cvv = "";
        for(int i = 0; i < 3; i++){
            int n = r.nextInt(9) + 1;
            cvv += "" + n;
            cvv += "-";
        }
        cvv = cvv.substring(0, cvv.length() - 1); //rimuovi ultima '-'
        card.setCvv(cvv);

        //setta la data di scadenza
        Calendar cal = Calendar.getInstance();
        SimpleDateFormat dateFormat = new SimpleDateFormat("MM-yyyy");
        cal.add(Calendar.YEAR, r.nextInt(4) + 1);
        card.setDataScadenza(dateFormat.format(cal.getTime()));
        return card;
    }

    public String generateMatricola(){
        String str = "05121-";
        Random r = new Random();
        str += r.nextInt(1000);
        return str;
    }
}
