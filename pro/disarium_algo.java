Step 1  disarium(int nn)
Step 2  num=nn
Step 3  size=0
Step 4  end disarium(int nn)
Step 5  void countDigit()
Step 6  int temp=num
Step 7  while (temp!=0)
Step 8  size++
Step 9  temp=temp/10
Step 10  end while
Step 11  end void countDigit()
Step 12  int sumOfDigits(int n,int p)
Step 13  if (n==0) then go to step 15 else go to step 16
Step 14  return 0
Step 15  return (int)(Math.pow(n%10,p--))+sumOfDigits(n/10,p)
Step 16  end sumOfDigits(int n,int p)
Step 17  void check()
Step 18  call countDigit()
Step 19  if(sumOfDigits(num,size)==num) then go to step 21 else step 22
Step 20  print ("It is a disarium number")
Step 21  print ("It is not a disarium number")
Step 22  end void check()
Step 23  main 
Step 24  input n
Step 25  disarium d1=new disarium(n)
Step 26  d1.check();
Step 27  end main