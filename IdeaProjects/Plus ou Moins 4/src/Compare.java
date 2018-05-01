public class Compare {

    private String str  = "";

    public String compareNumbers (int numberMystery, int playerInput){

        if (playerInput > numberMystery) {

            str = "C'est moins ! Nouvel essai :";
            return str;
        }
        else { if (playerInput < numberMystery)
            str = "C'est plus ! Nouvel essai :";
            return str;

        }

    }

}
