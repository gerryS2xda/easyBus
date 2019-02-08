package exam.ium.di.easybus.bean;

public class Avviso {

    //instance field
    private int id;
    private String dataPubblicazione;
    private String azienda; //l'azienda che ha emanato questo avviso
    private String oggetto;  //qualcosa di sintetico che descrive il contenuto presente nel campo descrizione
    private String descrizione;

    //constructor
    public Avviso() {
        id = 0;
        dataPubblicazione = "";
        azienda = "";
        oggetto = "";
        descrizione = "";
    }
    // visibile agli utenti

    public Avviso(int id, String dataPubblicazione, String azienda, String oggetto, String descrizione) {
        this.id = id;
        this.dataPubblicazione = dataPubblicazione;
        this.azienda = azienda;
        this.oggetto = oggetto;
        this.descrizione = descrizione;
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

    public String getAzienda() {
        return azienda;
    }

    public void setAzienda(String azienda) {
        this.azienda = azienda;
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
}
