import java.io.*;

class DeciTri {
    private int n, tri;

    public DeciTri() // default constructor
    {
        n = 0;
        tri = 0;
    }

    public void getnum(int nn) {
        n = nn;
    }

    public void deci_tri() // to calculate trinary equivalent
    {
        int t = n, m, c = 0, s = 0;
        while (t != 0) {
            m = t % 3;
            s = s + (m * (int)Math.pow(10, c));
            t = t / 3;
            c++;
        }
        tri = s;
    }

    public void show() {
        System.out.println("decimal no.=" + n);
        deci_tri();
        System.out.println("trinary equivalent=" + tri);
    }

    public static void main(String ar[]) throws Exception {
        DataInputStream z = new DataInputStream(System.in);
        int n1;
        System.out.println("enter a decimal no.");
        n1 = Integer.parseInt(z.readLine());
        DeciTri obj = new DeciTri();
        obj.getnum(n1);
        obj.show();
    }
} // end of class
