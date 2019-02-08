package exam.ium.di.easybus.bean;

public class Percorso {

    //instance field
    private String partenza;
    private String arrivo;
    private String oraPartenza;
    private String oraArrivo;
    private int tempoPercorrenza;
    private boolean statoPref; //se e' una tratta preferita --> true

    //constructor
    public Percorso(){
        partenza = "";
        arrivo = "";
        tempoPercorrenza = -1;
        statoPref = false;
        oraPartenza = "";
        oraArrivo = "";
    }

    public Percorso(String partenza, String arrivo, String oraPartenza, String oraArrivo, int tempoPercorrenza, boolean statoPref) {
        this.partenza = partenza;
        this.arrivo = arrivo;
        this.oraPartenza = oraPartenza;
        this.oraArrivo = oraArrivo;
        this.tempoPercorrenza = tempoPercorrenza;
        this.statoPref = statoPref;
    }

    //public methods
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

    public int getTempoPercorrenza() {
        return tempoPercorrenza;
    }

    public void setTempoPercorrenza(int tempoPercorrenza) {
        this.tempoPercorrenza = tempoPercorrenza;
    }

    public boolean isTrattaPreferita() {
        return statoPref;
    }

    public void setStatoPref(boolean statoPref) {
        this.statoPref = statoPref;
    }

    public String getOraPartenza() {
        return oraPartenza;
    }

    public void setOraPartenza(String oraPartenza) {
        this.oraPartenza = oraPartenza;
    }

    public String getOraArrivo() {
        return oraArrivo;
    }

    public void setOraArrivo(String oraArrivo) {
        this.oraArrivo = oraArrivo;
    }
}
