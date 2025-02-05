public abstract class Bulto {
    private String id_Bulto;
    private int volm2;
    private int pesok;

    public Bulto(String id_Bulto,int volm2,int pesok){
        this.id_Bulto=id_Bulto;
        this.pesok=pesok;
        this.volm2=volm2;
    }

    public abstract String getTipo();

    public int getPesok() {
        return pesok;
    }

    public int getVolm2() {
        return volm2;
    }

    public String getId_Bulto() {
        return id_Bulto;
    }

    public void setId_Bulto(String id_Bulto) {
        this.id_Bulto = id_Bulto;
    }

    public void setPesok(int pesok) {
        this.pesok = pesok;
    }

    public void setVolm2(int volm2) {
        this.volm2 = volm2;
    }

    @Override
    public String toString() {
        return "Bulto{" +
                "id_Bulto='" + id_Bulto + '\'' +
                ", volm2=" + volm2 +
                ", pesok=" + pesok +
                '}';
    }
}
