package exam.ium.di.easybus.bean;

public class Autista extends Utente {

    //instance field
    private String matricola;

    //constructor
    public Autista(){
        super();
    }

    public Autista(String name, String cognome, String sesso, int eta, String username, String password, String matricola){
        super(name, cognome, sesso, eta, username, password);
        this.matricola = matricola;
    }

    public String getMatricola() {
        return matricola;
    }

    public void setMatricola(String matricola) {
        this.matricola = matricola;
    }
}
