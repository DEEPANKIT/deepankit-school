import java.util.*;

public class Encrypt {
    private String Message,Enc_Msg;

    public void input()
    {
        Scanner sc=new Scanner(System.in);
        Message = sc.nextLine(); // taking input from the user

        Enc_Msg = encode(Message);
    }
    public String encode(String s){
        s=s.toLowerCase();
        // breaking the string in words
        StringTokenizer st = new StringTokenizer(s); 
        String str="";
        while(st.hasMoreTokens()){
            String token = st.nextToken();
            String newToken="";
            for(int i=0;i<token.length();i++){
                int ascii = (int)(token.charAt(i))+13; // shifting the alphabet in ascii
                // if ascii exceeds the ascii of z then starting from ascii of a
                if(ascii>122) 
                {
                    ascii= (ascii-122)+96;
                }
                 // adding the shifted character to form a word
                newToken+=(char)ascii;
        
            }
            // adding the words to form the required Encrypted msg
            str+=newToken+" "; 
        }
        return str;
    }
    public void display(){
        System.out.println("Original String-- "+Message+"\nEncryted String-- "+Enc_Msg);
    }
    public static void main(String[] args) {
        Encrypt obj = new Encrypt();
        obj.input();
        obj.display();
        

    }
}
