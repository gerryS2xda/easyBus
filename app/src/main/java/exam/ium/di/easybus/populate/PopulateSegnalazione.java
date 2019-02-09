package exam.ium.di.easybus.populate;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import exam.ium.di.easybus.bean.Segnalazione;

public class PopulateSegnalazione {

    private List<Segnalazione> segnalazioni;

    public PopulateSegnalazione() {
        segnalazioni = new ArrayList<>();
    }

    public List<Segnalazione> populateSegnalazione() {
        segnalazioni.add(new Segnalazione(1,"8/02/2019","Rocco Lo Conte","","Avaria motore","","guasti"));

        return segnalazioni;
    }

    public void add(String oggetto, String tipo, String descrizione) {
        Segnalazione segn=new Segnalazione();
        segn.setId(segnalazioni.size()+1);
        segn.setOggetto(oggetto);
        segn.setTipo(tipo);
        segn.setDescrizione(descrizione);

        //data odierna
        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
        Date date = new Date();
        segn.setDataPubblicazione(formatter.format(date));

        //set mittente e destinatario

        segnalazioni.add(segn);
    }

    public void remuve(Segnalazione segn) {
        segnalazioni.remove(segn);
    }

    public int size() {
        return segnalazioni.size();
    }
}
