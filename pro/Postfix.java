package com.company;

import java.io.DataInputStream;

class Postfix {
    public static void main(String[] args) throws java.lang.Exception {
        DataInputStream z = new DataInputStream(System.in);
        System.out.println("Enter an Infix Expession");
        String s = z.readLine();


        StringBuffer sb = new StringBuffer(s);
        int i;
        for (i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '[' || s.charAt(i) == '{')
                sb.setCharAt(i, '(');
            if (s.charAt(i) == ']' || s.charAt(i) == '}')
                sb.setCharAt(i, ')');
        }
        s = sb.toString();


        String ans = "";
        s = "(" + s + ")";
        int l = s.length();

        char[][] arr = new char[l][2];
        int x, y;
        char c;
        arr[0][0] = '(';
        for (x = 0; x < l; x++)
            arr[x][1] = (char) 48;

        for (x = 1; x < l; x++) {
            c = s.charAt(x);
            if (Character.isLetter(c))
                ans = ans + c;
            else {

                if (c == '^') {
                    arr[x][0] = '^';
                    arr[x][1] = (char) 49;
                }
                if (c == '/') {
                    arr[x][0] = '/';
                    arr[x][1] = (char) 50;
                }
                if (c == '*') {
                    arr[x][0] = '*';
                    arr[x][1] = (char) 50;
                }
                if (c == '+') {
                    arr[x][0] = '+';
                    arr[x][1] = (char) 51;
                }
                if (c == '-') {
                    arr[x][0] = '-';
                    arr[x][1] = (char) 51;
                }
                if (c == '(') {
                    arr[x][0] = '(';
                    arr[x][1] = (char) 48;
                }
                if (c == ')') {
                    arr[x][0] = ')';
                    arr[x][1] = (char) 48;
                }

            }

            y = x - 1;
            while (arr[y][0] != '(') {
                if (arr[y][0] == '\u0000') {
                    y--;
                    if (y == -1)
                        break;
                    continue;
                }

                if (arr[y][0] == ')') {

                    arr[y][0] = '\u0000';
                    y = y - 1;
                    while (arr[y][0] != '(') {

                        if (arr[y][0] != '\u0000')
                            ans = ans + arr[y][0];

                        arr[y][0] = '\u0000';
                        arr[y][1] = (char) 48;

                        y--;
                        if (y == -1)
                            break;
                    }
                    arr[y][0] = '\u0000';
                }

                if ((int) arr[y][1] <= (int) arr[x][1]) {
                    ans = ans + arr[y][0];
                    arr[y][0] = '\u0000';
                    arr[y][1] = (char) 48;
                }
                y--;
                if (y == -1)
                    break;

            }

        }

        y = arr.length - 2;

        while (arr[y][0] != '(') {

            if (arr[y][0] != '\u0000')
                ans = ans + arr[y][0];
            y--;
            if (y == -1)
                break;
        }

        System.out.println("\n" + "YOUR POSTFIX EXPRESSION:  " + ans + "\n");

    }
}