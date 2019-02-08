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

    public List<Avviso> populateAvviso() {
        avvisi.add(new Avviso(1, "8/02/2019","AIR","Disservizio","Nei mesi di marzo ci saranno dei disservizi per la tratta Fisciano - Avellino"));


        return avvisi;
    }
}
