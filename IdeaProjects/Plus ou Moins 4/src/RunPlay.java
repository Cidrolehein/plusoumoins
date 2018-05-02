import java.util.Scanner;

public class RunPlay extends GamePlay {

    static int mysteryNumber;
    static int playerInput;
    static int max;
    static int min;
    static String result;
    static char retry = 'O';
    static int round = 1;
    static Scanner scan;

    public void run () {

        scan = new Scanner(System.in);

        while (retry == 'O') {
            mysteryNumber = this.chooseLevel(max, min);

            System.out.println(mysteryNumber); // debug

            do {
                playerInput = scan.nextInt();
                result = this.compareNumbers(mysteryNumber, playerInput);
                System.out.println("" + result);
            } while (mysteryNumber != playerInput && round++ <= 10);

            retry = this.retry();
            round = 1;
        }
    }
}
