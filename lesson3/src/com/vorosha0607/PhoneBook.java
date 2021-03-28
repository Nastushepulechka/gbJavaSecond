package com.vorosha0607;

import java.util.*;

public class PhoneBook {
    private Map<String, Set<String>> phoneBook = new TreeMap<>();

    public void add(String surname, String phone){
        Set<String> phoneNumber = phoneBook.getOrDefault(surname, new HashSet<>());
        phoneNumber.add(phone);
        phoneBook.put(surname, phoneNumber);
    }

    public Set<String> get(String surname){
        return phoneBook.get(surname);
    }
}
