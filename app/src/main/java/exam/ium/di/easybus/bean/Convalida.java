package exam.ium.di.easybus.bean;

public class Convalida {

    //instance field
    private int biglietto; //associare con id dell'oggetto Biglietto
    private String dataConvalida;
    private String oraConvalida;

    //constructor
    public Convalida() {
        biglietto = -1;
        dataConvalida = "";
        oraConvalida = "";
    }

    public Convalida(int biglietto, String dataConvalida, String oraConvalida) {
        this.biglietto = biglietto;
        this.dataConvalida = dataConvalida;
        this.oraConvalida = oraConvalida;
    }

    //public methods
    public int getBiglietto() {
        return biglietto;
    }

    public void setBiglietto(int biglietto) {
        this.biglietto = biglietto;
    }

    public String getDataConvalida() {
        return dataConvalida;
    }

    public void setDataConvalida(String dataConvalida) {
        this.dataConvalida = dataConvalida;
    }

    public String getOraConvalida() {
        return oraConvalida;
    }

    public void setOraConvalida(String oraConvalida) {
        this.oraConvalida = oraConvalida;
    }
}
