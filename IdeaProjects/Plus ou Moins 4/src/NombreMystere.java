import java.util.Scanner;

public class NombreMystere {

    static int mysteryNumber;
    static int playerInput;
    static int max;
    static int min;
    static Scanner scan;
    static Scanner sc;
    static String result;
    static char retry = 'O';
    static int round;

    public static void main(String[] args) {

        scan = new Scanner(System.in);
        sc = new Scanner(System.in); // !!! initiate a new char Scanner
        GamePlay gameplay = new GamePlay();

        // More play && level difficulty (boolean)

        while (retry == 'O' && round <= 10) {
            mysteryNumber = gameplay.chooseLevel(max, min);

                System.out.println(mysteryNumber); // debug

                do {
                    playerInput = scan.nextInt();
                    result = gameplay.compareNumbers(mysteryNumber, playerInput);
                    System.out.println("" + result);
                } while (mysteryNumber != playerInput && round++ < 10);
                retry = gameplay.retry();
                round = 0;

        }
    }
}
