Step 1   CircularQueue(int size)
Step 2   a=new int[size]
Step 3   f=r=-1
Step 4   max=size
Step 5   void push(int p)
Step 6   if(f==0 && r==max-1|| f==r+1) goto step 7 else goto step 8
Step 7   print "overflow"
Step 8   if(f==-1) goto step 9
Step 9   f=0;
Step 10  r=(r+1)%max
Step 11  a[r]=p
Step 12  end push(int p)
Step 13  int pop()
Step 14  if(f==-1)
Step 15  return -9999
Step 16  n=a[f];
Step 17  if(f==r) goto step 17 else goto step 18 
Step 18  f=r=-1
Step 19  f=(f+1)%max
Step 20  return n
Step 21  end pop()   
Step 22  int peek()
Step 23  if(f==-1) goto step 22 else goto step 23
Step 24  return -9999        
Step 25  return a[f]
Step 26  end peek()
Step 27  main()
Step 28  print "enter size"
Step 29  q=new Circularqueue(input size)
Step 30  do
Step 31  print"1 - Push\n2 - Pop\n3 - Peek\n4 - Exit"
Step 32  input ch
Step 33  case 1
Step 34  print "element to be pushed"
Step 35  input w
Step 36  q.push(w)
Step 37  break
Step 38  case 2
Step 39  w=q.pop()
Step 40  if(w==-9999) goto step 38 else goto step 39
Step 41  print "underflow"
Step 42  print "elememt popped"+w
Step 43  break
Step 44  case 3
Step 45  w=q.peek()
Step 46  if(w==-9999) goto step 44 else goto step 45
Step 47  print "underflow"
Step 48  print "element peeked is"+w
Step 49  break
Step 50  case 4
Step 51  default
Step 52  print "invalid choice"
Step 53  while(ch!=4)
Step 54  end dowhile
Step 55  end