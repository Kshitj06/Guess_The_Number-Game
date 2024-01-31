import java.util.Random;
import java.util.Scanner;

class Guess {
    public static void main(String[] args) {
        int n = 0;
        Scanner sc = new Scanner(System.in);
        guessNumber();
        while (true) {
            try {
                System.out.print("If you want to play again press 1 or press any other key to quit:");
                n = sc.nextInt();
                if (n == 1) {
                    guessNumber();
                } else {
                    System.out.println("Thanks for playing. Goodbye!!!");
                    break;
                }
            } catch (Exception e) {
                System.out.println("Thanks for playing. Goodbye!!!");
                break;
            }
        }
    }

    static void guessNumber() {
        Random rd = new Random();
        int n = rd.nextInt(100);
        Scanner sc = new Scanner(System.in);
        int num;
        System.out.println("Welcome to guess the number game.");
        while (true) {
            try {
                System.out.print("Enter your guess number between 0 and 100(-1 to quit the current game):");
                num = sc.nextInt();
                if (num <= 100 && num >= 0) {
                    break;
                } else if (num == -1) {
                    break;
                } else {
                    System.out.println("Please enter number between 0 and 100 only.");

                }
            } catch (Exception e) {
                System.out.print("Wrong input given.Error:");
                System.out.println(e);
                sc.nextLine();
            }

        }
        boolean j = true;
        int i = 1;
        // System.out.println("random number:"+n);
        if (num != -1) {
            while (j) {
                if (num < n) {
                    System.out.println("Go Higher");
                    num = sc.nextInt();
                } else if (num > n) {
                    System.out.println("Go Lower");
                    num = sc.nextInt();
                } else {
                    System.out.println("Congrats");
                    break;
                }
                i++;
            }
            System.out.println("Number of attempts:" + i);
        } else {
            System.out.println("Thanks for playing. Goodbye!!!");
        }

    }

}
