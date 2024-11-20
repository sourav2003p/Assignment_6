import java.util.Scanner;

public class Armstrong{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();
        
        if (isArmstrong(num)) {
            System.out.println(num + " is an Armstrong number.");
        } else {
            System.out.println(num + " is not an Armstrong number.");
        }
    }
    public static boolean isArmstrong(int num) {
        int originalNum = num;
        int sum = 0;
        int n = String.valueOf(num).length();

        while (num > 0) {
            int r = num % 10;
            sum += Math.pow(r, n);
            num /= 10;
        }
        return sum == originalNum;
    }
}
