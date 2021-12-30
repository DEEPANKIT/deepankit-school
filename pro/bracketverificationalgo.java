Step 1: BracketVerification(int size)
Step 2: a = new char[size]
Step 3: tos= -1
Step 4: main()
Step 5: print "Enter the bracket expression"
Step 6: input s
Step 7: l=s.length()
Step 8: for (x = 0; x < l; x++)
Step 9: c stores character - c=s.charAt(x)
Step 10: if (c == '[' || c == '{' || c == '(')
Step 11: s1.push(c)
Step 12: end if at step 10
Step 13: if (c == ']' || c == '}' || c == ')')
Step 14: c1 = s1.pop()
Step 15: end if at step 12
Step 16: if (c1 == '{') & also if (c != '}') then goto Step 17
Step 17: if (c1 == '[')& also if (c != ']') then goto Step 17
Step 18: if (c1 == '(') & also if (c != ')') then goto Step 17
Step 19: end of for at step 8
Step 20: if (x == l && tos == -1) then print("VALID")
Step 21: else print print("INVALID")
Step 22: end main
Step 23: push(char t)
Step 24: if (tos == a.length - 1) then print("")
Step 25: else a[++tos] = t;
Step 26: end push()
Step 27: pop()
Step 28: if (tos == -1) then return 'F'
Step 29: else return a[tos--]
Step 30: end pop
Step 31: isEmpty()
Step 32: if (tos == -1) then return true
Step 33: else return false
Step 34: end isEmpty()
Step 35: end class