import java.util.Scanner;
public class Runner {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Provide a 5-digit integer: ");
        int number = scanner.nextInt();
        int numDigit1 = (number / 10000) + 1;
        int numDigit2 = ((number % 10000) / 1000) + 1;
        int numDigit3 = ((number % 1000) / 100) + 1;
        int numDigit4 = ((number % 100) / 10) + 1;
        int numDigit5 = (number % 10) + 1;
        System.out.println("" + numDigit5 + "\n" + numDigit4 + "\n" + numDigit3 + "\n" + numDigit2 + "\n" + numDigit1);
    }
}
