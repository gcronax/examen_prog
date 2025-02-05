public class BultoPesado extends Bulto{
    private String Tipo="Pesado";

    public BultoPesado(String id_Bulto, int volm2, int pesok) {
        super(id_Bulto, volm2, pesok);
    }

    @Override
    public String getTipo() {
        return Tipo;
    }

    @Override
    public String toString() {
        return super.toString()+"BultoPesado{" +
                "Tipo='" + Tipo + '\'' +
                '}';
    }
}
