import java.util.*;
class mergesort
{
	public static void mergeSort(int[] a, int n) 
	{
		if (n < 2)
			return;
		int mid = n / 2;
		int[] l = new int[mid];
		int[] r = new int[n - mid];
		for (int i = 0; i < mid; i++) 
			l[i] = a[i];
		for (int i = mid; i < n; i++) 
			r[i - mid] = a[i];
		mergeSort(l, mid);
		mergeSort(r, n - mid);
		merge(a, l, r, mid, n - mid);
	}
	public static void merge(int[] a, int[] l, int[] r, int left, int right) 
	{
		int i = 0, j = 0, k = 0;
		while (i < left && j < right)
			if (l[i] <= r[j])
				a[k++] = l[i++];
			else
				a[k++] = r[j++];
		while (i < left)
			a[k++] = l[i++];
		while (j < right)
			a[k++] = r[j++];
	}
	public static void main(String hj[])
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the no. of Elements to be entered- ");
		int n=s.nextInt();
		System.out.println("Enter values...");
		int inputArray[]=new int[n];
		for(int i=0;i<n;i++){
			inputArray[i]=s.nextInt();
	}
		mergeSort(inputArray,n);
		for(int i=0;i<n;i++)
			System.out.print(inputArray[i]+",");
	}
}
