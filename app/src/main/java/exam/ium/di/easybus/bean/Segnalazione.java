package exam.ium.di.easybus.bean;

public class Segnalazione {

    public static final String[] TIPOLOGIA_SEGN = {"Guasto", "Emergenza", "Notifica", "Altro"};

    //instance field
    private int id;
    private String dataPubblicazione;
    private String mittente;
    private String destinatario;
    private String oggetto;
    private String descrizione;
    private String tipo; //tipologia di segnalazione guasti - sedile rotto - porte che non si aprono
    /*
    *  Le segnalazioni sono su eventuali cambi di turno, problematiche che si possono
     *  incontrare durante il tragitto, fermate che vengono saltate poiché il pullman è pieno, etc.
    * */

    // tra Autista e Impiegatod

    //constructor
    public Segnalazione() {
        id = 0;
        dataPubblicazione = "";
        mittente = "";
        destinatario = "";
        oggetto = "";
        descrizione = "";
        tipo = TIPOLOGIA_SEGN[3];
    }

    public Segnalazione(int id, String dataPubblicazione, String mittente, String destinatario, String oggetto, String descrizione, String tipo) {
        this.id = id;
        this.dataPubblicazione = dataPubblicazione;
        this.mittente = mittente;
        this.destinatario = destinatario;
        this.oggetto = oggetto;
        this.descrizione = descrizione;
        this.tipo = tipo;
    }

    //public methods

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDataPubblicazione() {
        return dataPubblicazione;
    }

    public void setDataPubblicazione(String dataPubblicazione) {
        this.dataPubblicazione = dataPubblicazione;
    }

    public String getMittente() {
        return mittente;
    }

    public void setMittente(String mittente) {
        this.mittente = mittente;
    }

    public String getDestinatario() {
        return destinatario;
    }

    public void setDestinatario(String destinatario) {
        this.destinatario = destinatario;
    }

    public String getOggetto() {
        return oggetto;
    }

    public void setOggetto(String oggetto) {
        this.oggetto = oggetto;
    }

    public String getDescrizione() {
        return descrizione;
    }

    public void setDescrizione(String descrizione) {
        this.descrizione = descrizione;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
}
