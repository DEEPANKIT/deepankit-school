import java.util.*;
class link
{
	int data;
		link next;
			link previous;
}
class insertsort
{
	public static void main(String hj[])throws Exception
	{
		link l1,l2,l3,l4;
		l1=l2=null;
		int i,N,k,val=0,j;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter number of values");
		N=s.nextInt();
		System.out.println("Enter the Values to be sorted- ");
		for(i=0;i<N;i++)
		{
			k=s.nextInt();
			if(l1==null)
			{
				l1=l2=new link();
				l1.data=k;
				l1.next=null;
				l1.previous=null;
			}
			else
			{
				l2.next=new link();
				l2.next.previous=l2;
				l2=l2.next;
				l2.data=k;
				l2.next=null;
			}
		}
		l3=l1;
		int m=0,n=0;
		for(i=0;i<N;i++)
		{
			l3=l1;
			for(j=0;j<i;j++)
				l3=l3.next;
			val=l3.data;
			while(l3.previous!=null && l3.previous.data>val)
			{
				l3.data=l3.previous.data;
				l3=l3.previous;
			}
			if(l3==null)
			{
				l3=l1;
				l3.data=val;
			}
			else
				l3.data=val;
		}
		l3=l1;
		while(l3.next!=null)
		{
			System.out.print(l3.data+" ");
			l3=l3.next;
		}
		System.out.println(l3.data);
	}
}
