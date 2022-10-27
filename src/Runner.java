import java.util.Scanner;
public class Runner {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Provide a 3-digit integer: ");
        int number = scanner.nextInt();
        int numDigit1 = number / 100;
        int numDigit2 = (number % 100) / 10;
        int numDigit3 = number % 10;
        System.out.println("" + numDigit3 + numDigit2 + numDigit1);
    }
}
