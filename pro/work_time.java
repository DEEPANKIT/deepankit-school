import java.util.*;

class Time {
  public static void main(String at[]) {
    Scanner sc = new Scanner(System.in); // creating an object of the scanner class
    System.out.print("Enter first time  = ");
    String a = sc.nextLine(); // inputting the first time
    System.out.print("Enter second time = ");
    String b = sc.nextLine(); // inputting the second time
    String k1[] = a.split(":");
    String k2[] = b.split(":");
    int sec1 = Integer.parseInt(k1[0]) * 3600 + Integer.parseInt(k1[1]) * 60 + Integer.parseInt(k1[2]); // converting
                                                                                                        // the 1st time
                                                                                                        // into seconds
    int sec2 = Integer.parseInt(k2[0]) * 3600 + Integer.parseInt(k2[1]) * 60 + Integer.parseInt(k2[2]); // converting
                                                                                                        // the 2nd time
                                                                                                        // into seconds
    int sec;
    if (sec2 > sec1) // checking if the 2nd time is greater or not
      sec = sec2 - sec1; // calculating the time diff in seconds
    else
      sec = 3600 * 24 + sec2 - sec1;
    int hrs, min, sec3;
    hrs = sec / 3600;
    min = (sec % 3600) / 60;
    sec3 = sec % 60;
    System.out.println();
    System.out.print("Total time difference = "); // from here the printing the time difference takes place
    if ((hrs + "").length() != 2)
      System.out.print("0" + hrs + ":");
    else
      System.out.print(hrs + ":");
    if ((min + "").length() != 2)
      System.out.print("0" + min + ":");
    else
      System.out.print(min + ":");
    if ((sec3 + "").length() != 2)
      System.out.print("0" + sec3);
    else
      System.out.print(sec3);
  }
}