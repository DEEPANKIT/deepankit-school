import java.util.*;
class node
{
	public node left;
	public int a;
	public node right;
	public node(int k)
	{
		a=k;
		left=right=null;
	}
}
class btree
{
	private node M;
	public void add(int k)
	{
		M=add(M,k);
	}
	public node add(node R,int k)
	{
		if(R==null)
			R=new node(k);
		else if(R.a==k)
			System.out.println("Node already exists");
		else if(k>R.a)
			R.right=add(R.right,k);
		else
			R.left=add(R.left,k);
		return R;
	}
	public void inorder()
	{
		inorder(M);
	}
	public void inorder(node R)
	{
		if(R==null)
			return;
		else
		{
			inorder(R.left);
			System.out.print(R.a+", ");
			inorder(R.right);
		}
	}
}
class btree_linkedlist
{
	public static void main(String gh[])
	{
		btree b1=new btree();
		Scanner s=new Scanner(System.in);
		System.out.println("Enter number of values- ");
		int n=s.nextInt();
		System.out.print("Enter the values of the binary tree- \n");
		for(int i=1;i<=n;i++)
			b1.add(s.nextInt());
		b1.inorder();
	}
}
