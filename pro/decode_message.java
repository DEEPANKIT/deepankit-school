import java.io.*;

class decode_message {
    public static void main(String[] args) throws java.lang.Exception {
        DataInputStream z1 = new DataInputStream(System.in);
        String s1, s2;
        System.out.println("\n" + "Enter the encoded string");
        s1 = z1.readLine();
        System.out.println("\n" + "Enter the Substring of original String");
        s2 = z1.readLine();
        int l1, l2, x, y = 0, z, count = 0;
        l1 = s1.length();
        l2 = s2.length();
        if (l1 < l2) {
            System.out.println("\n" + "Inavlid Input");
            System.exit(0);
        }

        for (x = 0; x <= l1 - l2; x++) {
            for (y = -20; y < 101; y++) {

                if (s1.charAt(x) == (char) (s2.charAt(0) + y)) {

                    count++;
                    for (z = 1; z < l2; z++) {

                        if (s1.charAt(x + z) == (char) (s2.charAt(z) + y))
                            count++;
                        else
                            break;
                    }
                }

                if (count == l2)
                    break;
                else
                    count = 0;
            }
            if (y != 101)
                break;
        }
        if (y != 101) {
            System.out.println();
            for (x = 0; x < l1; x++) {
                System.out.print((char) (s1.charAt(x) - y));
            }
            System.out.println();
        } else
            System.out.println("The encoding variable is out of range");
    }
}