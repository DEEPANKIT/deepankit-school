import java.util.*;
class MatRev
{
    private int arr[][],m,n;
    public MatRev(int mm,int nn)
    {
        m=mm;
        n=nn;                                                                                                       //PARAMETERISED CONSTRUCTOR
        arr=new int[m][n];
    }

    public void fillarray()throws Exception
    {
        Scanner sc=new Scanner(System.in);
        int i=0,j=0;
        System.out.println("ENTER ALL THE ELEMENTS OF ARRAY");
        for(i=0;i<m;i++)
        {
            for(j=0;j<n;j++)                                                                                //ARRAY INITIALIZATION
                arr[i][j]=sc.nextInt();
            sc.nextLine();
        }
        return;
    }

    public int reverse(int x)
    {
        int p=0;
        if(x<10)
            return x;
        else
        {
            while(x!=0)
            {
                p=p*10+(x%10);
                x=x/10;
            }
            return p;
        }
    }

    public void revMat(MatRev p)
    {
        int i,j;
        i=j=0;
        for(i=0;i<m;i++)
            for(j=0;j<n;j++)
                this.arr[i][j]=reverse(p.arr[i][j]);
    }

    public void show()
    {
        String s="%"+10+"d";
        int i=0,j=0;
        for(i=0;i<m;i++)                                           //PRINTING THE DETAILS
        {
            for(j=0;j<n;j++)
                System.out.printf(s,arr[i][j]);
            System.out.println();
        }
    }

    public static void main(String ar[])throws Exception
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("ENTER ROW AND COLUMNS");
        int r=sc.nextInt();
        int c=sc.nextInt();
        MatRev x1=new MatRev(r,c);
        MatRev x2=new MatRev(r,c);
        x1.fillarray();                              
        System.out.println("ORIGINAL ARRAY");
        x1.show();
        System.out.println();    
        x2.revMat(x1);
        System.out.println("REVERSED ARRAY");
        x2.show();
}
}