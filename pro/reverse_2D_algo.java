Step-1   MatRev(int mm, int nn)
Step-2   m=mm
Step-3   n=nn
Step-4   arr=new int[m][n]
Step-5   End MatRev(int mm, int nn)
Step-6   fillarray()
Step-7   i=0
Step-8   j=0
Step-9   Print "ENTER ALL THE ELEMENTS OF ARRAY"
Step-10  for i=0 to i<m inc=+1
Step-11  for j=0 to j<n inc=+1
Step-12  Input arr[i][j]
Step-13  End for
Step-14  End for
Step-15  return
Step-16  End fillarray()
Step-17  reverse(int x)
Step-18  p=0
Step-19  if x<10 return else go to Step-20
Step-20  while(x!=0)
Step-21  p=p*10+(x%10)
Step-22  x=x/10
Step-23  End while
Step-24  return p to Step-31
Step-25  End reverse(int x)
Step-26  revMat(MatRev p)
Step-27  i=0
Step-28  j=0
Step-29  for i=0 to i<m inc=+1
Step-30  for j=0 to j<m inc=+1
Step-31  this.arr[i][j]=reverse(p.arr[i][j])
Step-32  End revMat(MatRev p)
Step-33  show()
Step-34  s="%"+10+"d"
Step-35  i=0
Step-36  j=0
Step-37  for i=0 to i<m inc=+1
Step-38  for j=0 to j<n inc=+1
Step-39  printf s,arr[i][j]
Step-40  End show()
Step-41  main(String ar[])
Step-42  print "ENTER ROW AND COLUMNS"
Step-43  input r
Step-44  input c
Step-45  MatRev x1=new MatRev(r,c)
Step-46  MatRev x2=new MatRev(r,c)
Step-47  x1.fillarray()
Step-48  print "ORIGINAL ARRAY"
Step-49  x1.show()
Step-50  x2.revMat(x1)
Step-51  print "REVERSED ARRAY"
Step-52  x2.show()
Step-53  End main(String ar[])
Step-54  End