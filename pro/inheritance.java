
/*define a superclass Product to store the details of a product sold by a wholesaler to a retailer. Define a subclass Sales to compute the total amount paid by the retailer with or without fine along with service tax.
Some of the members of both classes are given below:
Class name: Product
Data members/instance variables:
name: stores the name of the product
code: integer to store the product code
amount: stores the total sale amount of the product (in decimals)
Member functions/methods:
Product (String n, int c, double p): parameterized constructor to assign data members: name = n, code = c and amount = p
void show(): displays the details of the data members
Class name: Sales
Data members/instance variables:
day: stores number of days taken to pay the sale amount
tax: to store the sen ice tax (in decimals)
totamt: to store the total amount (in decimals)
Member functions/methods:
Sales(….): parameterized constructor to assign values to data members of both the classes
void compute(): calculates the service tax @ 12.4% of the actual sale amount
calculates the fine @ 2.5% of the actual sale amount only if the amount paid by the retailer to the wholesaler exceeds 30 days calculates the total amount paid by the retailer as (actual sale amount + service tax + fine)
void show (): displays the data members of the superclass and the total amount
main(): inputs required data and prints the total amount
*/
import java.util.*;

class Product // base class
{
    protected String name;
    protected int code;
    protected double amount;

    public Product(String n, int c, double p) { // parameterized constructor
        name = n;
        code = c;
        amount = p;
    }

    public void show() {
        System.out.println("Name- " + name);
        System.out.println("Code- " + code);
        System.out.println("Amount- " + amount);
    }
}
// child class
class Sales extends Product 
{
    private int day;
    private double tax, totamt;

    public Sales(String n, int c, double p, int d) {
        super(n, c, p);
        day = d;
        tax = totamt = 0.0;
    }

    public void compute() {
        tax = (12.4 * amount) / 100;
        if (day > 30)
            tax += 2.5 * amount / 100;
        totamt = amount + tax;
    }

    public void show() {
        super.show(); 
        // calling show function of parent class
        System.out.print("Total amount-" + totamt);
    }

    public static void main(String hjk[]) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter name, code ,amount and days taken to pay");
        String name = s.nextLine();
        int code = s.nextInt();
        double amount = s.nextDouble();
        int day = s.nextInt();
        Sales o1 = new Sales(name, code, amount, day);
        o1.compute();
        // function overriding
        o1.show();
    }
}// end of class