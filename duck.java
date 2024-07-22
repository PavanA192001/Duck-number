
import java.util.Scanner;

public class duck {
    public static void main(String[] args) {
        boolean flag=false;
        Scanner s=new Scanner(System.in); 
        int num=s.nextInt();//accepting the input from user
        while (num!=0) //travsersing the all digits in number
        {
          int rem=num%10;
          if (rem==0)
        {
            flag= true; // if the digit is 0 then flag will change to true
            break;   
          }  
          num/=10;
        }
        System.out.println(flag==true?"duck No":"Not duck");
    }
    
}