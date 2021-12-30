import java.util.*;

class rotate {
    public static void main(String at[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1st word");
        String s = sc.nextLine();
        System.out.println("Enter 2nd word");
        String b = sc.nextLine();
        String w = b, w1 = b;
        int c = 0;
        while (true) {
            w = w.charAt(w.length() - 1) + w.substring(0, w.length() - 1);
            w1 = w1.substring(1, w1.length()) + w1.charAt(0);
            c++;
            if (w.equals(s) || w1.equals(s))
                break;
            else if (w.equals(b) && w1.equals(b)) {
                System.out.println("NOT POSSIBLE");
                break;
            }
        }
        System.out.println();
        if (w.equals(s)) {
            System.out.println("Right rotation");
            System.out.println("No. of rotations = " + c);
        }
        if (w1.equals(s)) {
            System.out.println("Left rotation");
            System.out.println("No. of rotations = " + c);
        }
    }
}