package com.company;

import java.io.DataInputStream;

class ComplexSubString {
    public static void main(String[] args) throws java.lang.Exception {
        DataInputStream z = new DataInputStream(System.in);
        String s2, s1, s;
        int i, j, x, l1, l2;
        System.out.println("Enter the String");
        s1 = z.readLine();
        System.out.println("Enter another string");
        s2 = z.readLine();
        l1 = s1.length();
        l2 = s2.length();
        char[] k1, k2;
        k1 = s1.toCharArray();
        k2 = s2.toCharArray();
        int ll1 = l1, ll2 = l2;
        StringBuffer sb;
        String[] arr = new String[l1];
        for (x = 0; x < l1; x++)
            arr[x] = "";

        int check = 0, crosscheck = 0;

        for (x = 0; x <= ll1 - ll2; x++) {
            for (i = 0; i < l1; i++) {
                for (j = 0; j < l2; j++) {
                    if (k1[i] == k2[j] || k1[i] == (char) (k2[j] + 32) || k1[i] == (char) (k2[j] - 32)) {
                        arr[x] = arr[x] + k1[i];
                        k2[j] = '\u0000';
                        check++;
                        break;
                    }

                }
                if (crosscheck != 0 && check != 0)
                    if (crosscheck == check)
                        arr[x] = arr[x] + k1[i];
                crosscheck = check;
                if (check == k2.length)
                    break;

            }
            if (check != k2.length)
                arr[x] = "";
            check = 0;
            crosscheck = 0;
            sb = new StringBuffer(s1);
            sb.deleteCharAt(0);
            s1 = sb.toString();
            k1 = s1.toCharArray();
            k2 = s2.toCharArray();
            l1 = s1.length();
            l2 = s2.length();
        }

        s = arr[0];

        for (x = 0; x <= ll1 - ll2; x++) {
            if (arr[x].equals(""))
                continue;
            if (arr[x].length() < s.length())
                s = arr[x];
        }

        if (s.equals(""))
            System.out.println("\n" + "NO  POSSIBLE SUBSTRING WAS FOUND" + "\n");
        else
            System.out.println("\n" + "Your Substring:    " + s + "\n");

    }
}