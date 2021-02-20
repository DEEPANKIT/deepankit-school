import java.io.DataInputStream;
import java.util.Queue;

class CircularQueue {
    private int a[];
    private int front, rear;

    public CircularQueue(int size) {
        a = new int[size];
        front = rear = -1;

    }

    public static void main(String ar[]) throws Exception {
        DataInputStream z = new DataInputStream(System.in);

        Queue s1 = new Queue(5);
        int ch, w;

        do {
            System.out.println("1.Push \n2.Pop \n3.Peek \n4.Exit");
            ch = Integer.parseInt(z.readLine());

            switch (ch) {
                case 1:

                    System.out.println("Enter element to be pushed");
                    w = Integer.parseInt(z.readLine());
                    s1.push(w);
                    break;

                case 2:
                    w = s1.pop();
                    if (w == -9999)
                        System.out.println("UNDERFLOW");
                    else
                        System.out.println("Poped Value is:  " + w);
                    break;

                case 3:
                    w = s1.peek();
                    if (w == -9999)
                        System.out.println("UNDERFLOW");
                    else
                        System.out.println("Peeked Value is:  " + w);
                    break;
                case 4:
                    break;
                default:
                    System.out.println("Invalid Choice");


            }

        } while (ch != 4);

    }

    public void push(int p) {
        if ((front == 0 && rear == a.length - 1) || (front == rear + 1)) {
            System.out.println("OVERFLOW");
        } else {
            if (front == -1)
                front = 0;
            rear = (rear + 1) % a.length;
            a[rear] = p;
            System.out.println("PUSHED " + p);
        }
    }

    public int pop() {
        int p;
        if (front == -1) {
            return -9999;
        } else {
            p = a[front];
            if (front == rear) {
                front = -1;
                rear = -1;
            } else {
                front = (front + 1) % a.length;
            }
            return p;
        }
    }

    public int peek() {
        int p;
        if (front == -1) {

            return -9999;
        } else {


            return a[front];
        }


    }
}
