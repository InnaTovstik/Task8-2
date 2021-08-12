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
        System.out.println(catsName);
        System.out.println(deleteNode(catsName));
    }

    public static LinkedList deleteNode(LinkedList ldl) {
        if (ldl == null || ldl.isEmpty()) {
            return null;
        } else {
            LinkedList delElemLdl = new LinkedList();
            for (int i = 0; i < ldl.size(); i++) {
                String elem = (String) ldl.get(i);
                if (elem.length() > 4) {
                    delElemLdl.remove(ldl.get(i));
                } else {
                    delElemLdl.add(ldl.get(i));
                }
            }
            return delElemLdl;
        }

    }
}
