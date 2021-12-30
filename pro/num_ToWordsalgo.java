Step 1  void twoDigits(int number)
Step 2  if number==0 goto step 9 else if number<10 goto step 3 else if number>10 and <20 goto step 5 else goto step 7
Step 3  OutputString+=units[0][number-1]+" "
Step 4  goto step 9
Step 5  OutputString t=units[2][number-11]+" "
Step 6  goto step 9
Step 7  OutputString+=units[1][number/10-1]+" "
Step 8  twoDigits(number%10)
Step 9  endif
Step 10 end twoDigits(number)
Step 11 main()
Step 12 inputNumber=sc.nextInt()
Step 13 if inputNumber==0 goto step 14 else goto step 16
Step 14 outputString="zero"
Step 15 goto step 39
Step 16 int i,j=0
Step 17 partsLength=(number.length()-3)/2+1
Step 18 if number.length()%2==0 goto step 19 
Step 19 partsLength++
Step 20 end if
Step 21 int parts[]=new int[partsLength]
Step 22 parts[j++]=inputNumber%1000
Step 23 inputNumber/=1000
Step 24 while(inputNumber!=0)
Step 25 parts[j++]=inputNumber%1000
Step 26 end while
Step 27 for(i=parts.length;i>=0;i--)
Step 28 if i==0 goto step 29 else goto step 33
Step 29 twoDigits(parts[i]/100)
Step 30 outputString+=units[3][i]+" "
Step 31 twoDigits(parts[i]%100)
Step 32 goto step 37
Step 33 if(parts[i]!=0)
Step 34 twoDigits(parts[i])
Step 35 outputString+=units[3][i]+" "
Step 36 end if
Step 37 end if
Step 38 goto step 39
Step 39 end if
Step 40 end