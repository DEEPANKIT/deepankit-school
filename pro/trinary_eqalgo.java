Step 1	DeciTri()
Step 2	n=0
Step 3	tri=0
Step 4	getnum(nn)
Step 5	n=nn;
Step 6	deci_tri()
Step 7	t=n
Step 8	c=0
Step 9	s=0
Step 10	while t!=0
Step 11	m=t%3
Step 12	s=s+(m*Math.pow(10,c))
Step 13	t=t/3
Step 14	c++
Step 15	endwhile
Step 16	tri=s
Step 17	show()
Step 18	print n
Step 19	deci_tri()
Step 20	print tri
Step 21	main()
Step 22	input n1
Step 23	DeciTri obj=new DeciTri()
Step 24	obj.getnum(n1)
Step 25	obj.show()
Step 26	end