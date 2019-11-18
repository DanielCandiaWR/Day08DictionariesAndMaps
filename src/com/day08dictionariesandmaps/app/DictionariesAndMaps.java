package com.day08dictionariesandmaps.app;
import java.util.Scanner;
import java.util.HashMap;
import java.util.Map;
/*
 * HackerRank 30 Days of Code
 * ========== Day 08 Dictionaries and Maps ===========
 * Given n names and phones numbers, assemble a phone book that maps friends' names to their respective phone numbers. You
 * will then be given an unknown number of names to query your phone book for. For each name queried, print the associated
 * entry from your phone book on a new line in the form name=phoneNumber; if an entry for name is not found, print Not found
 * instead. 
 * Note: Your phone book should be a Dictionary/Map/HashMap data structure.
 */
public class DictionariesAndMaps {
	private static final Scanner scanner = new Scanner(System.in);
	public static void main(String[] args) {
		int n = scanner.nextInt();
        Map<String,Integer> myMap = new HashMap<String, Integer>();
        String message="";
        for(int i = 0; i < n; i++){
            String name = scanner.next();
            int phone = scanner.nextInt();
            myMap.put(name, phone);
            // Write code here
        }
        while(scanner.hasNext()){
            String s = scanner.next();
            // Write code here
            if(myMap.get(s)==null)
                message="Not found";
            else
                message=s+"="+myMap.get(s);
            System.out.println(message);
        }
        scanner.close();
	}
}
