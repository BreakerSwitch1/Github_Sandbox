import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Point pt = getInputPoint("Please enter as x,y: ");
        Rectangle upperRect = new Rectangle(new Point(2, 3), new Point(24, 19));
        Rectangle lowerRect = new Rectangle(new Point(7, -5), new Point(18, 3));
        Circle c1 = new Circle(); //Used to be more here, but it was giving me issues

        if (upperRect.contains(pt )) {
            System.out.println("The point is in th upper rectangle");
        }
        if (lowerRect.contains(pt )) {
            System.out.println("Point is in the lower rectangle");
        }
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
