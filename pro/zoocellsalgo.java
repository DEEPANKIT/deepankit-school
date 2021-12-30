Step 1  main 
Step 2  DataInputStream dr=new DataInputStream(System.in) 
Step 3  input cell
Step 4  int x1[]=new int[cell] 
Step 5  int y1[]=new int[cell] 
Step 6  int x2[]=new int[cell] 
Step 7  int y2[]=new int[cell] 
Step 8  String loc[]=new String[cell] 
Step 9  for x=0 to cell inc +1
Step 10  loc[x]=dr.readLine()    
Step 11  int length=loc[x].length() 
Step 12  while(loc[x].charAt(l)!=',')
Step 13  X1=X1+loc[x].charAt(l) 
Step 14  l=l+1 
Step 15  end while
Step 16  x1[x]=Integer.parseInt(X1);
Step 17  l=l+1;
Step 18  while(loc[x].charAt(l)!=' ')
Step 19  Y1=Y1+loc[x].charAt(l);
Step 20  l=l+1;
Step 21  end while
Step 22  y1[x]=Integer.parseInt(Y1);
Step 23  l=l+1;
Step 24  while(loc[x].charAt(l)!=',')
Step 25  X2=X2+loc[x].charAt(l);
Step 26  l=l+1;
Step 27  end while
Step 28  x2[x]=Integer.parseInt(X2);
Step 29  l=l+1;
Step 30  while(l<length)
Step 31  Y2=Y2+loc[x].charAt(l);
Step 32  l=l+1;
Step 33  end while
Step 34  y2[x]=Integer.parseInt(Y2);
Step 35  l=0;
Step 36  if(x1[x]>x2[x]&&y1[x]>y2[x]) then goto Step 37 else go to Step 40 
Step 37  r1=x1[x];
Step 38  x1[x]=x2[x];
Step 39  x2[x]=r1;
Step 40  end if
Step 41  if(x1[x]>x2[x]&&y2[x]>y1[x]) then goto Step 42 else go to Step 47
Step 42  r1=x1[x];
Step 43  r2=y1[x];
Step 44  x1[x]=x2[x]
Step 45  y1[x]=y2[x];
Step 46  x2[x]=r1;
Step 47  end if
Step 48  if(x2[x]>x1[x]&&y2[x]>y1[x]) then goto Step 49 else go to Step 52 
Step 49  r1=y1[x];
Step 50  y1[x]=y2[x];
Step 51  y2[x]=r1;
Step 52  end if
Step 53  sum1=sum1+(int)(((Math.abs(y2[x]-y1[x]))-1)*((Math.abs(x2[x]-x1[x]))-1));  
Step 54  sum2=sum2+(int)((Math.abs(y2[x]-y1[x])+1)*(Math.abs(x2[x]-x1[x])+1));
Step 55  end for
Step 56  String inner[]=new String[sum1+sum2];
Step 57  for x=0 to cell inc +1
Step 58  for a=x1[x]+1 to x2[x]-1 inc +1
Step 59  for b=y1[x]-1 to y2[x]-1 inc -1
Step 60  inner[pos] = "" + a + b
Step 61  pos++;
Step 62  end for
Step 63  end for
Step 64  end for
Step 65  for x=0 to cell inc +1
Step 66  for a=x1[x] to x2[x] inc +1
Step 67  for b=y1[x] to y2[x] inc -1 
Step 67  inner[pos] = "" + a + b;
Step 68  pos++;
Step 69  end for
Step 70  end for
Step 71  end for
Step 72  for x=0 to sum1 inc +1
Step 73  for y=0 to sum1+sum2 inc +1
Step 74  if (inner[x].equals(inner[y])) then goto Step 75 else go to Step 76
Step 75  check = check + 1;
Step 76  end for
Step 77  end for
Step 78  if (check == (sum1 * 2)) then goto Step 79 else go to Step 80
Step 79  print "Valid Data"
Step 80  print "Invalid Data" 
Step 81  end main














