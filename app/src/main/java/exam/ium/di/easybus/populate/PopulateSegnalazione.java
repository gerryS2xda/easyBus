package exam.ium.di.easybus.populate;

import java.util.ArrayList;
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

    public void add(Segnalazione segn) {
        segnalazioni.add(segn);
    }

    public void remuve(Segnalazione segn) {
        segnalazioni.remove(segn);
    }

    public int size() {
        return segnalazioni.size();
    }
}
