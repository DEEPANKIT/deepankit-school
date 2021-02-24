import java.util.*;
class Queue
{
private int a[];
private int f,r;
public Queue(int size)
{
a=new int[size];
f=r=-1;
}
public void push(int p)
{
if(r==a.length-1 && f!=0)
{
r=0;
a[r]=p;
System.out.println("Value pushed="+p);
}
else
{
if(f==(r%a.length)+1 || r==a.length-1)
System.out.println("Overflow");
else
{
if(f==-1)
f=0;
r=(r%a.length)+1;
a[r]=p;
System.out.println("Value pushed="+p);
}
}
}      //end of push
public int pop()
{
if(f==-1 || f==r)
{
f=r=-1;
return -9999;
}
else
{
f=f%a.length;
return a[f++];
}
}                  //end of pop
public int peek()
{
if(f==-1 || f>r)
return -9999;
else
return a[f];
}                  //end of peek
}                   //end of Queue


class circular
{
public static void main(String ar[])
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter tolal no. of elements");
int s=sc.nextInt();
Queue q=new Queue(s);
int ch,w;
do
{
System.out.println("1.Push\n2.Pop\n3.Peek\n4.Exit");
ch=sc.nextInt();
switch(ch)
{
case 1:
System.out.println("Enter element to be pushed");
w=sc.nextInt();
q.push(w);
break;
case 2:
w=q.pop();
if(w==-9999)
System.out.println("Underflow");
else
System.out.println("Popped value="+w);
break;
case 3:
w=q.peek();
if(w==-9999)
System.out.println("Underflow");
else
System.out.println("Peeked value="+w);
break;
case 4:
break;
default:
System.out.println("Invalid choice");
}
}while(ch!=4);
}
}