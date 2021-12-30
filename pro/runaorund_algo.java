Step 1 main()
Step 2 Scanner sc=new Scanner(System.in)
Step 3 input a number
Step 4 t=0
Step 5 while a!=0
Step 6 a=a/10
Step 7 t++
Step 8 end of while
Step 9 a=n
Step 10 arr=new int[t][2]
Step 11 for(i=t-1;i>=0;i–-)
Step 12 ar[i][0]=a%10
Step 13 a=a/10
Step 14 end of for
Step 15 p=0
Step 16 for(i=0;i<t;i++)
Step 17 if p>=t
Step 18 while p>=t
Step 19 p=p-t
Step 20 end of while
Step 21 end of if
Step 22 if ar[p][1] =1
Step 23 break
Step 24 end of if
Step 25 ar[p][1]=1
Step 26 p=p+ar[p][0]
Step 27 end of for
Step 28 for(i=0;i<t;i++)
Step 29 if ar[i][1]!=1
Step 30 break
Step 31 end of if
Step 32 end of for
Step 33 if i=t
Step 34 print runaround number
Step 35 else
Step 36 print not a runaround number
Step 37 end 
