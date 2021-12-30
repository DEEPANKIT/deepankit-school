import java.util.*;
class disarium
{
	private int num,size;
	public disarium(int nn) //parameterized constructor
	{
		num=nn;
		size=0;
	}
	public void countDigit()
	{
		int temp=num;
		while(temp!=0)
		{
			size++;
			temp/=10;
		}
	}
	public int sumOfDigits(int n,int p)
	{
		if(n==0)
			return 0;
		else
			return (int)(Math.pow(n%10,p--))+sumOfDigits(n/10,p);
	}
	public void check()
	{
		countDigit();
		if(sumOfDigits(num,size)==num)
			System.out.print("It is a disarium number");
		else
			System.out.print("It is not a disarium number");
	}
	public static void main(String a[])
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter a no. to check it is a disarium no. or not- ");
		int n=s.nextInt();
		disarium d1=new disarium(n);
		d1.check();
	}
}