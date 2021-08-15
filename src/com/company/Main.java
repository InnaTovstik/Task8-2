package com.company;

import java.util.LinkedList;

public class Main {

    public static void main(String[] args) {
        LinkedList<String> catsName = new LinkedList<>();
        catsName.add("Tom");
        catsName.add("Joker");
        catsName.add("Agat");
        catsName.add("Baksik");
        catsName.add("Motya");
        catsName.add("Baby");
        catsName.add("Caitlyn");
        System.out.println("Список строк " + catsName);
        System.out.println("Список строк, из которого удалили все строки, длина которых > 4 " + deleteElem(catsName));
    }

    public static LinkedList<String> deleteElem(LinkedList<String> ldl) {
        if (ldl == null || ldl.isEmpty()) {
            return null;
        } else {
            LinkedList<String> shortName = new LinkedList<>();
            for (String o : ldl) {
                if (o.length() > 4) {
                    shortName.remove(o);
                } else {
                    shortName.add(o);
                }
            }
            return shortName;
        }
    }
}
