import java.util.Scanner;

public class LinearEquationResolver {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner scanner = new Scanner(System.in);
        System.out.println("a: ");
        double a = scanner.nextDouble();
        System.out.println("b: ");
        double b = scanner.nextDouble();
//		System.out.println("c: ");
//		double c = scanner.nextDouble();

        if(a != 0) {
            double anwer =  - b / a;
            System.out.println("Ngiem cua phuong trinh la x = " + anwer);
        } else {
            if (b == 0) {
                System.out.println("Phuong trinh vo so nghiem");
            } else {
                System.out.println("Phuong trinh vo nghiem");
            }
        }
    }

}
