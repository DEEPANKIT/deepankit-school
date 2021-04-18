import java.util.*;
import java.io.*;

class farm_land {
    public static void main(String[] args) throws Exception {
        boolean bm = true;
        DataInputStream sc = new DataInputStream(System.in);
        int l, b, x;
        String l1 = "", b1 = "";
        System.out.println("Enter the coordinates of the Farm");
        String s = sc.readLine(); // Input
        int le = s.length();
        for (x = 0; x < le; x++) {
            if (s.charAt(x) != ',')
                l1 = l1 + s.charAt(x);
            else {
                x++;
                break;
            }
        }
        for (x = x; x < le; x++) {
            b1 = b1 + s.charAt(x);
        }
        l = Integer.parseInt(l1);
        b = Integer.parseInt(b1);
        int arr[][] = new int[l][b];
        System.out.println("Enter the no of lamps placed");
        int cellno = Integer.parseInt(sc.readLine());
        int lamp[][] = new int[cellno][2];
        int y;
        l1 = "";
        b1 = "";
        for (x = 0; x < cellno; x++) {
            System.out.println("Enter the coordinates of the lamp");
            s = sc.readLine();
            le = s.length();
            for (y = 0; y < le; y++) {
                if (s.charAt(y) != ',') {
                    l1 = l1 + s.charAt(y);
                    lamp[x][0] = Integer.parseInt(l1);
                } else {
                    y++;
                    break;
                }
            }
            for (y = y; y < le; y++) {
                b1 = b1 + s.charAt(y);
                lamp[x][1] = Integer.parseInt(b1);
            }
            l1 = "";
            b1 = "";
        }
        for (x = 0; x < cellno; x++) {
            arr[lamp[x][0]][lamp[x][1]] = arr[lamp[x][0]][lamp[x][1]] + 10;
        }

        for (x = 0; x < cellno; x++) {
            if ((lamp[x][0] - 1) >= 0 && (lamp[x][0] - 1) < l && (lamp[x][1] - 1) >= 0 && (lamp[x][1] - 1) < b)
                arr[lamp[x][0] - 1][lamp[x][1] - 1]++;
            if ((lamp[x][0] + 1) >= 0 && (lamp[x][0] + 1) < l && (lamp[x][1] + 1) >= 0 && (lamp[x][1] + 1) < b)
                arr[lamp[x][0] + 1][lamp[x][1] + 1]++;
            if ((lamp[x][0] - 1) >= 0 && (lamp[x][0] - 1) < l && (lamp[x][1]) >= 0 && (lamp[x][1]) < b)
                arr[lamp[x][0] - 1][lamp[x][1]]++;
            if ((lamp[x][0]) >= 0 && (lamp[x][0]) < l && (lamp[x][1] - 1) >= 0 && (lamp[x][1] - 1) < b)
                arr[lamp[x][0]][lamp[x][1] - 1]++;
            if ((lamp[x][0]) >= 0 && (lamp[x][0]) < l && (lamp[x][1] + 1) >= 0 && (lamp[x][1] + 1) < b)
                arr[lamp[x][0]][lamp[x][1] + 1]++;
            if ((lamp[x][0] + 1) >= 0 && (lamp[x][0] + 1) < l && (lamp[x][1]) >= 0 && (lamp[x][1]) < b)
                arr[lamp[x][0] + 1][lamp[x][1]]++;
            if ((lamp[x][0] + 1) >= 0 && (lamp[x][0] + 1) < l && (lamp[x][1] - 1) >= 0 && (lamp[x][1] - 1) < b)
                arr[lamp[x][0] + 1][lamp[x][1] - 1]++;
            if ((lamp[x][0] - 1) >= 0 && (lamp[x][0] - 1) < l && (lamp[x][1] + 1) >= 0 && (lamp[x][1] + 1) < b)
                arr[lamp[x][0] - 1][lamp[x][1] + 1]++;
        }
        for (x = 0; x < l; x++) {
            for (y = 0; y < b; y++)
                System.out.print(arr[x][y] + " ");
        }
        int check = 0;
        int count = 0;
        for (x = 0; x < cellno; x++) {
            arr[lamp[x][0]][lamp[x][1]] = arr[lamp[x][0]][lamp[x][1]] - 10;
            if ((lamp[x][0] - 1) >= 0 && (lamp[x][0] - 1) < l && (lamp[x][1] - 1) >= 0 && (lamp[x][1] - 1) < b)
                arr[lamp[x][0] - 1][lamp[x][1] - 1]--;
            if ((lamp[x][0] + 1) >= 0 && (lamp[x][0] + 1) < l && (lamp[x][1] + 1) >= 0 && (lamp[x][1] + 1) < b)
                arr[lamp[x][0] + 1][lamp[x][1] + 1]--;
            if ((lamp[x][0] - 1) >= 0 && (lamp[x][0] - 1) < l && (lamp[x][1]) >= 0 && (lamp[x][1]) < b)
                arr[lamp[x][0] - 1][lamp[x][1]]--;
            if ((lamp[x][0]) >= 0 && (lamp[x][0]) < l && (lamp[x][1] - 1) >= 0 && (lamp[x][1] - 1) < b)
                arr[lamp[x][0]][lamp[x][1] - 1]--;
            if ((lamp[x][0]) >= 0 && (lamp[x][0]) < l && (lamp[x][1] + 1) >= 0 && (lamp[x][1] + 1) < b)
                arr[lamp[x][0]][lamp[x][1] + 1]--;
            if ((lamp[x][0] + 1) >= 0 && (lamp[x][0] + 1) < l && (lamp[x][1]) >= 0 && (lamp[x][1]) < b)
                arr[lamp[x][0] + 1][lamp[x][1]]--;
            if ((lamp[x][0] + 1) >= 0 && (lamp[x][0] + 1) < l && (lamp[x][1] - 1) >= 0 && (lamp[x][1] - 1) < b)
                arr[lamp[x][0] + 1][lamp[x][1] - 1]--;
            if ((lamp[x][0] - 1) >= 0 && (lamp[x][0] - 1) < l && (lamp[x][1] + 1) >= 0 && (lamp[x][1] + 1) < b)
                arr[lamp[x][0] - 1][lamp[x][1] + 1]--;
            if ((lamp[x][0] - 1) >= 0 && (lamp[x][0] - 1) < l && (lamp[x][0] + 1) >= 0 && (lamp[x][0] + 1) < b) {

                System.out.println("Non Essential lamp is: " + lamp[x][0] + "," + lamp[x][1]);
            }
        }

        check = 0;
        if (bm) {
            arr[lamp[x][0]][lamp[x][1]] = arr[lamp[x][0]][lamp[x][1]] + 10;
            if ((lamp[x][0] - 1) >= 0 && (lamp[x][0] - 1) < l && (lamp[x][1] - 1) >= 0 && (lamp[x][1] - 1) < b)
                arr[lamp[x][0] - 1][lamp[x][1] - 1]++;
            if ((lamp[x][0] + 1) >= 0 && (lamp[x][0] + 1) < l && (lamp[x][1] + 1) >= 0 && (lamp[x][1] + 1) < b)
                arr[lamp[x][0] + 1][lamp[x][1] + 1]++;
            if ((lamp[x][0] - 1) >= 0 && (lamp[x][0] - 1) < l && (lamp[x][1]) >= 0 && (lamp[x][1]) < b)
                arr[lamp[x][0] - 1][lamp[x][1]]++;
            if ((lamp[x][0]) >= 0 && (lamp[x][0]) < l && (lamp[x][1] - 1) >= 0 && (lamp[x][1] - 1) < b)
                arr[lamp[x][0]][lamp[x][1] - 1]++;
            if ((lamp[x][0]) >= 0 && (lamp[x][0]) < l && (lamp[x][1] + 1) >= 0 && (lamp[x][1] + 1) < b)
                arr[lamp[x][0]][lamp[x][1] + 1]++;
            if ((lamp[x][0] + 1) >= 0 && (lamp[x][0] + 1) < l && (lamp[x][1]) >= 0 && (lamp[x][1]) < b)
                arr[lamp[x][0] + 1][lamp[x][1]]++;
            if ((lamp[x][0] + 1) >= 0 && (lamp[x][0] + 1) < l && (lamp[x][1] - 1) >= 0 && (lamp[x][1] - 1) < b)
                arr[lamp[x][0] + 1][lamp[x][1] - 1]++;
            if ((lamp[x][0] - 1) >= 0 && (lamp[x][0] - 1) < l && (lamp[x][1] + 1) >= 0 && (lamp[x][1] + 1) < b)
                arr[lamp[x][0] - 1][lamp[x][1] + 1]++;
            count++;
        } else {
            System.out.println("Non Essential lamp is: " + lamp[x][0] + "," + lamp[x][1]);
        }
        System.out.println("Number of Essential lamps are: " + count);
    }
}
