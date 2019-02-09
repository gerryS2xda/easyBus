package exam.ium.di.easybus.populate;

import java.util.ArrayList;
import java.util.List;

import exam.ium.di.easybus.bean.Biglietto;
import exam.ium.di.easybus.bean.DatiConvalida;
import exam.ium.di.easybus.bean.Studente;

public class PopulateBiglietto {

//    Studente studente=new Studente();
    DatiConvalida con=new DatiConvalida();
    private List<Biglietto> biglietti=new ArrayList<Biglietto>();


    //metodi
    public List<Biglietto> popolaBiglietti(Studente stundente)
    {
        Studente stu=stundente;
        biglietti.add(new Biglietto(1, "AIR", "A1", "Avellino", "Nusco", 2, false, stu, con));
        biglietti.add(new Biglietto(2, "SITA", "E5", "Pompei", "Fisciano", 5.5, false, stu, con));
        return biglietti;
    }

    public void add(Biglietto b)
    {
        biglietti.add(b);
    }
    public void remove(Biglietto b)
    {
        biglietti.remove(b);
    }
    public int size()
    {
        return biglietti.size();
    }

    public void setBiglietti(List<Biglietto> biglietti) {
        this.biglietti = biglietti;
    }
    public List<Biglietto> getLista()
    {
        return this.biglietti;
    }
}
