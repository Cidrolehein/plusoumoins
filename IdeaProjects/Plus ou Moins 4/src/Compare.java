public class Compare {

    private String str  = "";

    public String compareNumbers (int numberMystery){

        NombreMystere.playerInput = NombreMystere.scan.nextInt();

        if (NombreMystere.playerInput > numberMystery) {

            str = "C'est moins ! Nouvel essai :";
            return str;
        }
        else { if (NombreMystere.playerInput < numberMystery)
            str = "C'est plus ! Nouvel essai :";
            return str;

        }

    }

}
