import java.util.*;
class Ring{
    int []Arr;
    int N;

    Ring(int N){
        //to initialize data members
        this.N = N;
        Arr = new int[N];
    }
    
    public void getnum(){
        //to read N numbers from the user 
        System.out.println("Enter N numbers");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the values separated by ',' ");
        String str = sc.nextLine();
        StringTokenizer st = new StringTokenizer(str,",");
        int i=0;
        while(st.hasMoreTokens()){
            try {
                Arr[i] = Integer.parseInt(st.nextToken());
            } catch (Exception e) {
                System.out.println("Invalid inputs entered");
                break;
            }
            i++;
        }
    }
    public void print(){
        //checks if the given number forms a ring or not and displays a relevant message
        boolean checker = true;
        if(Arr[N/2]==0){
            int start=0,end=N-1;
            outer:while(start<=N/2 || end>=N/2){
                if(((int)Math.abs(Arr[start])==Arr[end]))
                 {
                     start++;
                     end--;
                 }
                 else{
                     checker = false;
                     break outer;
                 }
            }
        }
        else
        checker = false;

        if(checker)
        System.out.println("The Input forms a ring");
        else
        System.out.println("The Input does not form a ring");
    }
   
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no. of values- ");
        Ring obj = new Ring(sc.nextInt());
        obj.getnum();
        obj.print();
    }
}