//import java.util.TreeMap;

public class AA_JavaAnagrams {


    static boolean isAnagram(String a, String b) {

        // anagram must be equal length
        if (a.length() != b.length()) return false;

        java.util.TreeMap<Character, Integer> tm1 = new java.util.TreeMap<>();
        java.util.TreeMap<Character, Integer> tm2 = new java.util.TreeMap<>();

        for (int i = 0; i < a.length(); i++) {

            char ch1 = Character.toLowerCase(a.charAt(i));
            char ch2 = Character.toLowerCase(b.charAt(i));

            if (tm1.containsKey(ch1)) {
                int times = tm1.get(ch1);
                times++;
                tm1.put(ch1, times);
            } else {
                //first occurrence of this character
                tm1.put(ch1, 1);
            }

            if (tm2.containsKey(ch2)) {
                int times = tm2.get(ch2);
                times++;
                tm2.put(ch2, times);
            } else {
                //first occurrence of this character
                tm2.put(ch2, 1);
            }

        }
        System.out.println("tm1 " + tm1.toString());
        System.out.println("tm2 " + tm2.toString());

        return tm1.equals(tm2);
    }

    public static void main(String[] args) {


        boolean ret = isAnagram("Anagrams", "margaNax");
        System.out.println((ret) ? "Anagrams" : "Not Anagrams");
    }

}



/*
https://www.hackerrank.com/challenges/java-anagrams/problem
Two strings,  and , are called anagrams if they contain all the same characters in the same frequencies.
For this challenge, the test is not case-sensitive. For example, the anagrams of CAT are CAT, ACT, tac, TCA, aTC, and CtA.

Function Description

Complete the isAnagram function in the editor.

isAnagram has the following parameters:

string a: the first string
string b: the second string
Returns

boolean: If  and  are case-insensitive anagrams, return true. Otherwise, return false.
Input Format

The first line contains a string .
The second line contains a string .

*/