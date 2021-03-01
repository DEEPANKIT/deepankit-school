import java.io.*;
import java.util.*;

class SudokuCheck {
    public static void main(String[] args) throws java.lang.Exception {
        DataInputStream z1 = new DataInputStream(System.in);
        System.out.println("Enter the solution of a SUDOKU in an 9 by 9 format");
        String ar;
        int[][] arr = new int[9][9];
        int x, y, z, w;
        Scanner sc =new Scanner(System.in);
        for (x = 0; x < 9; x++) {
            ar = z1.readLine();
            sc = new Scanner(ar);
            sc.useDelimiter(" ");
            for (y = 0; y < 9; y++)
                arr[x][y] = sc.nextInt();
        }
        String S = "";
        int a = 0;
        for (x = 0; x < 9; x++) {
            for (z = 1; z <= 9; z++) {
                for (y = 0; y < 9; y++) {
                    if (arr[x][y] == z) {
                        a++;
                        break;
                    }
                }

            }
            if (a != 9) {
                S = "Invalid";
                break;
            }
            a = 0;
        }
        for (x = 0; x < 9; x++) {
            for (z = 1; z <= 9; z++) {
                for (y = 0; y < 9; y++) {

                    if (arr[y][x] == z) {
                        a++;
                        break;
                    }
                }
            }
            if (a != 9) {
                S = "Invalid";
                break;
            }
            a = 0;
        }
        int l, b, l1, b1;
        for (l = 0; l <= 6; l = l + 3) {
            for (b = 0; b <= 6; b = b + 3) {
                l1 = l + 3;
                b1 = b + 3;
                for (z = 1; z <= 9; z++) {
                    for (x = l; x < l1; x++) {
                        for (y = b; y < b1; y++) {
                            if (arr[x][y] == z) {
                                a++;
                                break;
                            }
                        }
                        if (y < b)
                            break;
                    }
                }
                if (a != 9) {
                    S = "Invalid";
                    break;
                }
                a = 0;
            }
        }
        if (S.equals("Invalid"))
            System.out.println(S);
        else
            System.out.println("Valid");

            sc.close();

    }
}