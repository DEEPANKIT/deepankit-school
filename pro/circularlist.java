import java.io.*;

class link {
    int data;
    link next;
}

class circularlist {
    public static void main(String ar[]) throws Exception {
        link l1, l2, l3, l4;
        l1 = l2 = null;
        char ch;
        int k, n, x, pos = 1, h, c, c1;
        DataInputStream z = new DataInputStream(System.in);
        do {
            System.out.println("Enter a number ->");
            k = Integer.parseInt(z.readLine());
            if (l1 == null) {
                l1 = l2 = new link();
                l1.data = k;
                l1.next = null;
            } else {
                l2.next = new link();
                l2 = l2.next;
                l2.data = k;
                l2.next = null;
            }
            System.out.println("Do you want to continue Y/N ->");
            ch = z.readLine().charAt(0);
            ch = Character.toUpperCase(ch);
        } while (ch != 'N');
        l2.next = l1;
        outer: do {
            System.out.println("Enter choice->\n1)Insert\n2)Delete\n3)Search\n4)Print\n5)Exit");
            c1 = Integer.parseInt(z.readLine());
            switch (c1) {
                case 1:
                    abc: do {
                        System.out.println();
                        System.out.println(
                                "Enter choice->\n1)Add at a position\n2)Add after a value\n3)Add before a value\n4)Exit");
                        c = Integer.parseInt(z.readLine());
                        switch (c) {
                            case 1:
                                System.out.println("Enter the number to inserted ->");
                                k = Integer.parseInt(z.readLine());
                                System.out.println("Enter the position at which the number is to be inserted->");
                                n = Integer.parseInt(z.readLine());
                                pos = 1;
                                l3 = new link();
                                l3.data = k;
                                l3.next = null;
                                for (l2 = l1; l2.next != l1; l2 = l2.next) {
                                    pos++;
                                    if (n < 1) {
                                        System.out.println("Invalid position");
                                        break;
                                    }
                                    if (n == 1) {
                                        l4 = l1;
                                        while (l4.next != l1)
                                            l4 = l4.next;
                                        l3.next = l1;
                                        l1 = l3;
                                        l4.next = l1;
                                        break;
                                    }
                                    if (pos == n) {
                                        l3.next = l2.next;
                                        l2.next = l3;
                                        break;
                                    }
                                } // end of for
                                if (l2.next == l1 && n > pos) // if n>no.of elements entered
                                {
                                    l2.next = l3;
                                    l3.next = l1;
                                }
                                break;
                            case 2:
                                System.out.println("Enter number to be inserted ->");
                                k = Integer.parseInt(z.readLine());
                                System.out.println("Enter number after which you want to insert ->");
                                h = Integer.parseInt(z.readLine());
                                l3 = l1;
                                l4 = new link();
                                l4.data = k;
                                l4.next = null;
                                while (l3.data != h)
                                    l3 = l3.next;
                                if (l3.next == l1) {
                                    l3.next = l4;
                                    l4.next = l1;
                                } else {
                                    l4.next = l3.next;
                                    l3.next = l4;
                                }
                                break;
                            case 3:
                                System.out.println("Enter number to be inserted ->");
                                k = Integer.parseInt(z.readLine());
                                System.out.println("Enter number before which you want to insert ->");
                                h = Integer.parseInt(z.readLine());
                                l3 = new link();
                                l4 = new link();
                                l4.data = k;
                                l4.next = null;
                                l3 = l1;
                                if (l1.data != h) {
                                    while (l3.next.data != h)
                                        l3 = l3.next;
                                    l4.next = l3.next;
                                    l3.next = l4;
                                } else {
                                    link l5 = l1;
                                    while (l5.next != l1)
                                        l5 = l5.next;
                                    l4.next = l1;
                                    l1 = l4;
                                    l5.next = l1;
                                }
                                break;
                            case 4:
                                break abc;
                            default:
                                System.out.println("Wrong choice");
                        }// end of switch
                    } while (c != 4);
                    break;
                case 2:
                    abc: do {
                        System.out.println();
                        System.out.println("Enter choice->\n1)Delete at a position\n2)Delete a value\n3)Exit");
                        c = Integer.parseInt(z.readLine());
                        switch (c) {
                            case 1:
                                System.out.println("Enter the position at which the number is to be deleted ->");
                                n = Integer.parseInt(z.readLine());
                                pos = 1;
                                l3 = new link();
                                for (l2 = l1; l2.next != l1; l2 = l2.next) {
                                    pos++;
                                    if (n < 1) {
                                        System.out.println("Invalid postion");
                                        break;
                                    }
                                    if (n == 1) {
                                        while (l2.next != l1)
                                            l2 = l2.next;
                                        l1 = l1.next;
                                        l2.next = l1;
                                        break;
                                    }
                                    if (pos == n) {
                                        l3 = new link();
                                        l3 = l2.next;
                                        l2.next = l3.next;
                                        l3.next = null;
                                        break;
                                    }
                                } // end of for
                                break;
                            case 2:
                                System.out.println("Enter number which you want to delete :");
                                h = Integer.parseInt(z.readLine());
                                int f = 0, g = 0;
                                l3 = l1;
                                while (l3.data != h) {
                                    if (l3.next == l1) {
                                        f = 1;
                                        break;
                                    } else
                                        l3 = l3.next;
                                }
                                if (l3.data == h && f != 1) {
                                    l3 = l1;
                                    l4 = new link();
                                    if (l1.data != h) {
                                        while (l3.next.data != h) {
                                            if (l3.next == l1) {
                                                g = 1;
                                                break;
                                            }
                                            l3 = l3.next;
                                        }
                                        l4 = l3.next;
                                        l3.next = l4.next;
                                        l4.next = null;
                                    } else {
                                        l3 = l1;
                                        while (l3.next != l1)
                                            l3 = l3.next;
                                        l1 = l1.next;
                                        l3.next = l1;
                                    }
                                } else
                                    System.out.println("Not found");
                                break;
                            case 3:
                                break abc;
                            default:
                                System.out.println("Wrong choice");
                        }// end of switch
                    } while (c != 3);
                    break;
                case 3:
                    System.out.println("Enter the number to searched ->");
                    k = Integer.parseInt(z.readLine());
                    l3 = l1;
                    while (l3.data != k) {
                        if (l3.next == l1)
                            break;
                        else
                            l3 = l3.next;
                    }
                    if (l3.data == k)
                        System.out.println("Found");
                    else
                        System.out.println("Not found");
                    break;
                case 4:
                    l2 = l1;
                    do {
                        System.out.print(l2.data + "  ");
                        l2 = l2.next;
                    } while (l2 != l1);
                    System.out.println();
                    break;
                case 5:
                    break outer;
                default:
                    System.out.println("Wrong choice");
            }
        } while (c1 != 5);
    }
}