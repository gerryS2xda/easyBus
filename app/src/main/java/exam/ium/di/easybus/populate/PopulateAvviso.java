package exam.ium.di.easybus.populate;

import android.util.Log;

import java.util.ArrayList;
import java.util.List;

import exam.ium.di.easybus.bean.Avviso;

public class PopulateAvviso {

    private List<Avviso> avvisi;

    public PopulateAvviso(){
        avvisi= new ArrayList<>();
    }

    //aggiustare le descrizioni
    public List<Avviso> populateAvviso() {
        avvisi.add(new Avviso(1, "8/02/2019","AIR","Disservizio","Nei mesi di marzo ci saranno dei disservizi per la tratta Fisciano - Avellino"));
        avvisi.add(new Avviso(2, "9/02/2019","SITA","Disservizio","La tratta Salerno - Fisciano è sospesa"));
        avvisi.add(new Avviso(3, "10/02/2019","Lo Conte","Ritardo","C'è un ritardo nella tratta Avellino - Fisciano sulla corsa delle 15:45 - 16:15"));
        avvisi.add(new Avviso(4, "10/02/2019","AIR","Disservizio","Nel giorno 27/02/2019 ci sarà un disserzio nella tratta Benevento - Fisciano a causa di una festa patronale"));
        avvisi.add(new Avviso(5, "10/02/2019","Lo Conte","Ritardo","C'è un ritardo nella tratta Avellino - Fisciano sulla corsa delle 9:45 - 10:15"));

        return avvisi;
    }

    public void add(Avviso av) {
        avvisi.add(av);
    }

    public void remuve(Avviso av) {
        avvisi.remove(av);
    }

    public int size() {
        return avvisi.size();
    }
}
