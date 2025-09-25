package calculator;

import java.util.HashSet;
import java.util.Set;

public class Calculator {
    static public int add(int opG, int opD)
    {
        return opG + opD;
    }
    static public int divide(int opG, int opD)
    {
        return opG/opD;
    }

    static Set<Integer> ensembleChiffres(int pNombre)
    {
        Set<Integer> chiffres = new HashSet<>();
        String nombreStr = Integer.toString(Math.abs(pNombre));
        for (char c : nombreStr.toCharArray()) {
            chiffres.add(Character.getNumericValue(c));
        }
        return chiffres;
    }
}
