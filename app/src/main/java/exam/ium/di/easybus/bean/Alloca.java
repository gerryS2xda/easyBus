package exam.ium.di.easybus.bean;

public class Alloca {

    //instance field
    private int id;
    private int matricola; //associare con il campo 'matricola' dell'oggetto Autista
    private String idPullman; //identificativo del pullman, es. MW-12
    private Percorso percorso;

    //constructor
    public Alloca() {
        this.id = 0;
        this.matricola = -1;
        this.idPullman = "";
        this.percorso = new Percorso();
    }

    public Alloca(int id, int matricola, String idPullman, Percorso percorso) {
        this.id = id;
        this.matricola = matricola;
        this.idPullman = idPullman;
        this.percorso = percorso;
    }

    //public methods

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getMatricola() {
        return matricola;
    }

    public void setMatricola(int matricola) {
        this.matricola = matricola;
    }

    public String getIdPullman() {
        return idPullman;
    }

    public void setIdPullman(String idPullman) {
        this.idPullman = idPullman;
    }

    public Percorso getPercorso() {
        return percorso;
    }

    public void setPercorso(Percorso percorso) {
        this.percorso = percorso;
    }
}
