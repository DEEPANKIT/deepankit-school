import java.util.*;
class HighestArea
{
	public static void main(String jk[])
	{
		Scanner s=new Scanner(System.in);
		int row,column,i,j,lengthy,breadth,k,l=0,area=0,largest=0,m,n;
		System.out.println("Enter no. of rows-");
		row=s.nextInt(); //inputting dimensions of array
		System.out.println("Enter no. of columns-");
		column=s.nextInt();
		int array[][]=new int[row][column];
		//input array
		System.out.println("Enter the array- ");
		for(i=0;i<row;i++)
			for(j=0;j<column;j++)
				array[i][j]=s.nextInt();

		for(i=0;i<row;i++) //to calculate area of every possible combination of rectangle
			for(j=0;j<column;j++)
				for(m=i;m<row;m++)
					for(n=j;n<column;n++)
						if((m-i)!=(n-j) && (m-i)!=0 && (n-j)!=0)
						{
							first:for(k=i;k<=m;k++)
								for(l=j;l<=n;l++)
									if(array[k][l]==0)
										break first;
									if(k==m+1 && l==n+1)
										area=(m-i+1)*(n-j+1);
									if(area>largest) //finding largest area
										largest=area;
						}
		System.out.print("Max area- \n"+largest);
	}//end of main
}//end of class