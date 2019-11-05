package com.example.pappu.anagram;

public class AnagramChecker {


    public  boolean isStringsAreAnagram(String firstString, String secondString){

        if(firstString.length()!=secondString.length()){
            return false;
        }

        int arraySize = 26;
        int[] firstStringCharFreq = new int[arraySize];
        int[] secondStringCharFreq = new int[arraySize];

        for(int i=0;i<firstString.length();i++){

            firstStringCharFreq[firstString.charAt(i)-'a']++;
            secondStringCharFreq[secondString.charAt(i)-'a']++;
        }

        for(int i=0;i<arraySize;i++){
            if(firstStringCharFreq[i]!=secondStringCharFreq[i])
                return false;
        }

        return true;
    }
}
