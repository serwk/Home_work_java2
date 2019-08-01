package HomeWork_3;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

/**
 Java. Level 2. Home work 3. Task 1

 @author Sergey Bondarenko
 @version dated July 24, 2019
 */

public class Task_1 {

    public static void main(String[] args){
        String[] cities = {"Moscow","Geneva","Rome","Rome","Liverpool","Paris",
                "Moscow","Paris","Paris","Paris", "Berlin","Tokyo", "London", "Rome",
                "Dublin","Geneva","Liverpool","Madrid","Milan","Toronto","Florence","Aleppo","Chicago","Zurich"};

        // a list of words without repetitions
        Set<String> set = getWords(cities);
        System.out.println("A list of words without repetitions: ");
        System.out.println(set);

        // count the number of words
        HashMap<String,Integer> нashMap = countNumberWords(cities);
        System.out.println("\nCount the number of words: ");
        System.out.println(нashMap);

    }

    public static HashSet getWords(String[] words){

        HashSet <String> set = new HashSet<>();
        for (String word : words) {
            set.add(word);
        }

        return set;
    }

    public static HashMap countNumberWords(String[] words){
        HashMap<String,Integer> hashMap = new HashMap<>();
        for (String word : words) {
            int key = (hashMap.containsKey(word))? hashMap.get(word)+1:1;
            hashMap.put(word,key);
        }
        return hashMap;
    }
}
