package exam.ium.di.easybus.bean;

import android.os.Build;

import java.time.LocalDate;

public class CreditCard {

    //instance field
    private String codice; //es. 122-504-535-123
    private String cvv; //es. 1-2-3
    private String dataScadenza; //es, 02/2021

    //constructor
    public CreditCard(){
        //vuoto
    }

    public CreditCard(String codice, String cvv, String dataScadenza) {
        this.codice = codice;
        this.cvv = cvv;
        this.dataScadenza = dataScadenza;
    }

    //getter and setter

    public String getCodice() {
        return codice;
    }

    public void setCodice(String codice) {
        this.codice = codice;
    }

    public String getCvv() {
        return cvv;
    }

    public void setCvv(String cvv) {
        this.cvv = cvv;
    }

    public String getDataScadenza() {
        return dataScadenza;
    }

    public void setDataScadenza(String dataScadenza) {
        this.dataScadenza = dataScadenza;
    }

}
