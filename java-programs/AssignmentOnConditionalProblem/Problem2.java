import java.util.*;

public class Problem2 {

    public static int getProduct(int num[]) {
    
        if (num[0] == 7) {
            return num[1] * num[2];
        } else if (num[1] == 7) {
            return num[2];
        } else if (num[2] == 7) {
            return -1;
        } else {
            return num[0] * num[1] * num[2];
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num[] = new int[3];

        System.out.println("Enter 3 positive integers:");
        int countOfSeven = 0;
        for (int i = 0; i < 3; i++) {
            num[i] = sc.nextInt();
            if (num[i] <= 0){
                System.out.println("Only positive number only!");
                return;
            }
            if (num[i] == 7){
                countOfSeven++;
            }
        }

        if (countOfSeven > 1){
            System.out.println("only one number can be 7");
            return;
        }

        System.out.println("Input: " + Arrays.toString(num));
        System.out.println("The 3 Positive Integer product is: " + getProduct(num));
    }
}
