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

/*
    Return the smallest number you can get through the following reduction method. 
    Only the letters a, b, and c will be given in input and takes two different 
    adjacent characters and replace it with the third. 
    
    For example "ac" can be replaced with "b" but "aa" cannot be replaced with anything. 
    This method is done repeatedly until the string cannot be further reduced, 
    and the length of the resulting string is outputted.
 */
class StringChallenge {

    public static int StringChallenge(String input) {
        StringBuilder finalString = new StringBuilder(input);
        int result = 0;
        boolean allA = false;
        boolean allB = false;
        boolean allC = false;
        boolean exit = false;
        while (!exit) {
            for (int i = 0; i < finalString.length(); i += 1) {
                try {
                    if (i < (finalString.length())) {
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
                } catch (StringIndexOutOfBoundsException siooe) {}
                for (int it = 0; it < finalString.length(); it++) {
                    if (Character.toString(finalString.charAt(it)).matches("a")) {
                        allA = true;
                        allB = false;
                        allC = false;
                    } else {
                        allA = false;
                        break;
                    }
                }
                for (int it = 0; it < finalString.length(); it++) {
                    if (Character.toString(finalString.charAt(it)).matches("b")) {
                        allB = true;
                        allA = false;
                        allC = false;
                    } else {
                        allB = false;
                        break;
                    }
                }
                for (int it = 0; it < finalString.length(); it++) {
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
