Step 1: main(String args[])
Step 2: print ("\n" + "Enter the number of elements in the array")
Step 3: input n 
Step 4: print ("\n" + "Enter " + n + " numbers")
Step 5: input s
Step 6: [] l = s.split(" ", 0)
Step 7: for (x = 0; x < n; x++)
Step 8: arr[x] = Integer.parseInt(l[x])
Step 9: end for at step 7
Step 10: for (x = 0; x < n; x++)
Step 11: pos[x] = x
Step 12: end for at step 10
Step 13: for (i = 0; i < n; i++)
Step 14: x = arr[i] & p = i
Step 15: for (j = i + 1; j < n; j++)
Step 16: if (x > arr[j]) then goto step 17
Step 17:  x = arr[j] & p = j
Step 18: end if at step 16
Step 19: end for at step 15
Step 20: y = arr[i]
Step 21: arr[i] = arr[p]
Step 22: arr[p] = y
Step 23: t = pos[i]
Step 24: pos[i] = pos[p]
Step 25: pos[p] = t
Step 26: end for at step 13
Step 27: for (x = 0; x < n; x++)
Step 28: for (y = x; y < n - 1; y++)
Step 29: if (arr[y] == (arr[y + 1] - 1))
Step 30: if (pos[x] < pos[y + 1])
Step 31: print("(" + (pos[x] + 1) + "," + (pos[y + 1] + 1) + ")")
Step 32: else goto step 33
Step 33: print ("(" + (pos[y + 1] + 1) + "," + (pos[x] + 1) + ")")
Step 34: if (y == x)
Step 35: print("   ")
Step 36: else goto step 37
Step 37: print("(t)   ")
Step 38: count++
Step 39: end if at step 29
Step 40: else if(arr[y] == arr[y + 1]) goto step 41
Step 41: goto step 28
Step 42: else goto 43
Step 43: goto step 44
Step 44: end for at step 28
Step 45: end for at step 27
Step 46: print ("\n" + "\n" + "Total number of Pair of Indices:  " + count + "\n")
Step 47: end main()
Step 48: end class 