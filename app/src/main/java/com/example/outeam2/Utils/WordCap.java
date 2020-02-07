package com.example.outeam2.Utils;

public class WordCap {
    public static String oneCap(String string){
        String tmp=string;
        if(string.length()>0){
            tmp=string.substring(0,1).toUpperCase() + string.substring(1);
        }
        return tmp;
    }
    public static String perOneCap(String string){
        if(string==null) return string;
        if(string.length()>0) {
            StringBuilder tmp = new StringBuilder(string.length());
            String[] words = string.split(" ");
            for (String word : words) {
                tmp.append(word.substring(0, 1).toUpperCase() + word.substring(1) + " ");
            }
            return tmp.toString();
        }else return string;
    }
}
