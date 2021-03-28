package com.vorosha0607;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Main {

    public static void main(String[] args) {
        //Задание 1.
	    String[] arrStr = {
            "Cat", "Dog", "Leg", "Cat", "Hello", "Absurd", "Animal",
                "Leg", "Arm", "Apple", "Phone", "Cat", "Hair", "Circle"
        };

        Map<String, Integer> map = new HashMap<>();
        for (int i = 0; i < arrStr.length; i++) {
            String word = arrStr[i];
            map.put(word, map.getOrDefault(word, 0)+1);
        }

        //Здесь сразу и список уникальных слов, и сколько раз они встречаются.
        System.out.println(map);

        //Задание 2.
        PhoneBook phB = new PhoneBook();
        phB.add("Воронина", "9997643388");
        phB.add("Кукушкина", "9997368388");
        phB.add("Баранова", "9037652299");
        phB.add("Воронина", "9997643377");
        phB.add("Кульков", "9317654477");
        phB.add("Форманов", "9873450921");

        System.out.println("Тел. Ворониной: " + phB.get("Воронина"));
        System.out.println("Тел. Кукушкиной: " + phB.get("Кукушкина"));
    }
}
