public class Level {

    public int min = 0;
    public int max;

    public int chooseLvl() {

        NombreMystere.chooseLvl = NombreMystere.scan.nextInt();

        if (NombreMystere.chooseLvl == 1) {
            max = 15;
            System.out.println("Choisis un nombre entre 0 et 15 :");

        }

        else if (NombreMystere.chooseLvl == 2) {
                max = 100;
                System.out.println("Choisis un nombre entre 0 et 100 :");
            }

        else if (NombreMystere.chooseLvl == 3) {
            max = 1000;
            System.out.println("Choisis un nombre entre 0 et 1 000 :");

        }

        return max;

    }
}
