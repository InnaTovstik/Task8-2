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
        System.out.println("Список строк, из которого удалили все строки, длина которых > 4 " + deleteNode(catsName));
    }

    public static LinkedList deleteNode(LinkedList ldl) {
        if (ldl == null || ldl.isEmpty()) {
            return null;
        } else {
            LinkedList<String> delElemLdl = new LinkedList<>();
            for (Object o : ldl) {
                String elem = (String) o;
                if (elem.length() > 4) {
                    delElemLdl.remove(o);
                } else {
                    delElemLdl.add((String) o);
                }
            }
            return delElemLdl;
        }
    }
}
