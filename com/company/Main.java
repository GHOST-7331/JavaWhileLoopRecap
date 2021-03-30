package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    String sentence = "testing while loops";
	    Scanner scanner = new Scanner(sentence);
        ArrayList<String> words = new ArrayList<String>();

        while (scanner.hasNext()) {
            words.add(scanner.next());
        }
        System.out.println(words);
    }
}
