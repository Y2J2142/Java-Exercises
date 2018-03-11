import java.lang.*;
import java.lang.String;
import java.lang.Integer;
import java.lang.IllegalArgumentException;
import java.lang.NumberFormatException;
import java.util.Scanner;


public class SubString
{


    public static void main(String[] args)
    {
        try{

        
            String string;
            int a, b;
            Scanner scanner = new Scanner(System.in);
            try{
            string = scanner.nextLine();
            
                a = Integer.parseInt(scanner.nextLine());
                b = Integer.parseInt(scanner.nextLine());        
                scanner.close();
                if(b > string.length()-1 || a < 0 || b < a)
            {
                throw new IllegalArgumentException();
            }
            else
                System.out.println(string.substring(a, b+1));

            }catch(NumberFormatException e) {e.printStackTrace();}
        }catch(IllegalArgumentException e) {e.printStackTrace();}

    }



}