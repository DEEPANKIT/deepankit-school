package com.company;

import java.io.DataInputStream;
import java.util.StringTokenizer;

class BlastRadius {
    public static void main(String[] args) throws java.lang.Exception {
        DataInputStream sc = new DataInputStream(System.in);
        int l, b, x, y, z, l1, b1;
        String tem;
        System.out.println("Enter the DIMENSIONS of the FIELD");
        tem = sc.readLine();
        l = Integer.parseInt(tem.charAt(0) + "");
        b = Integer.parseInt(tem.charAt(2) + "");
        String[][] arr = new String[l][b];
        int[][] exp = new int[l * b][2];
        int[][] blast = new int[l * b][2];
        String[] temp = new String[l];

        System.out.println("Enter the SURFACE TYPE of the field ROW WISE");
        for (x = 0; x < l; x++)
            temp[x] = sc.readLine();


        System.out.println("Enter the COORDINATES where the bomb was dropped");
        tem = sc.readLine();
        l1 = Integer.parseInt(tem.charAt(0) + "");
        b1 = Integer.parseInt(tem.charAt(2) + "");

        StringTokenizer st;

        for (x = 0; x < l; x++) {
            st = new StringTokenizer(temp[x], ",");
            for (y = 0; y < b; y++)
                arr[x][y] = st.nextToken();
        }

        blast[0][0] = l1;
        blast[0][1] = b1;

        exp[0][0] = l1;
        exp[0][1] = b1;


        int check = 0;

        if (arr[l1][b1].equals("W"))
            check++;


        for (x = 1; x < l * b; x++) {
            for (y = 0; y < 2; y++) {
                blast[x][y] = l * b;
                exp[x][y] = l * b;
            }
        }

        x = 0;
        y = 1;

        while (blast[x][0] != l * b && blast[x][1] != l * b) {
            if ((blast[x][0] - 1) >= 0 && (blast[x][0] - 1) < l && (blast[x][1]) >= 0 && (blast[x][1]) < b)
                if ((arr[blast[x][0] - 1][blast[x][1]]).equals("L")) {
                    for (z = 0; z < y; z++) {
                        if (blast[z][0] == (blast[x][0] - 1) && blast[z][1] == blast[x][1])
                            break;
                        if (exp[z][0] == (blast[x][0] - 1) && exp[z][1] == (blast[x][1]))
                            break;
                    }
                    if (y == z) {
                        blast[y][0] = blast[x][0] - 1;
                        blast[y][1] = blast[x][1];
                        y++;
                    }
                }

            if ((blast[x][0]) >= 0 && (blast[x][0]) < l && (blast[x][1] - 1) >= 0 && (blast[x][1] - 1) < b)
                if ((arr[blast[x][0]][blast[x][1] - 1]).equals("L")) {
                    for (z = 0; z < y; z++) {
                        if (blast[z][0] == blast[x][0] && blast[z][1] == (blast[x][1] - 1))
                            break;
                        if (exp[z][0] == (blast[x][0]) && exp[z][1] == (blast[x][1] - 1))
                            break;
                    }
                    if (y == z) {
                        blast[y][0] = blast[x][0];
                        blast[y][1] = blast[x][1] - 1;
                        y++;
                    }
                }


            if ((blast[x][0]) >= 0 && (blast[x][0]) < l && (blast[x][1] + 1) >= 0 && (blast[x][1] + 1) < b)
                if ((arr[blast[x][0]][blast[x][1] + 1]).equals("L")) {
                    for (z = 0; z < y; z++) {
                        if (blast[z][0] == blast[x][0] && blast[z][1] == (blast[x][1] + 1))
                            break;
                        if (exp[z][0] == (blast[x][0]) && exp[z][1] == (blast[x][1] + 1))
                            break;
                    }
                    if (y == z) {
                        blast[y][0] = blast[x][0];
                        blast[y][1] = blast[x][1] + 1;
                        y++;
                    }
                }


            if ((blast[x][0] + 1) >= 0 && (blast[x][0] + 1) < l && (blast[x][1]) >= 0 && (blast[x][1]) < b)
                if ((arr[blast[x][0] + 1][blast[x][1]]).equals("L")) {
                    for (z = 0; z < y; z++) {
                        if (blast[z][0] == (blast[x][0] + 1) && blast[z][1] == blast[x][1])
                            break;
                        if (exp[z][0] == (blast[x][0] + 1) && exp[z][1] == (blast[x][1]))
                            break;
                    }
                    if (y == z) {
                        blast[y][0] = blast[x][0] + 1;
                        blast[y][1] = blast[x][1];
                        y++;
                    }
                }
            exp[x][0] = blast[x][0];
            exp[x][1] = blast[x][1];

            x++;
        }
        System.out.println();
        if (check != 0)
            System.out.println("YOU DROPPED THE BOMB OVER WATER!!!");

        if (check == 0)
            for (x = 0; x < l; x++) {
                for (y = 0; y < b; y++)
                    System.out.print(arr[x][y] + "   ");
                System.out.println();
            }


        for (x = 0; x < l; x++) {
            for (y = 0; y < b; y++) {
                for (z = 0; z < l * b; z++) {
                    if (exp[z][0] == x && exp[z][1] == y)
                        arr[x][y] = "B";
                }
            }
        }

        if (check == 0) {
            System.out.println();
            System.out.println();
            for (x = 0; x < l; x++) {
                for (y = 0; y < b; y++)
                    System.out.print(arr[x][y] + "   ");
                System.out.println();
            }
        }

    }
}
