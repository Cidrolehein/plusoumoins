/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author c4n4r
 */
public class Dice {

    public int rollDice(int min, int max){

        int result = (int) (Math.random() * (max - min)) + min;

        if (result == 0) {
            throw new IllegalArgumentException("Le nombre mystère initialisé est erroné");
        } else

        {
            return result;
        }
    }

}
