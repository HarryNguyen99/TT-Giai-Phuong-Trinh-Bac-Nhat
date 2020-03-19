import java.util.Scanner;

public class GiaiPhuongTrinhBacNhat {
    public static void main(String[] args) {
        double a;
        double b;

        Scanner scanner = new Scanner(System.in);

        System.out.print("a: ");
        a = scanner.nextDouble();

        System.out.print("b: ");
        b = scanner.nextDouble();


        if (a != 0) {
            double solution = -b / a;
            System.out.print("phương trình có một nghiệm: " + solution);
        } else {
            if (b == 0) {
                System.out.print("phương trình có nghiệm x!");
            } else {
                System.out.print("phương trình vô nghiệm");
            }
        }
    }
}
