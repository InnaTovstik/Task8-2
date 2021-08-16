package com.company;

import java.util.LinkedList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<String> catsName = new LinkedList<>();
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

    public static List<String> deleteElem(List<String> list) {
        LinkedList<String> shortName = new LinkedList<>();
        if (list == null || list.isEmpty()) {
            return null;
        } else {
            for (String o : list) {
               if (o.length() <= 4) {
                    shortName.addLast(o);
               }
            }
        }
        return shortName;
    }
}


