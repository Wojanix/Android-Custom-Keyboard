package com.divyankit.keyboard.utils;

public class Translate {
    public static String getTranslation(String toTranslate){
        String link = "https://api.mymemory.translated.net/get?q=";
        String textToTranslate= toTranslate; //oddziel słowa %20
        String lang = "&langpair=en|pl";
        String translatedText = "";

        String[] words = textToTranslate.split("\\s+");
        for (int i = 0; i < words.length; i++) {
            words[i] = words[i].replaceAll("[^\\w]", "");
        }

        System.out.println(words[words.length-1]);

        return translatedText;
    }
}
