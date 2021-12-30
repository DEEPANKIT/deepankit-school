Step - 1   class Product()
Step - 2   Product(String n,int c,double p)
Step - 3   name=n
Step - 4   code=c
Step - 5   amount=p
Step - 6   end Product()
Step - 7   show()
Step - 8   print("Name- "+name)
Step - 9   print("Code- "+code)
Step - 10  print("Amount- "+amount)
Step - 11  end show()
Step - 12  end class Product()
Step - 13  class Sales() extends Product
Step - 14  Sales(String n,int c,double p,int d)
Step - 15  super(n,c,p)
Step - 16  day=d
Step - 17  tax=totamt=0.0
Step - 18  end Sales()
Step - 19  compute()
Step - 20  tax=(12.4*amount)/100
Step - 21  if day>30 then goto Step - 22 else goto Step - 24
Step - 22  tax+=2.5*amount/100;
Step - 23  end if
Step - 24  totamt=amount+tax;
Step - 25  end compute()
Step - 26  show()
Step - 27  super.show()
Step - 28  print("total amount-"+totamt);
Step - 29  end show()
Step - 30  main(String hjk[])
Step - 31  print("Enter name, code ,amount and days taken to pay")
Step - 32  input name
Step - 33  input code
Step - 34  input amount
Step - 35  input day
Step - 36  Sales o1=new Sales(name,code,amount,day)
Step - 37  o1.compute()
Step - 38  o1.show()
Step - 39  end main()
Step - 40  end class Sales()