Step 1  main 
Step 2  DataInputStream z1 = new DataInputStream(System.in);
Step 3  input s1,s2
Step 4  l1=s1.length();
Step 5  l2 = s2.length();
Step 6  if (l1 < l2) then goto Step 7 else goto 9
Step 7  print "Invalid Input"
Step 8  System.exit(0);
Step 9  for x=0 to l1-l2 inc +1 
Step 10  for y=-20 to 100 inc +1
Step 11  if (s1.charAt(x) == (char)(s2.charAt(0) + y))
Step 12  count++
Step 13  for z=1 to l2 inc++
Step 14  if (s1.charAt(x + z) == (char)(s2.charAt(z) + y))
Step 15  count++
Step 16  else
Step 17  break
Step 18  end if
Step 19  end for
Step 20  if (count == l2)
Step 21  break
Step 22  else
Step 23  count =0;
Step 24  end for
Step 25  if (y != 101)
Step 26  break;
Step 27  end for
Step 28  if (y != 101) then goto Step 29 else goto 31
Step 29  for x=0 to l1 inc +1
Step 30  print (char)(s1.charAt(x) - y)
Step 31  else 
Step 32  print "The encoding variable is out of range"
Step 33  end main