import java.util.Scanner;
public class Main {
    public static Simulation sim = new Simulation();
    public static void main(String[] args) {
        boolean ms = should_use_manual_step();
        sim.run(ms);
    }

    static Point getInputPoint(String Prompt) {
        Scanner sc = new Scanner(System.in);
        System.out.println(Prompt);
        String[] tokens = sc.nextLine().split("[,]+");
        double x = Double.parseDouble(tokens[0]);
        double y = Double.parseDouble(tokens[1]);
        return new Point(x,y);
    }

    public static boolean should_use_manual_step() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Would you like to manually step through the simulation?(y/n)? ");
        String input_string = sc.next();
        return(input_string.equals("y"));
    }
}