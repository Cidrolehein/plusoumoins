import java.util.Scanner;

/**
 * @author c4n4r
 */
public class NombreMystere {

    // !!!! pb avec les variables statics

    static int mysteryNumber = 0;
    static int playerInput;
    static Scanner scan;
    static Scanner sc;
    static Scanner lvl;
    static String result;
    static int chooseLvl;
    static int round;

    public static void main(String[] args) {

        //récupérer l'input du joueur
        scan = new Scanner(System.in);
        sc = new Scanner(System.in);
        lvl = new Scanner(System.in);

        playAgain playagain = new playAgain();

        while (playagain.getRetry() == 'O') {

            // Define level :

            System.out.println("Salut, bienvenue dans le jeu du Plus et Moins ! \n Choisi un niveau : \n Choix 1 : Facile \n Choix 2 : Difficile \n Choix 3 : Extreme !");
            Level level = new Level();
            chooseLvl = level.chooseLvl();

            //générer un nombre mystère + exception. How to correct an exception ?
            try {
                Dice dice = new Dice();
                mysteryNumber = dice.rollDice(level.min, level.max);
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }

                //debug
                System.out.println(mysteryNumber);

                while (mysteryNumber != playerInput) {

                    Compare compare = new Compare();
                    result = compare.compareNumbers(mysteryNumber);
                    System.out.println("" + result);
                    round++;

                }

                System.out.println("Bravo, tu as trouvé en " + round + " coups !\n\nRéessayer O / N ?");
                char r = sc.nextLine().charAt(0);
                playagain.setRetry(r);

        }
    }

}