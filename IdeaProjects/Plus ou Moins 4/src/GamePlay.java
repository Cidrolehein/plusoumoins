public class GamePlay {

    private String str  = "";

    // Lvl choice

    public int chooseLevel(int nbmax, int nbmin) {
        System.out.println("Salut, bienvenue dans le jeu du Plus et Moins ! \n Choisi un niveau : \n Choix 1 : Facile \n Choix 2 : Difficile \n Choix 3 : Extreme !");
        int choice = RunPlay.scan.nextInt();
        if (choice == 1) {
            nbmax = 15;
            System.out.println("Choisis un nombre entre 0 et 15 :");
        } else if (choice == 2) {
            nbmax = 100;
            System.out.println("Choisis un nombre entre 0 et 100 :");
        } else if (choice == 3) {
            nbmax = 1000;
            System.out.println("Choisis un nombre entre 0 et 1 000 :");
        }

        // Define mystery number

        int result = (int) (Math.random() * (nbmax - nbmin)) + nbmin;
        return result;
    }

    // Compare numbers

    public String compareNumbers (int numberMystery, int playerInput){
            if (playerInput > numberMystery)
                str = "C'est moins ! Il te reste " + (10 - RunPlay.round) + " coups. Nouvel essai :";
                    else if (playerInput < numberMystery)
                        str = "C'est plus ! Il te reste " + (10 - RunPlay.round) + " coups.  Nouvel essai :";
                            else if (playerInput == numberMystery)
                                str = "Bravo, tu as trouvé en " + RunPlay.round + " coups !";
                                    else str = "Il y a eu une erreur";
        return str;
    }

    // Retry

    public char retry () {
        RunPlay.scan.nextLine(); // ! clear scan buffer
        System.out.println("Réessayer O / N ?");
        RunPlay.retry = RunPlay.scan.nextLine().charAt(0);
        return RunPlay.retry;
    }

}