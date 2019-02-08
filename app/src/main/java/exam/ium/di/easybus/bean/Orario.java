package exam.ium.di.easybus.bean;

import java.time.LocalDate;

public class Orario {

    //instance field
    private int id;
    private String azienda;
    private String dataPartenza;
    private Percorso tratta;
    private int numeroCambi;

    //constructor
    public Orario(){
        id = 0;
        azienda = "";
        dataPartenza = "";
        numeroCambi = -1;
        tratta = new Percorso();
    }


    public Orario(int id, String azienda, String dataPartenza, int numeroCambi, Percorso tratta) {
        this.id = id;
        this.azienda = azienda;
        this.dataPartenza = dataPartenza;
        this.numeroCambi = numeroCambi;
        this.tratta = tratta;
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

    public String getDataPartenza() {
        return dataPartenza;
    }

    public void setDataPartenza(String dataPartenza) {
        this.dataPartenza = dataPartenza;
    }

    public int getNumeroCambi() {
        return numeroCambi;
    }

    public void setNumeroCambi(int numeroCambi) {
        this.numeroCambi = numeroCambi;
    }

}
