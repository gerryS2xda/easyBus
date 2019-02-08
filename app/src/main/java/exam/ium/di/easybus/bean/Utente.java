package exam.ium.di.easybus.bean;

public abstract class Utente {

    //instance field
    private String name;
    private String cognome;
    private String sesso;
    private int eta;
    private String username;
    private String password;

    //constructor
    public Utente(){
        name = "";
        cognome = "";
        sesso = "";
        eta = 0;
        username = "";
        password = "";
    }

    public Utente(String name, String cognome, String sesso, int eta, String username, String password) {
        this.name = name;
        this.cognome = cognome;
        this.sesso = sesso;
        this.eta = eta;
        this.username = username;
        this.password = password;
    }

    //getter
    public String getName() {
        return name;
    }

    public String getCognome() {
        return cognome;
    }

    public String getSesso() {
        return sesso;
    }

    public int getEta() {
        return eta;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    //setter
    public void setName(String name) {
        this.name = name;
    }

    public void setCognome(String cognome) {
        this.cognome = cognome;
    }

    public void setSesso(String sesso) {
        this.sesso = sesso;
    }

    public void setEta(int eta) {
        this.eta = eta;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    //other method
}
