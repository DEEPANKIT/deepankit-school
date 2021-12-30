Step 1   a=0
Step 2   s=""
Step 3   arr[][]=new int[9][9]
Step 4   print "enter a sudoku"
Step 5   for i 0 to <9 inc=+1
Step 6   input s
Step 7   j=0
Step 8   for x 0 to <s.length() inc=+1
Step 9   c=s.charAt(x)
Step 10  if(Character.isDigit(c)) goto step 11 and 12
Step 11  ar[i][j]=Integer.parseInt(""+c)
Step 12  j++  
Step 13  end for step 8
Step 14  end for step 5
Step 15  for x 0 to <9 inc=+1
Step 16  for z 1 to 9 inc=+1
Step 17  for y 0 to <9 inc=+1 
Step 18  if(ar[x][y]==z) goto step 19 and 20
Step 19  a++
Step 20  break
Step 21  end for step 17   
Step 22  end for step 16
Step 23  if(a!=9) goto step 24 and 25
Step 24  s="invalid"       
Step 25  break 
Step 26  a=0
Step 27  end for step 15
Step 28  for x 0 to <9 inc=+1
Step 29  for z 1 to 9 inc=+1
Step 30  for y 0 to <9 inc=+1 
Step 31  if(ar[y][x]==z) goto step 32 and 33
Step 32  a++
Step 33  break
Step 34  end for step 28   
Step 35  end for step 29
Step 36  if(a!=9) goto step 37 and 38
Step 37  s="invalid"       
Step 38  break 
Step 39  a=0
Step 40  end for step 30
Step 41  for l 0 to 6 inc=+3  
Step 42  for b 0 to 6 inc=+3
Step 43  l1=l+3
Step 44  b1=b+3
Step 45  for z 1 to 9 inc=+1
Step 46  for x l to <l1 inc=+1
Step 47  for y b to <b1 inc=+1
Step 48  if(ar[x][y]==z) goto step 49 and 50
Step 49  a++
Step 50  break
Step 51  end for step 47
Step 52  if(y<b) goto step 53
Step 53  break
Step 54  end for step 46
Step 55  end for step 45
Step 56  if(a!=9) goto step 57 and 58
Step 57  s="invalid"
Step 58  break 
Step 59  a=0
Step 60  end for step 42
Step 61  end for step 41
Step 62  if(s.equalsIgnoreCse("invalid")) goto step 53 else goto step 64
Step 63  print s
Step 64  print "valid"
Step 65  end

  