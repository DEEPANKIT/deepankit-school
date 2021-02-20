package com.company;

import java.io.DataInputStream;

class Similarity {
    public static void main(String[] args) throws java.lang.Exception {
        DataInputStream z = new DataInputStream(System.in);
        System.out.println("\n" + "Enter the number of elements in the array");
        int n = Integer.parseInt(z.readLine());
        int x, y, i, j, p, count = 0;
        System.out.println("\n" + "Enter " + n + " numbers");
        int[] arr = new int[n];
        String s = z.readLine();
        String[] l = s.split(" ", 0);
        for (x = 0; x < n; x++)
            arr[x] = Integer.parseInt(l[x]);

        int[] pos = new int[n];
        for (x = 0; x < n; x++)
            pos[x] = x;
        int t;
        for (i = 0; i < n; i++) {
            x = arr[i];
            p = i;
            for (j = i + 1; j < n; j++) {
                if (x > arr[j]) {
                    x = arr[j];
                    p = j;
                }
            }
            y = arr[i];
            arr[i] = arr[p];
            arr[p] = y;
            t = pos[i];
            pos[i] = pos[p];
            pos[p] = t;
        }

        for (x = 0; x < n; x++) {
            for (y = x; y < n - 1; y++) {
                if (arr[y] == (arr[y + 1] - 1)) {
                    if (pos[x] < pos[y + 1])
                        System.out.print("(" + (pos[x] + 1) + "," + (pos[y + 1] + 1) + ")");
                    else
                        System.out.print("(" + (pos[y + 1] + 1) + "," + (pos[x] + 1) + ")");
                    if (y == x)
                        System.out.print("   ");
                    else
                        System.out.print("(t)   ");
                    count++;
                } else if (arr[y] == arr[y + 1])
                    continue;
                else
                    break;

            }
        }
        System.out.println("\n" + "\n" + "Total number of Pair of Indices:  " + count + "\n");
    }
}