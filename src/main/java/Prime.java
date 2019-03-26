import java.util.Scanner;

public class Prime {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap so can kiem tra: ");
        int num = scanner.nextInt();
        boolean check = true;

        if(num < 2) {
            System.out.println(num + " is not a prime");
        } else {
            for(int i = 2; i <= Math.sqrt(num); i++) {
                if(num % i == 0) {
                    check = false;
                    break;
                }
            }
            if(check) {
                System.out.println(num + " is a prime");
            } else {
                System.out.println(num + " is not a prime");
            }
        }

    }

}
