import java.util.ArrayList;
import java.util.Random;

public class Caminones {
    public static String Matricula;
    public static int vol_max_m2=1000;
    public static int vol_ocuped_m2=0;
    public static int peso_max_k=2000;
    public static int peso_ocuped_k=0;
    public static ArrayList bultos;

    public Caminones(){
        bultos=new ArrayList<>();
        this.Matricula=crearMatricula();
    }
    public String crearMatricula(){
        int aux=(new Random().nextInt(8) + 1);

        return String.valueOf(aux);
    }

    public String getMatricula() {
        return Matricula;
    }

    public ArrayList getBultos() {
        return bultos;
    }

    public int getPeso_max_k() {
        return peso_max_k;
    }

    public int getPeso_ocuped_k() {
        return peso_ocuped_k;
    }

    public int getVol_max_m2() {
        return vol_max_m2;
    }

    public int getVol_ocuped_m2() {
        return vol_ocuped_m2;
    }

    public void setMatricula(String matricula) {
        Matricula = matricula;
    }

    public void setBultos(ArrayList bultos) {
        this.bultos = bultos;
    }

    public void setPeso_max_k(int peso_max_k) {
        this.peso_max_k = peso_max_k;
    }

    public void setPeso_ocuped_k(int peso_ocuped_k) {
        this.peso_ocuped_k = peso_ocuped_k;
    }

    public void setVol_max_m2(int vol_max_m2) {
        this.vol_max_m2 = vol_max_m2;
    }

    public void setVol_ocuped_m2(int vol_ocuped_m2) {
        this.vol_ocuped_m2 = vol_ocuped_m2;
    }




}
