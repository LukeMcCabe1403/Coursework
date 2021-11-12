package Coursework;
import java.util.Scanner;

class Dec2Hex
{

    public static int Arg1;

public static String Convert(String args[])
{

        Arg1 = Integer.parseInt(args[0]);
        char ch[]={'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'};
        int rem, num;
        num = Arg1;
        String hexadecimal="";
        System.out.println("Converting the Decimal Value " + num + " to Hex...");

        while(num != 0)
        {
            rem=num%16;
            hexadecimal= ch[rem] + hexadecimal;
            num= num/16;
        }

        return hexadecimal;

}

    public static boolean validNumber(int Arg1)
    {
    
        if(Arg1 < 0)
        {
        
            System.out.println("Error: Number is not a positive number");
            return false;
        
        }
        return true;
    
    }

    public static void main(String args[])
    {

    String result = Convert(args);

    System.out.println("Hexadecimal representation is: " + result);


    }


}

