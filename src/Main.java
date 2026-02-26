import java.util.Scanner;
public class Main {
    static Simulation sim = new Simulation();
    public static void main(String[] args) {
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