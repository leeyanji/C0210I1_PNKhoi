import java.util.Scanner;

public class NumberToString {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        String num = Integer.toString(number);
        if(number < 10){
            System.out.println(read(num));
        } else if (number < 20){
            System.out.println(readTen(num));
        } else if(number < 99){
            System.out.println(readTens(num));
        } else if (number < 1000){
            System.out.println(readHundred(num));
        } else {
            System.out.println("out of ability");
        }

    }
    // num < 10
    public static String read(String num) {
        switch (num) {
            case "0":
                return "zero";
            case "1":
                return "one";
            case "2":
                return "two";
            case "3":
                return "three";
            case "4":
                return "four";
            case "5":
                return "five";
            case "6":
                return "six";
            case "7":
                return "seven";
            case "8":
                return "eight";
            case "9":
                return "nine";
            default:
                return "";
        }


    }
    // 9 > num < 20
    public static String readTen(String num) {
        switch (num) {
            case "10":
                return "ten";
            case "11":
                return "eleven";
            case "12":
                return "twelve";
            case "13":
                return "thirteen";
            case "14":
                return "forteen";
            case "15":
                return "fifteen";
            case "16":
                return "sixteen";
            case "17":
                return "seventeen";
            case "18":
                return "eighteen";
            case "19":
                return "nineteen";
            default:
                return "";
        }


    }
    // 20 <= num < 100
    public static String readTens(String num) {
        String[] arr = num.split("");


        switch (arr[0]) {
            case "0":
                return "zero " + read(arr[1]);
            case "1":
                return readTen(num);
            case "2":
                return "twenty " + read(arr[1]);
            case "3":
                return "thirty " + read(arr[1]);
            case "4":
                return "forty " + read(arr[1]);
            case "5":
                return "fifty " + read(arr[1]);
            case "6":
                return "sixty " + read(arr[1]);
            case "7":
                return "seventy " + read(arr[1]);
            case "8":
                return "eighty " + read(arr[1]);
            case "9":
                return "ninety " + read(arr[1]);
            default:
                return "";
        }

    }
    // 100 < num < 1000
    public static String readHundred(String num){
        String[] arr = num.split("");
        String ar = arr[1] + arr[2];
        switch (arr[0]) {
            case "1":
                return "one hundred " + readTens(ar);
            case "2":
                return "two hundred " + readTens(ar);
            case "3":
                return "three hundred " + readTens(ar);
            case "4":
                return "four hundred " + readTens(ar);
            case "5":
                return "five hundred " + readTens(ar);
            case "6":
                return "six hundred " + readTens(ar);
            case "7":
                return "seven hundred " + readTens(ar);
            case "8":
                return "eight hundred " + readTens(ar);
            case "9":
                return "nine hundred " + readTens(ar);
            default:
                return "";
        }
    }
}
