Step 1  main
Step 2  DataInputStream z = new DataInputStream(System.in);
Step 3  input s1,s2
Step 4  l1 = s1.length();
Step 5  l2 = s2.length();
Step 6  k1 = s1.toCharArray();
Step 7  k2 = s2.toCharArray();
Step 8  int ll1 = l1, ll2 = l2;
Step 9  String arr[] = new String[l1];
Step 10  for x=0 t0 l1 inc +1
Step 11  arr[x] = "";
Step 12  int check = 0, crosscheck = 0;
Step 13  for x=0 to ll1-ll2 inc +1
Step 14  for i=0 to l1 inc i++
Step 15  for j=0 to l2 inc j++
Step 16  if (k1[i] == k2[j] || k1[i] == (char)(k2[j] + 32) || k1[i] == (char)(k2[j] - 32))
         then go to Step 17 else go to step 21
Step 17  arr[x] = arr[x] + k1[i];
Step 18  k2[j] = '\u0000';
Step 19  check++;
Step 20  break;
Step 21  end if
Step 22  if (crosscheck != 0 && check != 0) 
Step 23  if (crosscheck == check)
Step 24  arr[x] = arr[x] + k1[i];
Step 25  crosscheck = check;
Step 26  if (check == k2.length) then go to Step 27 else go to step 28
Step 27  break;
Step 28  end for
Step 29  if (check != k2.length) then go to Step 30 else go to step 31
Step 30  arr[x] = "";
Step 31  check = 0;
Step 32  crosscheck = 0;
Step 33  sb = new StringBuffer(s1);
Step 34  sb.deleteCharAt(0);
Step 35  s1 = sb.toString();
Step 36  k1 = s1.toCharArray();
Step 37  k2 = s2.toCharArray();
Step 38  l1 = s1.length();
Step 39  l2 = s2.length();
Step 40  end for
Step 41  s = arr[0];
Step 42  for x=0 to x<= ll1-ll2 inc +1
Step 43  if (arr[x].equals("")) then go to Step 44 else go to step 45
Step 44  continue;
Step 45  if (arr[x].length() < s.length()) then go to Step 46 else go to step 47
Step 46  s = arr[x];
Step 47  end for
Step 48  if (s.equals(""))
Step 49  print "NO  POSSIBLE SUBSTRING WAS FOUND"
Step 50  else
Step 51  print "Your Substring:    " + s 
Step 52  end main






