import java.io.DataInputStream;

class Stack {
    private final int[] a;
    int tos;

    public Stack(int size) {
        a = new int[size];
        tos = -1;
    }

    public static void main(String[] ar) throws Exception {
        DataInputStream z = new DataInputStream(System.in);

        Stack s1 = new Stack(5);
        int ch, p;
        do {
            System.out.println("1.Push \n2.Pop \n3.Peek \n4.Exit");
            ch = Integer.parseInt(z.readLine());

            switch (ch) {
                case 1:
                    System.out.println("Enter element to be pushed");
                    p = Integer.parseInt(z.readLine());
                    s1.push(p);
                    break;

                case 2:
                    p = s1.pop();
                    if (p == -9999)
                        System.out.println("UNDERFLOW");
                    else
                        System.out.println("Poped Value is:  " + p);
                    break;

                case 3:
                    p = s1.peek();
                    if (p == -9999)
                        System.out.println("UNDERFLOW");
                    else
                        System.out.println("Peeked Value is:  " + p);
                    break;
                case 4:
                    break;
                default:
                    System.out.println("Invalid Choice");


            }

        } while (ch != 4);

    }

    public void push(int t) {
        if (tos == a.length - 1)
            System.out.println("Overflow");
        else
            a[++tos] = t;
    }

    public int pop() {
        if (tos == -1)
            return -9999;
        else
            return a[tos--];
    }

    public int peek() {
        if (tos == -1)
            return -9999;
        else
            return a[tos];
    }


}






