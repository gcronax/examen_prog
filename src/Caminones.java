import java.util.ArrayList;

public class Caminones {
    public static String Matricula;
    public static int vol_max_m2=1000;
    public static int vol_ocuped_m2=0;
    public static int peso_max_k=2000;
    public static int peso_ocuped_k=0;
    public static ArrayList<Bulto> bultos;

    public Caminones(){
        bultos=new ArrayList<Bulto>();
    }

    public boolean cargarBulto(Bulto b){
        if (vol_max_m2>=(vol_ocuped_m2+b.getVolm2())
                &&peso_max_k<=(peso_ocuped_k+b.getVolm2())){
            bultos.add(b);
            return true;
        }return false;
    }

    public static int getVol_max_m2() {
        return vol_max_m2;
    }

    public static int getPeso_ocuped_k() {
        return peso_ocuped_k;
    }

    public static int getPeso_max_k() {
        return peso_max_k;
    }

    public  String getMatricula() {
        return Matricula;
    }

    public static int getVol_ocuped_m2() {
        return vol_ocuped_m2;
    }

    public static ArrayList<Bulto> getBultos() {
        return bultos;
    }

    public static void setVol_ocuped_m2(int vol_ocuped_m2) {
        Caminones.vol_ocuped_m2 = vol_ocuped_m2;
    }

    public static void setVol_max_m2(int vol_max_m2) {
        Caminones.vol_max_m2 = vol_max_m2;
    }

    public static void setPeso_ocuped_k(int peso_ocuped_k) {
        Caminones.peso_ocuped_k = peso_ocuped_k;
    }

    public static void setPeso_max_k(int peso_max_k) {
        Caminones.peso_max_k = peso_max_k;
    }

    public  void setMatricula(String matricula) {
        Matricula = matricula;
    }

    public static void setBultos(ArrayList<Bulto> bultos) {
        Caminones.bultos = bultos;
    }
}
