import java.util.Scanner;
public class Main {
    static Simulation sim = new Simulation();
    public static void main(String[] args) {
        Hospital hospital2 = new Hospital();
        Patient j_patient = new Patient("Joseph","Smith", Patient.Sex.male,"1234","06/26/2006");
        Patient e_patient = new Patient("Elias","Doe",Patient.Sex.male,"1235","05/24/2007");
        hospital2.add_patient(j_patient);
        hospital2.add_patient(e_patient);
        hospital2.print_test();

    }

    static Point getInputPoint(String Prompt) {
        Scanner sc = new Scanner(System.in);
        System.out.println(Prompt);
        String[] tokens = sc.nextLine().split("[,]+");
        double x = Double.parseDouble(tokens[0]);
        double y = Double.parseDouble(tokens[1]);
        return new Point(x,y);
    }
}