package com.codewithmelvin;
import java.util.*;

public class HashTable {
    public static void main(String[] args) {
        Map<String , String> phonebook = new HashMap<>();
        //creating two Elements which are two keys and the value in this case the name of the person is the key
        phonebook.put("Melvin"   , "0765970091");
        phonebook.put("Asanda"   , "0727007114");
        phonebook.put("Mom"      , "0674737344");
        phonebook.put("Dad"      , "0789871714");
        phonebook.put("Demi"     , "0736445441");

        //We need to find the number of the person given oly the key which is Name
        Set<String> keys =phonebook.keySet();
        for(String i : keys){
            System.out.println( i + " : " + phonebook.get(i));
        }

        System.out.println(" ");//space for separating outputs

        //Another way of printing all the values and keys is to use map entry "highly recommended "
        Set<Map.Entry<String,String>> values = phonebook.entrySet();
        for(Map.Entry<String,String> v : values){
            System.out.println(v.getKey() + ":" + v.getValue());
        }
    }
}
