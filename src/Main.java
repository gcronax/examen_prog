import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Bulto[] bultos=new Bulto[6];
        bultos[0]= new BultoGeneral("B001", 100, 150);
        bultos[1]= new BultoFragil("B002", 50, 100);
        bultos[2]= new BultoPesado("B003", 300, 1800);
        bultos[3]= new BultoGeneral("B004", 200, 300);
        bultos[4]= new BultoFragil("B005", 80, 120);
        bultos[5]= new BultoPesado("B006", 250, 1300);

        ArrayList<Bulto> BultosList=new ArrayList<>(Arrays.asList(bultos));
        System.out.println(BultosList);



        System.out.println("Se va a crear el primer camión.");
        Caminones camion=new Caminones();
        Scanner scan =new Scanner(System.in);
        System.out.print("Introduce la matrícula (formato 0000XXX): ");
        String matricula=scan.next();

        camion.setMatricula(matricula);








    }
}
