package by.maksim.testing.task;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Scanner;


//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter x1, r1, x2, r2 (separated by spaces): ");
        int x1 = scanner.nextInt();
        int r1 = scanner.nextInt();
        int x2 = scanner.nextInt();
        int r2 = scanner.nextInt();

        scanner.close();

        Circle circle1 = new Circle(x1, r1);
        Circle circle2 = new Circle(x2, r2);

        System.out.println(getIntersection(circle1, circle2));

        Circle circle3 = new Circle(5, 3);
        Circle circle4 = new Circle(5, 2);

        System.out.println(getIntersection(circle3, circle4));
    }

    public static String getIntersection(Circle c1, Circle c2) {
        int x1 = c1.getX();
        int r1 = c1.getR();
        int x2 = c2.getX();
        int r2 = c2.getR();

        int d = Math.abs(x1 - x2);
        int sum = r1 + r2;
        int diff = Math.abs(r1 - r2);

        if (x1 == x2 && r1 == r2) {
            return "Infinite number of intersection points (identical circles)";
        }
        else if (d == sum) {
            return "1 intersection point (external tangency)";
        }
        else if (d == diff && d != 0) {
            return "1 intersection point (internal tangency)";
        }
        else if (diff < d && d < sum) {
            return "2 intersection points";
        }
        else if (d < diff) {
            return "0 intersection points (one circle inside the other)";
        }
        else if (d > sum) {
            return "0 intersection points (circles too far apart)";
        }
        else {
            return "0 intersection points (concentric circles)";
        }
    }
}
