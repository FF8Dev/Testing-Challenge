/*
 * Copyright Alocoifindo 2021®
 * GitHub with ♥︎ for sharing purposes
 * https://alocosite.w3spaces.com
 */
package com.alocoifindo.alocotest;

import java.util.*;

/**
 *
 * @author facundoferreyra
 */
class StringChallenge {

    public static int StringChallenge(String str) {
        // code goes here 
        StringBuilder finalString = new StringBuilder(str);
        int result = 0;
        boolean allA = false;
        boolean allB = false;
        boolean allC = false;
        boolean exit = false;
        boolean oneChar = false;
        while (!exit) {
            for (int i = 0; i < finalString.length(); i += 1) {
                try {
                    if (i < (finalString.length())) {
                        if (finalString.length() == 1) {
                            oneChar = true;
                        }
                        String letters = finalString.charAt(i) + "" + finalString.charAt(i + 1);

                        switch (letters) {
                            case "ab":
                                letters = "c";
                                finalString.replace(i, i + 2, letters);
                                break;
                            case "ba":
                                letters = "c";
                                finalString.replace(i, i + 2, letters);
                                break;
                            case "ca":
                                letters = "b";
                                finalString.replace(i, i + 2, letters);
                                break;
                            case "cb":
                                letters = "a";
                                finalString.replace(i, i + 2, letters);
                                break;
                            case "bc":
                                letters = "a";
                                finalString.replace(i, i + 2, letters);
                                break;
                            case "ac":
                                letters = "b";
                                finalString.replace(i, i + 2, letters);
                                break;
                            default:
                                break;
                        }
                        System.out.println(finalString);
                    }
                } catch (StringIndexOutOfBoundsException siooe) {
                    if ((allA == true || allB == true || allC == true) || oneChar == true) {
                        result = finalString.length();
                        exit = true;
                    }
                }
                for (int it = 0; it < finalString.length(); it++) {
                    if (Character.toString(finalString.charAt(it)).matches("a")) {
                        allA = true;
                        allB = false;
                        allC = false;
                    } else {
                        allA = false;
                        break;
                    }
                } for (int it = 0; it < finalString.length(); it++) {
                    if (Character.toString(finalString.charAt(it)).matches("b")) {
                        allB = true;
                        allA = false;
                        allC = false;
                    } else {
                        allB = false;
                        break;
                    }
                } for (int it = 0; it < finalString.length(); it++) {
                    if (Character.toString(finalString.charAt(it)).matches("c")) {
                        allC = true;
                        allA = false;
                        allB = false;
                    } else {
                        allC = false;
                        break;
                    }
                }
                if (allA == true || allB == true || allC == true) {
                    result = finalString.length();
                    exit = true;
                }
            }
        }
        return result;
    }

    public static void main(String[] args) {
        // keep this function call here     
        Scanner s = new Scanner(System.in);
        System.out.print(StringChallenge(s.nextLine()));
    }

}
