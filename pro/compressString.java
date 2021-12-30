
import java.util.*;
class compressString
{
	public static void main(String h[])
	{
		Scanner s=new Scanner(System.in);
		int i,j;  //declaring variables
		System.out.println("Enter the Sentence- ");
		String inputString=s.nextLine();
		String wordArray[]=inputString.split(" ");
		for(i=1;i<=wordArray.length;i++)
		{
			if(wordArray[i-1]!=null)
				System.out.print(wordArray[i-1]+" "+i+",");
			for(j=i;j<wordArray.length;j++)
			{
				if(wordArray[i-1]!=null && wordArray[j]!=null)
					if(wordArray[i-1].equalsIgnoreCase(wordArray[j]))
					{//to find the position where the word is present
						wordArray[j]=null;
						System.out.print(j+1+",");
					}
			}
			System.out.println();
			wordArray[i-1]=null;
		}
	}//end of main
}//end of class
