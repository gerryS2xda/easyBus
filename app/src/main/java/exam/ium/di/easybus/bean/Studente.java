package exam.ium.di.easybus.bean;

import java.util.ArrayList;
import java.util.List;

public class Studente extends Utente {

    //instance field
    private CreditCard card;
    private List<Biglietto> biglietti;

    //constructor
    public Studente(){
        super();
        card = null;
        biglietti = new ArrayList<Biglietto>();
    }

    public Studente(String name, String cognome, String sesso, int eta, String username, String password, CreditCard card){
        super(name, cognome, sesso, eta, username, password);
        this.card = card;
        biglietti = new ArrayList<Biglietto>();
    }

    public CreditCard getCard() {
        return card;
    }

    public void setCard(CreditCard card) {

        this.card = card;
    }

    public List<Biglietto> getBiglietti() {
        return biglietti;
    }

    public void addBigliettiToList(Biglietto b){
        biglietti.add(b);
    }
}
