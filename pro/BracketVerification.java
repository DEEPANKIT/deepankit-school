package com.company;

import java.lang.*;
import java.io.*;

class BracketVerification {
    private char a[];
    private int tos;

    public BracketVerification(int size) {
        a = new char[size];
        tos = -1;
    }

    public static void main(String ar[]) throws Exception {
        DataInputStream z = new DataInputStream(System.in);
        System.out.println("Enter the Bracket Expression");
        String s = z.readLine();
        int l = s.length();
        BracketVerification s1 = new BracketVerification(l);
        int x, ch, p;
        char c, c1;
        for (x = 0; x < l; x++) {
            c = s.charAt(x);
            if (c == '[' || c == '{' || c == '(')
                s1.push(c);
            if (c == ']' || c == '}' || c == ')') {
                c1 = s1.pop();

                if (c1 == '{')
                    if (c != '}')
                        break;

                if (c1 == '[')
                    if (c != ']')
                        break;

                if (c1 == '(')
                    if (c != ')')
                        break;
            }
        }
        if (x == l && tos == -1)
            System.out.println("VALID");
        else
            System.out.println("INVALID");
    }

    public void push(char t) {

        if (tos == a.length - 1)
            System.out.print("");
        else
            a[++tos] = t;
    }

    public char pop() {
        if (tos == -1)
            return 'F';
        else
            return a[tos--];
    }

    public boolean isEmpty() {
        if (tos == -1)
            return true;
        else
            return false;
    }

}







