public class BultoFragil extends Bulto {
    private String Tipo="Fragil";

    public BultoFragil(String id_Bulto, int volm2, int pesok) {
        super(id_Bulto, volm2, pesok);
    }

    @Override
    public String getTipo() {
        return Tipo;
    }

    @Override
    public String toString() {
        return super.toString()+"BultoFragil{" +
                "Tipo='" + Tipo + '\'' +
                '}';
    }
}
