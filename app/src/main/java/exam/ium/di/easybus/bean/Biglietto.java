package exam.ium.di.easybus.bean;

public class Biglietto {

    //instance field
    private int id;
    private String azienda; //nome della azienda
    private String fascia; //es. AC1
    private String partenza;
    private String arrivo;
    private double prezzo;
    private boolean stato; //se convalidato --> true
    private Studente studente;

    //constructor
    public Biglietto(){
        id = 0;
        azienda = "";
        fascia = "";
        partenza = "";
        arrivo = "";
        prezzo = 0;
        stato = false;
        studente = new Studente();
    }

    public Biglietto(int id, String azienda, String fascia, String partenza, String arrivo, double prezzo, boolean stato, Studente studente) {
        this.id = id;
        this.azienda = azienda;
        this.fascia = fascia;
        this.partenza = partenza;
        this.arrivo = arrivo;
        this.prezzo = prezzo;
        this.stato = stato;
        this.studente = studente;
    }

    //public methods
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAzienda() {
        return azienda;
    }

    public void setAzienda(String azienda) {
        this.azienda = azienda;
    }

    public String getFascia() {
        return fascia;
    }

    public void setFascia(String fascia) {
        this.fascia = fascia;
    }

    public String getPartenza() {
        return partenza;
    }

    public void setPartenza(String partenza) {
        this.partenza = partenza;
    }

    public String getArrivo() {
        return arrivo;
    }

    public void setArrivo(String arrivo) {
        this.arrivo = arrivo;
    }

    public double getPrezzo() {
        return prezzo;
    }

    public void setPrezzo(double prezzo) {
        this.prezzo = prezzo;
    }

    public boolean isConvalidato() {
        return stato;
    }

    public void setStato(boolean stato) {
        this.stato = stato;
    }

    public Studente getStudente() {
        return studente;
    }

    public void setStudente(Studente studente) {
        this.studente = studente;
    }
}
