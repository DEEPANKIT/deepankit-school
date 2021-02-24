import java.util.*;
class runaround 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		int n=sc.nextInt();
		int a=n,t=0,i;
		while(a!=0)
		{
			a=a/10;
			t++;
		}
		a=n;
		int ar[][]=new int[t][2];
		for(i=t-1;i>=0;i--)
		{
			ar[i][0]=a%10;
			a=a/10;
		}
		int p=0;
		for(i=0;i<t;i++)
		{
			if(p>=t)
			{
				while(p>=t)
				p=p-t;
			}
			if(ar[p][1]==1)
			break;
			ar[p][1]=1;
			p=p+ar[p][0];
		}
		for(i=0;i<t;i++)
		{
			if(ar[i][1]!=1)
			break;
		}
		if(i==t)
		System.out.print("Runaround Number");
		else
		System.out.print("Not a Runaround Number");
	}
}