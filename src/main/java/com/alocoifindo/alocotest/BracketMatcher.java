/*
 * Copyright Alocoifindo 2021®
 * GitHub with ♥︎ for sharing purposes
 * https://alocosite.w3spaces.com
 */
package com.alocoifindo.alocotest;

import java.util.*; 
import java.io.*;
/**
 *
 * @author facundoferreyra
 */

class BracketMatcher {

  public static int BracketMatcher(String str) {
    Stack<Character> stack = new Stack<>();

    for (int i = 0; i < str.length(); i++) {
        if (str.charAt(i) == '(') {
            stack.push('(');
        } else if (str.charAt(i) == ')') {
            if (stack.isEmpty()) {
              return 0;
            }
            stack.pop();
        }
    }
    return stack.isEmpty() ? 1 : 0;
  }

  public static void main (String[] args) {  
    // keep this function call here     
    Scanner s = new Scanner(System.in);
    System.out.print(BracketMatcher(s.nextLine())); 
  }

}
