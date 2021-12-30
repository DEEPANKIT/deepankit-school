import java.util.*;
class LuckyNumber
{
 public static void main(String at[])
 {
  Scanner sc=new Scanner(System.in);
  int n,a[],x,y,i=0,b=0,p=0;
  System.out.println("Enter length of an array");
  n=sc.nextInt();
  a=new int[n];
  System.out.println("Enter the position to start checking");
  i=sc.nextInt();
  for(x=0;x<n;x++)  //inputing
  { 
   System.out.println("Enter an integer");
   a[x]=sc.nextInt();
  }  //end of loop
  for(x=0;x<n-1;x++)  //for numbers to be deleted
  {
   b=a[i];
   a[i]=0;
   if(b>0)
   {
    for(y=1;y<=b;y++)  //Find 0's in the path
    {
     p=i+y;
     p=p%n;
     if(a[p]==0)
      b++;
    }  //end of loop
    i=i+b; 
    i=i%n; 
   }  //end of if
   else
   {
    for(y=-1;y>=b;y--)  //Find 0's in the path
    {
     p=i+y;
     if(p<0)
     {
      while(p<0)
       p=n+p;
     }
     if(a[p]==0)
      b--; 
    }  //end of loop
    i=i+b;
    while(i<0)  //for finding appropriate indexes
     i=i+n;
   }  //end of else
  }  //end of loop
  for(x=0;x<n;x++)  //for finding the lucky number
  {
   if(a[x]!=0)
   {
    System.out.print("Lucky number="+a[x]);
    break; 
   }
  }  //end of loop
 }  //end of main
}  //end of class
