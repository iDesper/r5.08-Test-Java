package com.nieto.calculator;
import java.util.Set;
import java.util.HashSet;

public class Calculator {
    public int add ( int opG,int opD)
    {
        return opG+opD;
    }

    public int divide ( int opG, int opD)
    {
        try {
            return opG / opD;

        } catch (ArithmeticException e) {
            System.out.printf("On ne peut pas diviser par zero");
            return 0;
        }
    }

    public Set<Integer> ensembleChiffres(int pNombre)
    {
        Set<Integer> chiffres = new HashSet<>();

        String nombreStr = Integer.toString(Math.abs(pNombre));

            for (int i = 0; i < nombreStr.length(); i++) {
                char chiffreChar = nombreStr.charAt(i);
                int chiffre = Character.getNumericValue(chiffreChar);
                chiffres.add(chiffre);
            }

            return chiffres;
    }
}
