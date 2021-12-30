Step 1: main(String args[])
Step 2: print ("Enter the DIMENSIONS of the FIELD")
Step 3: input tem
Step 4: l = Integer.parseInt(tem.charAt(0) + "")
Step 5: b = Integer.parseInt(tem.charAt(2) + "")
Step 6: arr = new String[l][b] & exp = new int[l * b][2] & blast = new int[l * b][2] & temp = new String[l]
Step 7: print ("Enter the SURFACE TYPE of the field ROW WISE")
Step 8: for (x = 0; x < l; x++)
Step 9: input temp[x]
Step 10: end for
Step 11: print("Enter the COORDINATES where the bomb was dropped")
Step 12: input tem
Step 13: l1 = Integer.parseInt(tem.charAt(0) + "")
Step 14: b1 = Integer.parseInt(tem.charAt(2) + "")
Step 15: for (x = 0; x < l; x++)
Step 16: separate the words in temp[x] by ","- st = new StringTokenizer(temp[x], ",")
Step 17: for (y = 0; y < b; y++)
Step 18: arr[x][y] = st.nextToken() & goto at step 19
Step 19: end for at step 15
Step 20: blast[0][0] = l1 & blast[0][1] = b1 & exp[0][0] = l1 & exp[0][1] = b1
Step 21: check = 0
Step 22: if (arr[l1][b1].equals("W")) then check++
Step 23: for (x = 1; x < l * b; x++)
Step 24: for (y = 0; y < 2; y++)
Step 25: blast[x][y] = l * b
Step 26: exp[x][y] = l * b
Step 27: end for at step 23 and step 24
Step 28: x = 0 & y = 1
Step 29: while (blast[x][0] != l * b && blast[x][1] != l * b)
Step 30: if ((blast[x][0] - 1) >= 0 && (blast[x][0] - 1) < l && (blast[x][1]) >= 0 && (blast[x][1]) < b)
Step 31: if ((arr[blast[x][0] - 1][blast[x][1]]).equals("L"))
Step 32: then for (z = 0; z < y; z++)
Step 33: if (blast[z][0] == (blast[x][0] - 1) && blast[z][1] == blast[x][1]) then goto step 35
Step 34: if (exp[z][0] == (blast[x][0] - 1) && exp[z][1] == (blast[x][1])) then goto step 35
Step 35: end for at step 32
Step 36: if (y == z) then blast[y][0] = blast[x][0] - 1 & blast[y][1] = blast[x][1] & y++
Step 37: if ((blast[x][0]) >= 0 && (blast[x][0]) < l && (blast[x][1] - 1) >= 0 && (blast[x][1] - 1) < b)
Step 38: if ((arr[blast[x][0]][blast[x][1] + 1]).equals("L"))
Step 39: for (z = 0; z < y; z++)
Step 40: if (blast[z][0] == blast[x][0] && blast[z][1] == (blast[x][1] + 1)) then goto step 42
Step 41: if (exp[z][0] == (blast[x][0]) && exp[z][1] == (blast[x][1] + 1)) then goto step 42
Step 42  end for at step 39
Step 43: if (y == z) then  blast[y][0] = blast[x][0] & blast[y][1] = blast[x][1] + 1 & y++
Step 44  end if at step 38
Step 45: if ((blast[x][0] + 1) >= 0 && (blast[x][0] + 1) < l && (blast[x][1]) >= 0 && (blast[x][1]) < b)
Step 46: if ((arr[blast[x][0] + 1][blast[x][1]]).equals("L"))
Step 47: for (z = 0; z < y; z++)
Step 48: if (blast[z][0] == (blast[x][0] + 1) && blast[z][1] == blast[x][1]) then goto 50
Step 49: if (exp[z][0] == (blast[x][0] + 1) && exp[z][1] == (blast[x][1])) then goto 50
Step 50: end for at step 47
Step 51: if (y == z) then  blast[y][0] = blast[x][0] + 1 & blast[y][1] = blast[x][1] & y++
Step 52: end if at step 44
Step 53: exp[x][0] = blast[x][0] & exp[x][1] = blast[x][1] & x++
Step 54: end while at step 29
Step 55: if (check != 0) then print("YOU DROPPED THE BOMB OVER WATER!!!")
Step 56: if (check == 0) then 
Step 57: for (x = 0; x < l; x++)
Step 58: for (y = 0; y < b; y++)
Step 59: print(arr[x][y] + "   ")
Step 60: end for at step 54
Step 61: for (x = 0; x < l; x++)
Step 62: for (y = 0; y < b; y++)
Step 63: for (z = 0; z < l * b; z++)
Step 64: if (exp[z][0] == x && exp[z][1] == y) then arr[x][y] = "B"
Step 65: end of for at steps 58,59,60
Step 66: if (check == 0)
Step 67: for (x = 0; x < l; x++)
Step 68: for (y = 0; y < b; y++)
Step 69: print(arr[x][y] + "   ")
Step 70:end for 
Step 71:end if 
Step 72:end main