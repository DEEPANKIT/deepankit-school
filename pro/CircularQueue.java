import java.util.*;

class CircularQueue {
    private int a[];
    private int f, r, max;

    public CircularQueue(int size) {
        a = new int[size];
        f = r = -1;
        max = size;
    }

    public void push(int p) {
        if (f == 0 && r == max - 1 || f == r + 1)
            System.out.println("Overflow");
        else {
            if (f == -1)
                f = 0;
            r = (r + 1) % max;
            a[r] = p;
        }
    }

    public int pop() {
        if (f == -1)
            return -9999;
        else {
            int n = a[f];
            if (f == r)
                f = r = -1;
            else
                f = (f + 1) % max;
            return n;
        }
    }

    public int peek() {
        if (f == -1)
            return -9999;
        else
            return a[f];
    }
}

class exec {
    public static void main(String at[]) {
        System.out.println("Enter size");
        Scanner sc = new Scanner(System.in);
        CircularQueue q = new CircularQueue(sc.nextInt());
        int ch, w;
        do {
            System.out.println("1 - Push\n2 - Pop\n3 - Peek\n4 - Exit");
            ch = sc.nextInt();
            switch (ch) {
                case 1:
                    System.out.println("Enter element to push");
                    w = sc.nextInt();
                    q.push(w);
                    break;
                case 2:
                    w = q.pop();
                    if (w == -9999)
                        System.out.println("Underflow");
                    else
                        System.out.println("Element popped is " + w);
                    break;
                case 3:
                    w = q.peek();
                    if (w == -9999)
                        System.out.println("Underflow");
                    else
                        System.out.println("Element peeked is " + w);
                    break;
                case 4:
                    break;
                default:
                    System.out.println("Invalid choice");
            }
        } while (ch != 4);
    }
}