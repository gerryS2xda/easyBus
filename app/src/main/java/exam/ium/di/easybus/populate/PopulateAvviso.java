package exam.ium.di.easybus.populate;

import android.util.Log;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Random;

import exam.ium.di.easybus.bean.Avviso;

public class PopulateAvviso {

    private List<Avviso> avvisi;
    private String [] aziende = {"AIR", "SITA", "Lo Conte", "Marozzi", "Flix Bus"};

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

    public void add(String titolo, String descrizione) {
        Avviso av = new Avviso();
        //setto l'id
        av.setId(avvisi.size()+1);

        //setto la data odierana
        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
        Date date = new Date();
        av.setDataPubblicazione(formatter.format(date));

        //oggetto = titolo
        av.setOggetto(titolo);
        av.setDescrizione(descrizione);

        //azienda casuale
        Random random = new Random();
        av.setAzienda(aziende[random.nextInt(aziende.length)-1]);
        avvisi.add(av);
    }

    public void remuve(Avviso av) {
        avvisi.remove(av);
    }

    public int size() {
        return avvisi.size();
    }

    public Avviso get(int position) {
        return avvisi.get(position);
    }
     public List<Avviso> getByAzienda(String azienda) {
        List<Avviso> list = new ArrayList<>();
        for(int i=0;i<avvisi.size();i++) {
            if(avvisi.get(i).equals(azienda)) {
                list.add(avvisi.get(i));
            }
        }
        return  list;
     }
}
