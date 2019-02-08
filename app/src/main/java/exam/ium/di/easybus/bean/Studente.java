package exam.ium.di.easybus.bean;

public class Studente extends Utente {

    //instance field
    private CreditCard card;

    //constructor
    public Studente(){
        super();
    }

    public Studente(String name, String cognome, String sesso, int eta, String username, String password, CreditCard card){
        super(name, cognome, sesso, eta, username, password);
        this.card = card;
    }

    public CreditCard getCard() {

        return card;
    }

    public void setCard(CreditCard card) {

        this.card = card;
    }
}
