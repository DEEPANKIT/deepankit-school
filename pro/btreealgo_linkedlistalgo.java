Step 1 - class node
Step 2 - public node(int k)
Step 3 - a=k
Step 4 - left=right=null
Step 5 - endnode(int k)
Step 6 - class btree
Step 7 - void add(int k)
Step 8 - M=add(M,k)
Step 9 - endadd(M,k)
Step 9 - node add(node R,int k)
Step 10 - if R==null
Step 11 - R=new node(k)
Step 12 - endif
Step 13 - if R.a==k
Step 14 - println "Node already exists"
Step 15 - endif
Step 16 - if k>R.a goto step 17 else goto step 18
Step 17 - R.right=add(R.right,k)
Step 18 - R.left=add(R.left,k)
Step 19 - return R
Step 20 - endnodeadd(node R, int k)
Step 21 - void inorder()
Step 22 - inorder(M)
Step 23 - endinorder()
Step 24 - void inorder(node R)
Step 25 - if R==null goto step 26 else goto step 27
Step 26 - return 
Step 27 - inorder(R.left)
Step 28 - print R.a+", "
Step 29 - inorder(R.right)
Step 30 - endif
Step 31 - endinorder(node R)
Step 32 - endclassbtree
Step 33 - class d
Step 34 - btree b1=new btree()
Step 35 - Scanner s=new Scanner(System.in)
Step 36 - println "Enter number of values-"
Step 37 - input n
Step 38 - for i=1 to n inc 1
Step 39 - b1.add(input value)
Step 40 - b1.inorder()
Step 41 - endfor
Step 42 - endclass btree_linkedlist
Step 43 - end