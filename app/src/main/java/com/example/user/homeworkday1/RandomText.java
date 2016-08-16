package com.example.user.homeworkday1;


/**
 * Created by user on 16/08/2016.
 */
public class RandomText {
    private String[] words;
    private String word1;
    private String word2;
    private String word3;

    public RandomText(String word1, String word2, String word3){
        this.word1 = word1;
        this.word2 = word2;
        this.word3 = word3;

        this.words = new String[3];


    }
    public String takeRandomWord(){
        this.words[0] = word1;
        this.words[1] = word2;
        this.words[2] = word3;
        int randomInt = (int)(Math.random()*(words.length));
        String word = words[randomInt];
        return word;
    }
}

