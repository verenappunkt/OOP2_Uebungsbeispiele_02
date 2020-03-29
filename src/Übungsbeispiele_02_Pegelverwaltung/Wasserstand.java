package Übungsbeispiele_02_Pegelverwaltung;

public class Wasserstand {

    private int id, zeitpunkt;
    private String gewaessername;
    private double messWert, messWertFueAlarmierung;

    public Wasserstand(int id, int zeitpunkt, String gewaessername, double messWert, double messWertFueAlarmierung) {
        this.id = id;
        this.zeitpunkt = zeitpunkt;
        this.gewaessername = gewaessername;
        this.messWert = messWert;
        this.messWertFueAlarmierung = messWertFueAlarmierung;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getZeitpunkt() {
        return zeitpunkt;
    }

    public void setZeitpunkt(int zeitpunkt) {
        this.zeitpunkt = zeitpunkt;
    }

    public String getGewaessername() {
        return gewaessername;
    }

    public void setGewaessername(String gewaessername) {
        this.gewaessername = gewaessername;
    }

    public double getMessWert() {
        return messWert;
    }

    public void setMessWert(double messWert) {
        this.messWert = messWert;
    }

    public double getMessWertFueAlarmierung() {
        return messWertFueAlarmierung;
    }

    public void setMessWertFueAlarmierung(double messWertFueAlarmierung) {
        this.messWertFueAlarmierung = messWertFueAlarmierung;
    }

    @Override
    public String toString() {
        return "Wasserstand{" +
                "id=" + id +
                ", zeitpunkt=" + zeitpunkt +
                ", gewaessername='" + gewaessername + '\'' +
                ", messWert=" + messWert +
                ", messWertFueAlarmierung=" + messWertFueAlarmierung +
                '}';
    }
}
