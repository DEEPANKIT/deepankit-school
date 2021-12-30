import java.util.*;
import java.io.*;

class zoocells {
	public static void main(String[] args) throws java.lang.Exception {
		DataInputStream dr = new DataInputStream(System.in);
		System.out.println("Enter the no. of cells- ");
		int cell = Integer.parseInt(dr.readLine());
		int x1[] = new int[cell];
		int y1[] = new int[cell];
		int x2[] = new int[cell];
		int y2[] = new int[cell];
		String loc[] = new String[cell];
		String X1 = "", Y1 = "", X2 = "", Y2 = "";
		int x, y, sum1 = 0, a, b, pos = 0, sum2 = 0, check = 0, l = 0, r1, r2;
		System.out.println("Enter the coordinates of the cells");
		for (x = 0; x < cell; x++) {
			loc[x] = dr.readLine(); // Input
			int length = loc[x].length();
			while (loc[x].charAt(l) != ',') {
				X1 = X1 + loc[x].charAt(l);
				l = l + 1;
			}
			x1[x] = Integer.parseInt(X1);
			l = l + 1;
			while (loc[x].charAt(l) != ' ') {
				Y1 = Y1 + loc[x].charAt(l);
				l = l + 1;
			}
			y1[x] = Integer.parseInt(Y1);
			l = l + 1;
			while (loc[x].charAt(l) != ',') {
				X2 = X2 + loc[x].charAt(l);
				l = l + 1;
			}
			x2[x] = Integer.parseInt(X2);
			l = l + 1;
			while (l < length) {
				Y2 = Y2 + loc[x].charAt(l);
				l = l + 1;
			}
			y2[x] = Integer.parseInt(Y2);
			l = 0;
			X1 = "";
			Y1 = "";
			X2 = "";
			Y2 = "";
			if (x1[x] > x2[x] && y1[x] > y2[x]) {
				r1 = x1[x];
				x1[x] = x2[x];
				x2[x] = r1;
			}
			if (x1[x] > x2[x] && y2[x] > y1[x]) {
				r1 = x1[x];
				r2 = y1[x];
				x1[x] = x2[x];
				y1[x] = y2[x];
				x2[x] = r1;
				y2[x] = r2;
			}
			if (x2[x] > x1[x] && y2[x] > y1[x]) {
				r1 = y1[x];
				y1[x] = y2[x];
				y2[x] = r1;
			}
			sum1 = sum1 + (int) (((Math.abs(y2[x] - y1[x])) - 1) * ((Math.abs(x2[x] - x1[x])) - 1));
			sum2 = sum2 + (int) ((Math.abs(y2[x] - y1[x]) + 1) * (Math.abs(x2[x] - x1[x]) + 1));
		}
		String inner[] = new String[sum1 + sum2];
		for (x = 0; x < cell; x++) {
			for (a = x1[x] + 1; a < x2[x]; a++) {
				for (b = y1[x] - 1; b > y2[x]; b--) {
					inner[pos] = "" + a + b;
					pos++;
				}
			}
		}
		for (x = 0; x < cell; x++) {
			for (a = x1[x]; a <= x2[x]; a++) {
				for (b = y1[x]; b >= y2[x]; b--) {
					inner[pos] = "" + a + b;
					pos++;
				}
			}
		}
		for (x = 0; x < sum1; x++) {
			for (y = 0; y < (sum1 + sum2); y++) {
				if (inner[x].equals(inner[y]))
					check = check + 1;
			}
		}
		if (check == (sum1 * 2))
			System.out.println("Valid Data");
		else
			System.out.println("Invalid Data");
	}
}
